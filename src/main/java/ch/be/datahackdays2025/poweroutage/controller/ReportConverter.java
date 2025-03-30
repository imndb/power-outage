package ch.be.datahackdays2025.poweroutage.controller;

import ch.be.datahackdays2025.poweroutage.apispec.model.PowerOutageReport;
import ch.be.datahackdays2025.poweroutage.entity.Poweroutage;

import java.time.Instant;
import java.util.Date;
import java.util.List;

public class ReportConverter {

    public static List<ch.be.datahackdays2025.poweroutage.apispec.model.PowerOutageReport> fromEntity(List<Poweroutage> all) {
        return all.stream().map(a -> new PowerOutageReport(a.getLocation(), PowerOutageReport.OutageTypeEnum.POWER_OUTAGE,
                Date.from(Instant.ofEpochSecond(System.currentTimeMillis())), PowerOutageReport.StatusEnum.IN_PROGRESS, null)).toList();
    }
}
