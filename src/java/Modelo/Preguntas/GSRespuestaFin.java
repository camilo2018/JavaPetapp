package Modelo.Preguntas;

public class GSRespuestaFin {

    private int re1;
    private String ced;

    public GSRespuestaFin(int re1, String ced) {
        this.re1 = re1;
        this.ced = ced;
    }

    public GSRespuestaFin(String ced) {
        this.ced = ced;
    }

    public GSRespuestaFin() {
    }

    public int getRe1() {
        return re1;
    }

    public void setRe1(int re1) {
        this.re1 = re1;
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }
    
}
