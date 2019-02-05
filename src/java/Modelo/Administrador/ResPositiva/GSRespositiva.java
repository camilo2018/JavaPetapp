/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Administrador.ResPositiva;

/**
 *
 * @author KnokinGm
 */
public class GSRespositiva {
    private int cod;
    private String ced;
    private String men;

    public GSRespositiva(int cod, String ced, String men) {
        this.cod = cod;
        this.ced = ced;
        this.men = men;
    }

    public GSRespositiva(String ced, String men) {
        this.ced = ced;
        this.men = men;
    }

    public GSRespositiva() {
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
