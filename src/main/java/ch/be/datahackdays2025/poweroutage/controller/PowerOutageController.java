package ch.be.datahackdays2025.poweroutage.controller;

import ch.be.datahackdays2025.poweroutage.apispec.api.PoweroutageApi;
import ch.be.datahackdays2025.poweroutage.apispec.model.PowerOutageReport;
import ch.be.datahackdays2025.poweroutage.apispec.model.PowerOutageReportAffectedAreasInner;
import ch.be.datahackdays2025.poweroutage.apispec.model.PowerOutageReportAffectedAreasInnerCoordinates;
import ch.be.datahackdays2025.poweroutage.entity.AffectedArea;
import ch.be.datahackdays2025.poweroutage.entity.Coordinates;
import ch.be.datahackdays2025.poweroutage.entity.Poweroutage;
import ch.be.datahackdays2025.poweroutage.repository.PowerOutageRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
public class PowerOutageController implements ch.be.datahackdays2025.poweroutage.apispec.api.PoweroutageApi {

    private final PowerOutageRepository powerOutageRepository;

    public PowerOutageController(PowerOutageRepository powerOutageRepository) {
        this.powerOutageRepository = powerOutageRepository;
    }

    @Override
    public ResponseEntity<Void> reportPowerOutage(PowerOutageReport powerOutageReport) {
        Poweroutage entity = Poweroutage.builder()
                .gridOperator(powerOutageReport.getGridOperator())
                .outageType(String.valueOf(powerOutageReport.getOutageType()))
                .description(powerOutageReport.getDescription())
                .startTime(powerOutageReport.getStartTime())
                .estimatedEnd(powerOutageReport.getEstimatedEnd())
                .status(String.valueOf(powerOutageReport.getStatus()))
                .affectedAreas(convertAreas(powerOutageReport.getAffectedAreas()))
                .affectedCustomers(powerOutageReport.getAffectedCustomers())
                .reportSource(powerOutageReport.getReportSource())
                .lastUpdate(powerOutageReport.getLastUpdate())
                .build();
        powerOutageRepository.save(entity);
        return ResponseEntity.ok().build();
    }

    private List<AffectedArea> convertAreas(@NotNull @Valid List<PowerOutageReportAffectedAreasInner> affectedAreas) {
        return affectedAreas.stream()
                .map(area -> AffectedArea.builder()
                        .name(area.getName())
                        .coordinates(converCoordinates(area.getCoordinates()))
                        .build())
                .collect(Collectors.toCollection(ArrayList::new)); // Sicherstellen, dass die Liste veränderlich ist
    }

    private Coordinates converCoordinates(@Valid PowerOutageReportAffectedAreasInnerCoordinates coordinates) {
        return Coordinates.builder()
                .latitude(coordinates.getLatitude())
                .longitude(coordinates.getLongitude())
                .build();
    }

    @Override
    public ResponseEntity<List<PowerOutageReport>> getAllPowerOutages() {
        return ResponseEntity.ok(ReportConverter.fromEntity(powerOutageRepository.findAll()));
    }

    @Override
    public ResponseEntity<PowerOutageReport> updatePowerOutage(String id, PowerOutageReport powerOutageReport) {
        Poweroutage entity = powerOutageRepository.findById(Long.valueOf(id)).orElseThrow();
        entity.setGridOperator(powerOutageReport.getGridOperator());
        entity.setOutageType(String.valueOf(powerOutageReport.getOutageType()));
        entity.setDescription(powerOutageReport.getDescription());
        entity.setStartTime(powerOutageReport.getStartTime());
        entity.setEstimatedEnd(powerOutageReport.getEstimatedEnd());
        entity.setStatus(String.valueOf(powerOutageReport.getStatus()));
        entity.setAffectedAreas(convertAreas(powerOutageReport.getAffectedAreas()));
        entity.setAffectedCustomers(powerOutageReport.getAffectedCustomers());
        entity.setReportSource(powerOutageReport.getReportSource());
        entity.setLastUpdate(powerOutageReport.getLastUpdate());
        powerOutageRepository.save(entity);
        return ResponseEntity.ok(ReportConverter.fromEntity(List.of(entity)).get(0));
    }

    @Override
    public ResponseEntity<Void> deletePowerOutage(String id) {
         powerOutageRepository.findById(Long.valueOf(id)).map(entity -> {
            powerOutageRepository.delete(entity);
            return null;
        });
         return ResponseEntity.ok().build();
    }
}
