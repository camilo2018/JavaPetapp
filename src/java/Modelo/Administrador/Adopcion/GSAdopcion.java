package Modelo.Administrador.Adopcion;


public class GSAdopcion {

private int cod;
private int ani;
private int seg;
private String men;

    public GSAdopcion(int cod, int ani, int seg, String men) {
        this.cod = cod;
        this.ani = ani;
        this.seg = seg;
        this.men = men;
    }

    public GSAdopcion(int ani, int seg, String men) {
        this.ani = ani;
        this.seg = seg;
        this.men = men;
    }

    public GSAdopcion() {
    }


    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getAni() {
        return ani;
    }

    public void setAni(int ani) {
        this.ani = ani;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public String getMen() {
        return men;
    }

    public void setMen(String men) {
        this.men = men;
    }
    
    
}
