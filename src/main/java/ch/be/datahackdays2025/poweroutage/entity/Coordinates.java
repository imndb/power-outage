package ch.be.datahackdays2025.poweroutage.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Coordinates {
    private Float latitude;
    private Float longitude;
}
