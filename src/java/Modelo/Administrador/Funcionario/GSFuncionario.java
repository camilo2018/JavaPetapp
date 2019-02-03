package Modelo.Administrador.Funcionario;

public class GSFuncionario {
    
    private String ced;
    private String tel;
    private String nom;
    private String cor;

    public GSFuncionario(String ced, String tel, String nom, String cor) {
        this.ced = ced;
        this.tel = tel;
        this.nom = nom;
        this.cor = cor;
    }

    public GSFuncionario() {
    }

    public String getCed() {
        return ced;
    }

    public void setCed(String ced) {
        this.ced = ced;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
}
