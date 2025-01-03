package lite.thinking.reto01.entity;

public class Estudiante extends Persona{
    Integer numeroEstudiante;
    double promedioNotas;

    public Estudiante(String numeroCelular, String nombre, String correoElectronico,Integer numeroEstudiante, double promedioNotas) {
        super(numeroCelular,nombre,correoElectronico);
        this.numeroEstudiante = numeroEstudiante;
        this.promedioNotas = promedioNotas;
    }

    public Integer getNumeroEstudiante() {
        return numeroEstudiante;
    }

    public void setNumeroEstudiante(Integer numeroEstudiante) {
        this.numeroEstudiante = numeroEstudiante;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }
}
