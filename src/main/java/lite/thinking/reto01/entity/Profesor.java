package lite.thinking.reto01.entity;

public class Profesor extends Persona{
    double salario;
    String materiasDictadas;

    public Profesor(String numeroCelular, String nombre, String correoElectronico, double salario, String materiasDictadas) {
        super(numeroCelular, nombre, correoElectronico);
        this.salario = salario;
        this.materiasDictadas = materiasDictadas;

    }
    public String getMateriasDictadas() {
        return materiasDictadas;
    }

    public void setMateriasDictadas(String materiasDictadas) {
        this.materiasDictadas = materiasDictadas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
