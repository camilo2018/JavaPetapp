package Modelo;

public class GSDenuncia {

    private int cod;
    private String fec;
    private String tip;
    private String ced;
    private String men;
    private String evi;

    public GSDenuncia(int cod, String fec, String tip, String ced, String men, String evi) {
        this.cod = cod;
        this.fec = fec;
        this.tip = tip;
        this.ced = ced;
        this.men = men;
        this.evi = evi;
    }

    public GSDenuncia() {
    }
    
    

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
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

    public String getEvi() {
        return evi;
    }

    public void setEvi(String evi) {
        this.evi = evi;
    }

    
    
}
