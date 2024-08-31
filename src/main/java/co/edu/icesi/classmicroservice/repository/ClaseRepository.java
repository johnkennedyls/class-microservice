package co.edu.icesi.classmicroservice.repository;

import co.edu.icesi.classmicroservice.model.Clase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaseRepository extends JpaRepository<Clase, Long> {
}
