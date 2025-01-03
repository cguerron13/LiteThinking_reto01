package lite.thinking.reto01.repository;

import lite.thinking.reto01.entity.Estudiante;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class RepositorioEstudiante {

    /**
     * Genera el repositorio de clientes
     * @return
     */
    public List<Estudiante> listaEstudiantes() {
        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        estudiantes.add(new Estudiante("0981231231","Pedro","pedro@gmail.com",1,9.8));
        estudiantes.add(new Estudiante("0981231232","Ana","ana@gmail.com",2,7));
        estudiantes.add(new Estudiante("0981231233","Jose","jose@gmail.com",3,8));
        estudiantes.add(new Estudiante("0981231234","Vero","vero@gmail.com",4,10));
        estudiantes.add(new Estudiante("0981231235","Nelly","nelly@gmail.com",5,6));
        estudiantes.add(new Estudiante("0981231236","Juan","juan@gmail.com",6,7.8));
        estudiantes.add(new Estudiante("0981231237","Rocio","rocio@gmail.com",7,3));
        estudiantes.add(new Estudiante("0981231238","Michael","michael@gmail.com",8,8));
        estudiantes.add(new Estudiante("0981231239","Sebastian","sebastian@gmail.com",9,10));
        estudiantes.add(new Estudiante("0981231230","Maria Jose","majito@gmail.com",10,10));
        return estudiantes;
    }
}
