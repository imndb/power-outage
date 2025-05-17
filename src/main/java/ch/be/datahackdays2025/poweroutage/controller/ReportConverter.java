package ch.be.datahackdays2025.poweroutage.controller;

import ch.be.datahackdays2025.poweroutage.apispec.model.PowerOutageReport;
import ch.be.datahackdays2025.poweroutage.apispec.model.PowerOutageReportAffectedAreasInner;
import ch.be.datahackdays2025.poweroutage.apispec.model.PowerOutageReportAffectedAreasInnerCoordinates;
import ch.be.datahackdays2025.poweroutage.entity.AffectedArea;
import ch.be.datahackdays2025.poweroutage.entity.Poweroutage;
import jakarta.validation.Valid;

import java.util.List;

public class ReportConverter {

    public static List<ch.be.datahackdays2025.poweroutage.apispec.model.PowerOutageReport> fromEntity(List<Poweroutage> all) {
        return all.stream().map(
                a -> {
                    PowerOutageReport powerOutageReport = new PowerOutageReport(
                            a.getGridOperator(),
                            a.getOutageType(),
                            a.getStartTime(),
                            a.getStatus(),
                            fromAffectedAreas(a.getAffectedAreas())
                    );
                    powerOutageReport.id(String.valueOf(a.getId()));
                    powerOutageReport.setDescription(a.getDescription());
                    powerOutageReport.setEstimatedEnd(a.getEstimatedEnd());
                    powerOutageReport.setAffectedCustomers(a.getAffectedCustomers());
                    powerOutageReport.setReportSource(a.getReportSource());
                    powerOutageReport.setLastUpdate(a.getLastUpdate());
                    return powerOutageReport;
                }).toList();

    }

    private static List<@Valid PowerOutageReportAffectedAreasInner> fromAffectedAreas(List<AffectedArea> affectedAreas) {
        return affectedAreas.stream()
                .map(ReportConverter::fromAffectedArea)
                .toList();
    }

    private static PowerOutageReportAffectedAreasInner fromAffectedArea(AffectedArea area) {
        PowerOutageReportAffectedAreasInner affectedArea = new PowerOutageReportAffectedAreasInner();
        affectedArea.setName(area.getName());
        affectedArea.setPlace(area.getPlace());
        affectedArea.setSubPlace(area.getSubPlace());
        PowerOutageReportAffectedAreasInnerCoordinates coordinates = new PowerOutageReportAffectedAreasInnerCoordinates();
        coordinates.setLatitude(area.getCoordinates().getLatitude());
        coordinates.setLongitude(area.getCoordinates().getLongitude());
        affectedArea.setCoordinates(coordinates);
        return affectedArea;
    }
}
