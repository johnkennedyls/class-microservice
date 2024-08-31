package co.edu.icesi.classmicroservice.service;

import co.edu.icesi.classmicroservice.model.Clase;
import co.edu.icesi.classmicroservice.repository.ClaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClaseService {

    @Autowired
    private ClaseRepository claseRepository;

    public Clase programarClase(Clase clase) {
        return claseRepository.save(clase);
    }

    public List<Clase> obtenerTodasClases() {
        return claseRepository.findAll();
    }

    public Clase actualizarClase(Long id, Clase claseActualizada) {
        Clase claseExistente = claseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Clase no encontrada"));

        claseExistente.setNombre(claseActualizada.getNombre());
        claseExistente.setHorario(claseActualizada.getHorario());
        claseExistente.setCapacidad(claseActualizada.getCapacidad());
        claseExistente.setTipoClase(claseActualizada.getTipoClase());
        claseExistente.setEntrenadorId(claseActualizada.getEntrenadorId());
        return claseRepository.save(claseExistente);
    }

    public void eliminarClase(Long id) {
        claseRepository.deleteById(id);
    }
}
