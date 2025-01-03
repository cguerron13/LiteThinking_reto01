package lite.thinking.reto01.entity;


public class Persona {
    String numeroCelular;
    String nombre;
    String correoElectronico;
    Direccion direccion;

    public Persona(String numeroCelular, String nombre, String correoElectronico) {
        this.numeroCelular = numeroCelular;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
    }
    public void comprarPaseElectronico() {
        System.out.println("Comprado el Pase Electronico");
    }
    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }



}
