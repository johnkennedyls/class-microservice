package co.edu.icesi.classmicroservice.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Embeddable
public class Horario {
    private LocalDateTime inicio;
    private LocalDateTime fin;
}
