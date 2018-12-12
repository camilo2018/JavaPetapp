package Modelo.Administrador.Funcionario;

public class GSFuncionario {
    
    private String cedulafuncionario;
    private String telefonofuncionario;
    private String nombrefuncionario;
    private String correofuncionario;
    private int rolfuncionario;

    public GSFuncionario(String cedulafuncionario, String telefonofuncionario, String nombrefuncionario, String correofuncionario, int rolfuncionario) {
        this.cedulafuncionario = cedulafuncionario;
        this.telefonofuncionario = telefonofuncionario;
        this.nombrefuncionario = nombrefuncionario;
        this.correofuncionario = correofuncionario;
        this.rolfuncionario = rolfuncionario;
    }

    public GSFuncionario(String cedulafuncionario) {
        this.cedulafuncionario = cedulafuncionario;
    }

    public GSFuncionario() {
    }

    public String getCedulafuncionario() {
        return cedulafuncionario;
    }

    public void setCedulafuncionario(String cedulafuncionario) {
        this.cedulafuncionario = cedulafuncionario;
    }

    public String getTelefonofuncionario() {
        return telefonofuncionario;
    }

    public void setTelefonofuncionario(String telefonofuncionario) {
        this.telefonofuncionario = telefonofuncionario;
    }

    public String getNombrefuncionario() {
        return nombrefuncionario;
    }

    public void setNombrefuncionario(String nombrefuncionario) {
        this.nombrefuncionario = nombrefuncionario;
    }

    public String getCorreofuncionario() {
        return correofuncionario;
    }

    public void setCorreofuncionario(String correofuncionario) {
        this.correofuncionario = correofuncionario;
    }

    public int getRolfuncionario() {
        return rolfuncionario;
    }

    public void setRolfuncionario(int rolfuncionario) {
        this.rolfuncionario = rolfuncionario;
    }
    
}
