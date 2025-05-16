package ch.be.datahackdays2025.poweroutage.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AffectedArea {
    private String name;

    @Embedded
    private Coordinates coordinates;
}
