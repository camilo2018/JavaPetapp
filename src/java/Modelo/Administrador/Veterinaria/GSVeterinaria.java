package Modelo.Administrador.Veterinaria;

public class GSVeterinaria {
    
    private String nitveterinaria;
    private String telefonoveterinaria;
    private String nombreveterinaria;
    private String direccionveterinaria;
    private int rolveterinaria;

    public GSVeterinaria(String nitveterinaria, String telefonoveterinaria, String nombreveterinaria, String direccionveterinaria, int rolveterinaria) {
        this.nitveterinaria = nitveterinaria;
        this.telefonoveterinaria = telefonoveterinaria;
        this.nombreveterinaria = nombreveterinaria;
        this.direccionveterinaria = direccionveterinaria;
        this.rolveterinaria = rolveterinaria;
    }

    public GSVeterinaria(String nitveterinaria, String telefonoveterinaria, String nombreveterinaria, String direccionveterinaria) {
        this.nitveterinaria = nitveterinaria;
        this.telefonoveterinaria = telefonoveterinaria;
        this.nombreveterinaria = nombreveterinaria;
        this.direccionveterinaria = direccionveterinaria;
    }

    public GSVeterinaria() {
    }

    public String getNitveterinaria() {
        return nitveterinaria;
    }

    public void setNitveterinaria(String nitveterinaria) {
        this.nitveterinaria = nitveterinaria;
    }

    public String getTelefonoveterinaria() {
        return telefonoveterinaria;
    }

    public void setTelefonoveterinaria(String telefonoveterinaria) {
        this.telefonoveterinaria = telefonoveterinaria;
    }

    public String getNombreveterinaria() {
        return nombreveterinaria;
    }

    public void setNombreveterinaria(String nombreveterinaria) {
        this.nombreveterinaria = nombreveterinaria;
    }

    public String getDireccionveterinaria() {
        return direccionveterinaria;
    }

    public void setDireccionveterinaria(String direccionveterinaria) {
        this.direccionveterinaria = direccionveterinaria;
    }

    public int getRolveterinaria() {
        return rolveterinaria;
    }

    public void setRolveterinaria(int rolveterinaria) {
        this.rolveterinaria = rolveterinaria;
    }

}
