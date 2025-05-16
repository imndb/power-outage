package ch.be.datahackdays2025.poweroutage.config;

import ch.be.datahackdays2025.poweroutage.apispec.model.PowerOutageReport;
import ch.be.datahackdays2025.poweroutage.apispec.model.PowerOutageReportAffectedAreasInner;
import ch.be.datahackdays2025.poweroutage.apispec.model.PowerOutageReportAffectedAreasInnerCoordinates;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
@AutoConfigureWebTestClient
public class PowerOutageRestControllerTest {

    @Autowired
    private WebTestClient webTestClient;


    @Test
    public  void testAddPowerOutageReport() {

        // add report
        ch.be.datahackdays2025.poweroutage.apispec.model.PowerOutageReport powerOutageReport = new PowerOutageReport();
        powerOutageReport.description("ausfall");
        powerOutageReport.setStatus("IN_PROGRESS");
        PowerOutageReportAffectedAreasInner affectedAreasInner = new PowerOutageReportAffectedAreasInner();
        affectedAreasInner.setName("bern");
        affectedAreasInner.setCoordinates(new PowerOutageReportAffectedAreasInnerCoordinates().latitude(325.7f));
        List<ch.be.datahackdays2025.poweroutage.apispec.model.PowerOutageReportAffectedAreasInner> affectedAreasInners =
                Collections.singletonList(affectedAreasInner);
        powerOutageReport.setAffectedAreas(affectedAreasInners);
        powerOutageReport.setReportSource("report_source");
        powerOutageReport.setDescription("description");
        powerOutageReport.setGridOperator("operator");
        powerOutageReport.setStartTime(new Date());
        powerOutageReport.setOutageType("PLANNED_MAINTENANCE");


        WebTestClient.ResponseSpec response = webTestClient.post().uri("/poweroutage")
                .bodyValue(powerOutageReport)
                .exchange();
        response.expectStatus().isOk();


        // check list
        WebTestClient.ResponseSpec getResponse = webTestClient.get().uri("/poweroutage")
                .exchange();
        getResponse.expectStatus().isOk();
        // TODO verify the content getResponse.expectBodyList(ch.be.datahackdays2025.poweroutage.apispec.model.PowerOutageReport.class)
        //    .hasSize(1); TODO setStartTime correctly
    }

}
