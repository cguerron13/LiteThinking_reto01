package lite.thinking.reto01.entity;

public class Direccion {
     String direccionn;
     String ciudad;
     String estado;
     String codigoPostal;
     String pais;

     public Direccion(String direccionn, String ciudad, String estado, String codigoPostal,String pais) {
         this.direccionn = direccionn;
         this.ciudad = ciudad;
         this.estado = estado;
         this.codigoPostal = codigoPostal;
         this.pais = pais;
     }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getDireccionn() {
        return direccionn;
    }

    public void setDireccionn(String direccionn) {
        this.direccionn = direccionn;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


}
