package Modelo.UsuarioCiudadano;

public class GSAdminCiud {
    private String nom;
    private String cla;
    private int rol;

    public GSAdminCiud(String nom, String cla, int rol) {
        this.nom = nom;
        this.cla = cla;
        this.rol = rol;
    }

    public GSAdminCiud() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
    
}
