package Modelo.Respuesta;

public class GSRespuesta {
    
   private int cod;
   private String ced;
   private String men;

    public GSRespuesta(int cod, String ced, String men) {
        this.cod = cod;
        this.ced = ced;
        this.men = men;
    }

    public GSRespuesta() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
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
