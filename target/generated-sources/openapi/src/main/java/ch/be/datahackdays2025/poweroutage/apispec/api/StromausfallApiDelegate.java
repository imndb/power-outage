package ch.be.datahackdays2025.poweroutage.apispec.api;

import ch.be.datahackdays2025.poweroutage.apispec.model.StromausfallMeldung;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link StromausfallApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-04T22:42:01.740348700+01:00[Europe/Berlin]", comments = "Generator version: 7.12.0")
public interface StromausfallApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /stromausfall : Liste aller Stromausfälle abrufen
     * Gibt eine Liste aller aktuellen Stromausfälle zurück.
     *
     * @return Erfolgreiche Antwort (status code 200)
     *         or Serverfehler (status code 500)
     * @see StromausfallApi#getAllStromausflle
     */
    default ResponseEntity<List<StromausfallMeldung>> getAllStromausflle() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"meldungsquelle\" : \"Automatisches Monitoring\", \"störungstyp\" : \"Stromausfall\", \"anzahl_betroffene_kunden\" : 5000, \"netzbetreiber\" : \"BKW\", \"voraussichtliches_ende\" : \"2025-03-04T18:00:00Z\", \"id\" : \"12345\", \"betroffene_gebiete\" : [ { \"koordinaten\" : { \"breitengrad\" : 46.9481, \"längengrad\" : 7.4474 }, \"name\" : \"Bern\" }, { \"koordinaten\" : { \"breitengrad\" : 46.9481, \"längengrad\" : 7.4474 }, \"name\" : \"Bern\" } ], \"beschreibung\" : \"Wir sind daran, die Störung zu beheben. Danke für Ihr Verständnis.\", \"letzte_aktualisierung\" : \"2025-03-04T14:30:00Z\", \"startzeit\" : \"2025-03-04T14:00:00Z\", \"status\" : \"in Bearbeitung\" }, { \"meldungsquelle\" : \"Automatisches Monitoring\", \"störungstyp\" : \"Stromausfall\", \"anzahl_betroffene_kunden\" : 5000, \"netzbetreiber\" : \"BKW\", \"voraussichtliches_ende\" : \"2025-03-04T18:00:00Z\", \"id\" : \"12345\", \"betroffene_gebiete\" : [ { \"koordinaten\" : { \"breitengrad\" : 46.9481, \"längengrad\" : 7.4474 }, \"name\" : \"Bern\" }, { \"koordinaten\" : { \"breitengrad\" : 46.9481, \"längengrad\" : 7.4474 }, \"name\" : \"Bern\" } ], \"beschreibung\" : \"Wir sind daran, die Störung zu beheben. Danke für Ihr Verständnis.\", \"letzte_aktualisierung\" : \"2025-03-04T14:30:00Z\", \"startzeit\" : \"2025-03-04T14:00:00Z\", \"status\" : \"in Bearbeitung\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /stromausfall/{id} : Einzelnen Stromausfall abrufen
     * Gibt die Details eines bestimmten Stromausfalls anhand der ID zurück.
     *
     * @param id Die eindeutige ID des Stromausfalls (required)
     * @return Erfolgreiche Antwort (status code 200)
     *         or Stromausfall nicht gefunden (status code 404)
     *         or Serverfehler (status code 500)
     * @see StromausfallApi#getStromausfall
     */
    default ResponseEntity<StromausfallMeldung> getStromausfall(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"meldungsquelle\" : \"Automatisches Monitoring\", \"störungstyp\" : \"Stromausfall\", \"anzahl_betroffene_kunden\" : 5000, \"netzbetreiber\" : \"BKW\", \"voraussichtliches_ende\" : \"2025-03-04T18:00:00Z\", \"id\" : \"12345\", \"betroffene_gebiete\" : [ { \"koordinaten\" : { \"breitengrad\" : 46.9481, \"längengrad\" : 7.4474 }, \"name\" : \"Bern\" }, { \"koordinaten\" : { \"breitengrad\" : 46.9481, \"längengrad\" : 7.4474 }, \"name\" : \"Bern\" } ], \"beschreibung\" : \"Wir sind daran, die Störung zu beheben. Danke für Ihr Verständnis.\", \"letzte_aktualisierung\" : \"2025-03-04T14:30:00Z\", \"startzeit\" : \"2025-03-04T14:00:00Z\", \"status\" : \"in Bearbeitung\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /stromausfall : Meldung eines Stromausfalls
     * Netzbetreiber melden Stromausfälle mit relevanten Informationen.
     *
     * @param stromausfallMeldung  (required)
     * @return Erfolgreich gemeldet (status code 201)
     *         or Ungültige Anfrage (status code 400)
     *         or Serverfehler (status code 500)
     * @see StromausfallApi#meldenStromausfall
     */
    default ResponseEntity<Void> meldenStromausfall(StromausfallMeldung stromausfallMeldung) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
