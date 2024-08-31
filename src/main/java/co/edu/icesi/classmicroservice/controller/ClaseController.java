
package co.edu.icesi.classmicroservice.controller;
import co.edu.icesi.classmicroservice.model.Clase;
import co.edu.icesi.classmicroservice.service.ClaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clases")
public class ClaseController {

    @Autowired
    private ClaseService claseService;

    @PostMapping("/programar")
    public Clase programarClase(@RequestBody Clase clase) {
        return claseService.programarClase(clase);
    }

    @GetMapping("/todas")
    public List<Clase> obtenerTodasClases() {
        return claseService.obtenerTodasClases();
    }

    @PutMapping("/actualizar/{id}")
    public Clase actualizarClase(@PathVariable Long id, @RequestBody Clase clase) {
        return claseService.actualizarClase(id, clase);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarClase(@PathVariable Long id) {
        claseService.eliminarClase(id);
    }
}

