package co.edu.icesi.classmicroservice.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Capacidad {
    private int maxima;
    private int actual;
}
