package ch.be.datahackdays2025.poweroutage.controller;

import ch.be.datahackdays2025.poweroutage.apispec.model.StromausfallMeldung;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


public class OutageController implements ch.be.datahackdays2025.poweroutage.apispec.api.StromausfallApi {


    @Override
    public ResponseEntity<Void> meldenStromausfall(StromausfallMeldung stromausfallMeldung) {

        System.out.println("Meldung erhalten.");


        return null;
    }

    @GetMapping("/check")
    public String checkConnection() {
        return "Server is up on port 8081!";
    }
}
