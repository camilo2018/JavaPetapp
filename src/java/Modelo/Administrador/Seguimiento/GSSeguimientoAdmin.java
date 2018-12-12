package Modelo.Administrador.Seguimiento;

public class GSSeguimientoAdmin {

    private int cods;
    private int codp;

    public GSSeguimientoAdmin(int cods, int codp) {
        this.cods = cods;
        this.codp = codp;
    }

    public GSSeguimientoAdmin(int codp) {
        this.codp = codp;
    }

    public GSSeguimientoAdmin() {
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
    
}
