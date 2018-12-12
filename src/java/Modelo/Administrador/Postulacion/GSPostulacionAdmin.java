package Modelo.Administrador.Postulacion;

public class GSPostulacionAdmin {
    
    private int cod;
    private String tel;
    private String dir; 
    private String fij;
    private String cer;
    private String ced;
    private int coda;

    public GSPostulacionAdmin(int cod, String tel, String dir, String fij, String cer, String ced, int coda) {
        this.cod = cod;
        this.tel = tel;
        this.dir = dir;
        this.fij = fij;
        this.cer = cer;
        this.ced = ced;
        this.coda = coda;
    }

    public GSPostulacionAdmin(String tel, String dir, String fij, String cer, String ced, int coda) {
        this.tel = tel;
        this.dir = dir;
        this.fij = fij;
        this.cer = cer;
        this.ced = ced;
        this.coda = coda;
    }

    public GSPostulacionAdmin() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getFij() {
        return fij;
    }

    public void setFij(String fij) {
        this.fij = fij;
    }

    public String getCer() {
        return cer;
    }

    public void setCer(String cer) {
        this.cer = cer;
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public int getCoda() {
        return coda;
    }

    public void setCoda(int coda) {
        this.coda = coda;
    }

}
