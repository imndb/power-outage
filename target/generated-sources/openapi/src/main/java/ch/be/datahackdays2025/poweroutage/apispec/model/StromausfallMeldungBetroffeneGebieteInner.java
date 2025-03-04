package ch.be.datahackdays2025.poweroutage.apispec.model;

import java.net.URI;
import java.util.Objects;
import ch.be.datahackdays2025.poweroutage.apispec.model.StromausfallMeldungBetroffeneGebieteInnerKoordinaten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StromausfallMeldungBetroffeneGebieteInner
 */

@JsonTypeName("StromausfallMeldung_betroffene_gebiete_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-04T22:42:01.740348700+01:00[Europe/Berlin]", comments = "Generator version: 7.12.0")
public class StromausfallMeldungBetroffeneGebieteInner {

  private @Nullable String name;

  private @Nullable StromausfallMeldungBetroffeneGebieteInnerKoordinaten koordinaten;

  public StromausfallMeldungBetroffeneGebieteInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", example = "Bern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StromausfallMeldungBetroffeneGebieteInner koordinaten(StromausfallMeldungBetroffeneGebieteInnerKoordinaten koordinaten) {
    this.koordinaten = koordinaten;
    return this;
  }

  /**
   * Get koordinaten
   * @return koordinaten
   */
  @Valid 
  @Schema(name = "koordinaten", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("koordinaten")
  public StromausfallMeldungBetroffeneGebieteInnerKoordinaten getKoordinaten() {
    return koordinaten;
  }

  public void setKoordinaten(StromausfallMeldungBetroffeneGebieteInnerKoordinaten koordinaten) {
    this.koordinaten = koordinaten;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StromausfallMeldungBetroffeneGebieteInner stromausfallMeldungBetroffeneGebieteInner = (StromausfallMeldungBetroffeneGebieteInner) o;
    return Objects.equals(this.name, stromausfallMeldungBetroffeneGebieteInner.name) &&
        Objects.equals(this.koordinaten, stromausfallMeldungBetroffeneGebieteInner.koordinaten);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, koordinaten);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StromausfallMeldungBetroffeneGebieteInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    koordinaten: ").append(toIndentedString(koordinaten)).append("\n");
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

