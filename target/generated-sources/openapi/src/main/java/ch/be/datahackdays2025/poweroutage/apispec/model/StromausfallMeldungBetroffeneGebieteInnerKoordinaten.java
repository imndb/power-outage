package ch.be.datahackdays2025.poweroutage.apispec.model;

import java.net.URI;
import java.util.Objects;
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
 * StromausfallMeldungBetroffeneGebieteInnerKoordinaten
 */

@JsonTypeName("StromausfallMeldung_betroffene_gebiete_inner_koordinaten")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-04T22:42:01.740348700+01:00[Europe/Berlin]", comments = "Generator version: 7.12.0")
public class StromausfallMeldungBetroffeneGebieteInnerKoordinaten {

  private @Nullable Float breitengrad;

  private @Nullable Float längengrad;

  public StromausfallMeldungBetroffeneGebieteInnerKoordinaten breitengrad(Float breitengrad) {
    this.breitengrad = breitengrad;
    return this;
  }

  /**
   * Get breitengrad
   * @return breitengrad
   */
  
  @Schema(name = "breitengrad", example = "46.9481", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("breitengrad")
  public Float getBreitengrad() {
    return breitengrad;
  }

  public void setBreitengrad(Float breitengrad) {
    this.breitengrad = breitengrad;
  }

  public StromausfallMeldungBetroffeneGebieteInnerKoordinaten längengrad(Float längengrad) {
    this.längengrad = längengrad;
    return this;
  }

  /**
   * Get längengrad
   * @return längengrad
   */
  
  @Schema(name = "längengrad", example = "7.4474", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("längengrad")
  public Float getLängengrad() {
    return längengrad;
  }

  public void setLängengrad(Float längengrad) {
    this.längengrad = längengrad;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StromausfallMeldungBetroffeneGebieteInnerKoordinaten stromausfallMeldungBetroffeneGebieteInnerKoordinaten = (StromausfallMeldungBetroffeneGebieteInnerKoordinaten) o;
    return Objects.equals(this.breitengrad, stromausfallMeldungBetroffeneGebieteInnerKoordinaten.breitengrad) &&
        Objects.equals(this.längengrad, stromausfallMeldungBetroffeneGebieteInnerKoordinaten.längengrad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breitengrad, längengrad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StromausfallMeldungBetroffeneGebieteInnerKoordinaten {\n");
    sb.append("    breitengrad: ").append(toIndentedString(breitengrad)).append("\n");
    sb.append("    längengrad: ").append(toIndentedString(längengrad)).append("\n");
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

