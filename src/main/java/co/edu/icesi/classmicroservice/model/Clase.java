package co.edu.icesi.classmicroservice.model;
import co.edu.icesi.classmicroservice.model.Capacidad;
import co.edu.icesi.classmicroservice.model.Horario;
import co.edu.icesi.classmicroservice.model.TipoClase;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Clase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Embedded
    private Horario horario;

    @Embedded
    private Capacidad capacidad;

    private TipoClase tipoClase;

    private Long entrenadorId;
}
