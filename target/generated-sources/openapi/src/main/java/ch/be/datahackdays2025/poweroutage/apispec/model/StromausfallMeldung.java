package ch.be.datahackdays2025.poweroutage.apispec.model;

import java.net.URI;
import java.util.Objects;
import ch.be.datahackdays2025.poweroutage.apispec.model.StromausfallMeldungBetroffeneGebieteInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StromausfallMeldung
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-04T22:42:01.740348700+01:00[Europe/Berlin]", comments = "Generator version: 7.12.0")
public class StromausfallMeldung {

  private @Nullable String id;

  private String netzbetreiber;

  /**
   * Gets or Sets störungstyp
   */
  public enum StrungstypEnum {
    STROMAUSFALL("Stromausfall"),
    
    SPANNUNGSSCHWANKUNG("Spannungsschwankung"),
    
    GEPLANTE_WARTUNG("Geplante Wartung");

    private String value;

    StrungstypEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StrungstypEnum fromValue(String value) {
      for (StrungstypEnum b : StrungstypEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StrungstypEnum störungstyp;

  private @Nullable String beschreibung;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startzeit;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime voraussichtlichesEnde;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    IN_BEARBEITUNG("in Bearbeitung"),
    
    BEHOBEN("behoben"),
    
    GEPLANT("geplant");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  @Valid
  private List<@Valid StromausfallMeldungBetroffeneGebieteInner> betroffeneGebiete = new ArrayList<>();

  private @Nullable Integer anzahlBetroffeneKunden;

  private @Nullable String meldungsquelle;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime letzteAktualisierung;

  public StromausfallMeldung() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StromausfallMeldung(String netzbetreiber, StrungstypEnum störungstyp, OffsetDateTime startzeit, StatusEnum status, List<@Valid StromausfallMeldungBetroffeneGebieteInner> betroffeneGebiete) {
    this.netzbetreiber = netzbetreiber;
    this.störungstyp = störungstyp;
    this.startzeit = startzeit;
    this.status = status;
    this.betroffeneGebiete = betroffeneGebiete;
  }

  public StromausfallMeldung id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", example = "12345", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StromausfallMeldung netzbetreiber(String netzbetreiber) {
    this.netzbetreiber = netzbetreiber;
    return this;
  }

  /**
   * Get netzbetreiber
   * @return netzbetreiber
   */
  @NotNull 
  @Schema(name = "netzbetreiber", example = "BKW", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("netzbetreiber")
  public String getNetzbetreiber() {
    return netzbetreiber;
  }

  public void setNetzbetreiber(String netzbetreiber) {
    this.netzbetreiber = netzbetreiber;
  }

  public StromausfallMeldung störungstyp(StrungstypEnum störungstyp) {
    this.störungstyp = störungstyp;
    return this;
  }

  /**
   * Get störungstyp
   * @return störungstyp
   */
  @NotNull 
  @Schema(name = "störungstyp", example = "Stromausfall", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("störungstyp")
  public StrungstypEnum getStörungstyp() {
    return störungstyp;
  }

  public void setStörungstyp(StrungstypEnum störungstyp) {
    this.störungstyp = störungstyp;
  }

  public StromausfallMeldung beschreibung(String beschreibung) {
    this.beschreibung = beschreibung;
    return this;
  }

  /**
   * Get beschreibung
   * @return beschreibung
   */
  
  @Schema(name = "beschreibung", example = "Wir sind daran, die Störung zu beheben. Danke für Ihr Verständnis.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("beschreibung")
  public String getBeschreibung() {
    return beschreibung;
  }

  public void setBeschreibung(String beschreibung) {
    this.beschreibung = beschreibung;
  }

  public StromausfallMeldung startzeit(OffsetDateTime startzeit) {
    this.startzeit = startzeit;
    return this;
  }

  /**
   * Get startzeit
   * @return startzeit
   */
  @NotNull @Valid 
  @Schema(name = "startzeit", example = "2025-03-04T14:00Z", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startzeit")
  public OffsetDateTime getStartzeit() {
    return startzeit;
  }

  public void setStartzeit(OffsetDateTime startzeit) {
    this.startzeit = startzeit;
  }

  public StromausfallMeldung voraussichtlichesEnde(OffsetDateTime voraussichtlichesEnde) {
    this.voraussichtlichesEnde = voraussichtlichesEnde;
    return this;
  }

  /**
   * Get voraussichtlichesEnde
   * @return voraussichtlichesEnde
   */
  @Valid 
  @Schema(name = "voraussichtliches_ende", example = "2025-03-04T18:00Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("voraussichtliches_ende")
  public OffsetDateTime getVoraussichtlichesEnde() {
    return voraussichtlichesEnde;
  }

  public void setVoraussichtlichesEnde(OffsetDateTime voraussichtlichesEnde) {
    this.voraussichtlichesEnde = voraussichtlichesEnde;
  }

  public StromausfallMeldung status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull 
  @Schema(name = "status", example = "in Bearbeitung", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public StromausfallMeldung betroffeneGebiete(List<@Valid StromausfallMeldungBetroffeneGebieteInner> betroffeneGebiete) {
    this.betroffeneGebiete = betroffeneGebiete;
    return this;
  }

  public StromausfallMeldung addBetroffeneGebieteItem(StromausfallMeldungBetroffeneGebieteInner betroffeneGebieteItem) {
    if (this.betroffeneGebiete == null) {
      this.betroffeneGebiete = new ArrayList<>();
    }
    this.betroffeneGebiete.add(betroffeneGebieteItem);
    return this;
  }

  /**
   * Get betroffeneGebiete
   * @return betroffeneGebiete
   */
  @NotNull @Valid 
  @Schema(name = "betroffene_gebiete", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("betroffene_gebiete")
  public List<@Valid StromausfallMeldungBetroffeneGebieteInner> getBetroffeneGebiete() {
    return betroffeneGebiete;
  }

  public void setBetroffeneGebiete(List<@Valid StromausfallMeldungBetroffeneGebieteInner> betroffeneGebiete) {
    this.betroffeneGebiete = betroffeneGebiete;
  }

  public StromausfallMeldung anzahlBetroffeneKunden(Integer anzahlBetroffeneKunden) {
    this.anzahlBetroffeneKunden = anzahlBetroffeneKunden;
    return this;
  }

  /**
   * Get anzahlBetroffeneKunden
   * @return anzahlBetroffeneKunden
   */
  
  @Schema(name = "anzahl_betroffene_kunden", example = "5000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("anzahl_betroffene_kunden")
  public Integer getAnzahlBetroffeneKunden() {
    return anzahlBetroffeneKunden;
  }

  public void setAnzahlBetroffeneKunden(Integer anzahlBetroffeneKunden) {
    this.anzahlBetroffeneKunden = anzahlBetroffeneKunden;
  }

  public StromausfallMeldung meldungsquelle(String meldungsquelle) {
    this.meldungsquelle = meldungsquelle;
    return this;
  }

  /**
   * Get meldungsquelle
   * @return meldungsquelle
   */
  
  @Schema(name = "meldungsquelle", example = "Automatisches Monitoring", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meldungsquelle")
  public String getMeldungsquelle() {
    return meldungsquelle;
  }

  public void setMeldungsquelle(String meldungsquelle) {
    this.meldungsquelle = meldungsquelle;
  }

  public StromausfallMeldung letzteAktualisierung(OffsetDateTime letzteAktualisierung) {
    this.letzteAktualisierung = letzteAktualisierung;
    return this;
  }

  /**
   * Get letzteAktualisierung
   * @return letzteAktualisierung
   */
  @Valid 
  @Schema(name = "letzte_aktualisierung", example = "2025-03-04T14:30Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("letzte_aktualisierung")
  public OffsetDateTime getLetzteAktualisierung() {
    return letzteAktualisierung;
  }

  public void setLetzteAktualisierung(OffsetDateTime letzteAktualisierung) {
    this.letzteAktualisierung = letzteAktualisierung;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StromausfallMeldung stromausfallMeldung = (StromausfallMeldung) o;
    return Objects.equals(this.id, stromausfallMeldung.id) &&
        Objects.equals(this.netzbetreiber, stromausfallMeldung.netzbetreiber) &&
        Objects.equals(this.störungstyp, stromausfallMeldung.störungstyp) &&
        Objects.equals(this.beschreibung, stromausfallMeldung.beschreibung) &&
        Objects.equals(this.startzeit, stromausfallMeldung.startzeit) &&
        Objects.equals(this.voraussichtlichesEnde, stromausfallMeldung.voraussichtlichesEnde) &&
        Objects.equals(this.status, stromausfallMeldung.status) &&
        Objects.equals(this.betroffeneGebiete, stromausfallMeldung.betroffeneGebiete) &&
        Objects.equals(this.anzahlBetroffeneKunden, stromausfallMeldung.anzahlBetroffeneKunden) &&
        Objects.equals(this.meldungsquelle, stromausfallMeldung.meldungsquelle) &&
        Objects.equals(this.letzteAktualisierung, stromausfallMeldung.letzteAktualisierung);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, netzbetreiber, störungstyp, beschreibung, startzeit, voraussichtlichesEnde, status, betroffeneGebiete, anzahlBetroffeneKunden, meldungsquelle, letzteAktualisierung);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StromausfallMeldung {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    netzbetreiber: ").append(toIndentedString(netzbetreiber)).append("\n");
    sb.append("    störungstyp: ").append(toIndentedString(störungstyp)).append("\n");
    sb.append("    beschreibung: ").append(toIndentedString(beschreibung)).append("\n");
    sb.append("    startzeit: ").append(toIndentedString(startzeit)).append("\n");
    sb.append("    voraussichtlichesEnde: ").append(toIndentedString(voraussichtlichesEnde)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    betroffeneGebiete: ").append(toIndentedString(betroffeneGebiete)).append("\n");
    sb.append("    anzahlBetroffeneKunden: ").append(toIndentedString(anzahlBetroffeneKunden)).append("\n");
    sb.append("    meldungsquelle: ").append(toIndentedString(meldungsquelle)).append("\n");
    sb.append("    letzteAktualisierung: ").append(toIndentedString(letzteAktualisierung)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

