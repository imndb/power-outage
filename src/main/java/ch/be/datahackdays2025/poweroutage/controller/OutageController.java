package ch.be.datahackdays2025.poweroutage.controller;

import ch.be.datahackdays2025.poweroutage.apispec.model.StromausfallMeldung;
import org.springframework.http.ResponseEntity;


public class OutageController implements ch.be.datahackdays2025.poweroutage.apispec.api.StromausfallApi {


    @Override
    public ResponseEntity<Void> meldenStromausfall(StromausfallMeldung stromausfallMeldung) {

        System.out.println("Meldung erhalten.");


        return null;
    }
}
