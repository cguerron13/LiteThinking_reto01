package lite.thinking.reto01.service;

import lite.thinking.reto01.entity.Estudiante;
import lite.thinking.reto01.repository.RepositorioEstudiante;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceEstudiante {
    RepositorioEstudiante repositorioEstudiante;
    public ServiceEstudiante(RepositorioEstudiante repositorioEstudiante) {
        this.repositorioEstudiante = repositorioEstudiante;
    }
    /**
    Lista de todos los estudiantes
     */
    public List<Estudiante> getEstudiantes() {
        return repositorioEstudiante.listaEstudiantes();
    };

    /**
     * Filtro por atributo nombre
     * @param filtro -> nombre
     * @return
     */
    public List<Estudiante> filtrarEstudiantesXNombre(String filtro) {
        return repositorioEstudiante.listaEstudiantes().stream().filter(
                estudiante -> estudiante.getNombre().contains(filtro)).collect(Collectors.toList());
    };

    /**
     * Filtro por atributo numero de celular
     * @param filtro -> numero de celular
     * @return
     */
    public List<Estudiante> filtrarEstudiantesXCelular(String filtro) {
        return repositorioEstudiante.listaEstudiantes().stream().filter(
                estudiante -> estudiante.getNumeroCelular().contains(filtro)).collect(Collectors.toList());
    };

    /**
     * Ordenar estudiante por notas
     * @return
     */
    public List<Estudiante> ordenarEstudiantesXNotas() {
        return repositorioEstudiante.listaEstudiantes().stream()
                .sorted(Comparator.comparingDouble(Estudiante::getPromedioNotas))
                .collect(Collectors.toList());
    }

}
