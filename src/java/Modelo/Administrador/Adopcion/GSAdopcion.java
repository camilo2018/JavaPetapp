package Modelo.Administrador.Adopcion;


public class GSAdopcion {

    
    private int codap;
    private int ani;
    private String ced;
    private String men;

    public GSAdopcion(int codap, int ani, String ced, String men) {
        this.codap = codap;
        this.ani = ani;
        this.ced = ced;
        this.men = men;
    }

    public GSAdopcion(int ani, String ced, String men) {
        this.ani = ani;
        this.ced = ced;
        this.men = men;
    }

    public GSAdopcion() {
    }

    public int getCodap() {
        return codap;
    }

    public void setCodap(int codap) {
        this.codap = codap;
    }

    public int getAni() {
        return ani;
    }

    public void setAni(int ani) {
        this.ani = ani;
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public String getMen() {
        return men;
    }

    public void setMen(String men) {
        this.men = men;
    }
    
    
}
