package ch.be.datahackdays2025.poweroutage.controller;

import ch.be.datahackdays2025.poweroutage.apispec.model.PowerOutageReport;
import ch.be.datahackdays2025.poweroutage.entity.Poweroutage;
import ch.be.datahackdays2025.poweroutage.repository.PowerOutageRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class OutageController implements ch.be.datahackdays2025.poweroutage.apispec.api.PoweroutageApi {

    private PowerOutageRepository powerOutageRepository;

    public OutageController(PowerOutageRepository powerOutageRepository) {
        this.powerOutageRepository = powerOutageRepository;
    }

    @Override
    public ResponseEntity<Void> reportPowerOutage(PowerOutageReport powerOutageReport) {
        Poweroutage entity = Poweroutage.builder().location("loc").status("easy").build();
        powerOutageRepository.save(entity);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<List<PowerOutageReport>> getAllPowerOutages() {
        return ResponseEntity.ok(ReportConverter.fromEntity(powerOutageRepository.findAll()));
    }
}
