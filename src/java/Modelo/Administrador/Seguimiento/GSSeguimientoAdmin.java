package Modelo.Administrador.Seguimiento;

public class GSSeguimientoAdmin {

private int cods;
private int codp;
private String tel;
private String dir;
private String fij;
private String ced;
private int ani;

    public GSSeguimientoAdmin(int cods, int codp, String tel, String dir, String fij, String ced, int ani) {
        this.cods = cods;
        this.codp = codp;
        this.tel = tel;
        this.dir = dir;
        this.fij = fij;
        this.ced = ced;
        this.ani = ani;
    }

    public GSSeguimientoAdmin() {
    }

    public GSSeguimientoAdmin(int codp, String tel, String dir, String fij, String ced, int ani) {
        this.codp = codp;
        this.tel = tel;
        this.dir = dir;
        this.fij = fij;
        this.ced = ced;
        this.ani = ani;
    }
    

    public GSSeguimientoAdmin(int cods) {
        this.cods = cods;
    }

    public int getCods() {
        return cods;
    }

    public void setCods(int cods) {
        this.cods = cods;
    }

    public int getCodp() {
        return codp;
    }

    public void setCodp(int codp) {
        this.codp = codp;
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

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public int getAni() {
        return ani;
    }

    public void setAni(int ani) {
        this.ani = ani;
    }



    
    
}
