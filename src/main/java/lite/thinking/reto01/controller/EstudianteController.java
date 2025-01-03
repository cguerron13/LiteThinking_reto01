package lite.thinking.reto01.controller;

import lite.thinking.reto01.entity.Estudiante;
import lite.thinking.reto01.service.ServiceEstudiante;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstudianteController {
    private  final ServiceEstudiante serviceEstudiante;
    public EstudianteController(ServiceEstudiante serviceEstudiante) {
        this.serviceEstudiante = serviceEstudiante;
    }

    @GetMapping("/estudiante/getEstudiantes")
    public ResponseEntity<List<Estudiante>> getEstudiantes() {
        return ResponseEntity.ok(serviceEstudiante.getEstudiantes());
    }

    @GetMapping("/estudiante/filtrarEstudiantesXNombre/{nombre}")
    public ResponseEntity<List<Estudiante>> filtrarEstudiantesXNombre(@PathVariable String nombre) {
        return ResponseEntity.ok(serviceEstudiante.filtrarEstudiantesXNombre(nombre));
    }

    @GetMapping("/estudiante/filtrarEstudiantesXCelular/{numeroCelular}")
    public ResponseEntity<List<Estudiante>> filtrarEstudiantesXCelular(@PathVariable String numeroCelular) {
        return ResponseEntity.ok(serviceEstudiante.filtrarEstudiantesXCelular(numeroCelular));
    }

    @GetMapping("/estudiante/ordenarEstudiantesXNotas")
    public ResponseEntity<List<Estudiante>> ordenarEstudiantesXNotas() {
        return ResponseEntity.ok(serviceEstudiante.ordenarEstudiantesXNotas());
    }
}
