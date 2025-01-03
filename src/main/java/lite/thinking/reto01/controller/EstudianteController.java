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

    /**
     * Servicio rest para obtener todos los estudiantes
     * @return
     */
    @GetMapping("/estudiante/getEstudiantes")
    public ResponseEntity<List<Estudiante>> getEstudiantes() {
        return ResponseEntity.ok(serviceEstudiante.getEstudiantes());
    }

    /**
     * Servicio rest para obtener los estudiantes filtrados por el nombre
     * @param nombre
     * @return
     */
    @GetMapping("/estudiante/filtrarEstudiantesXNombre/{nombre}")
    public ResponseEntity<List<Estudiante>> filtrarEstudiantesXNombre(@PathVariable String nombre) {
        return ResponseEntity.ok(serviceEstudiante.filtrarEstudiantesXNombre(nombre));
    }

    /**
     * Servicio rest para obtener los estudiantes filtrados por el numero de celular
     * @param numeroCelular
     * @return
     */

    @GetMapping("/estudiante/filtrarEstudiantesXCelular/{numeroCelular}")
    public ResponseEntity<List<Estudiante>> filtrarEstudiantesXCelular(@PathVariable String numeroCelular) {
        return ResponseEntity.ok(serviceEstudiante.filtrarEstudiantesXCelular(numeroCelular));
    }

    /**
     * Servicio rest que retorna todos los estudiantes en orden ascendente por el campo Notas
     * @return
     */
    @GetMapping("/estudiante/ordenarEstudiantesXNotas")
    public ResponseEntity<List<Estudiante>> ordenarEstudiantesXNotas() {
        return ResponseEntity.ok(serviceEstudiante.ordenarEstudiantesXNotas());
    }
}
