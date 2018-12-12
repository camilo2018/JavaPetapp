package Modelo.Administrador.Usuario;

public class GSUsuarioAdmin {
    
    private String cedula;
    private String nombre;
    private String clave;
    private int rol;

    public GSUsuarioAdmin(String cedula, String nombre, String clave) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.clave = clave;
    }

    public GSUsuarioAdmin(String cedula, String nombre, String clave, int rol) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.clave = clave;
        this.rol = rol;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
    
}
