/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objet;

/**
 *
 * @author Super-Afg
 */
public class Type_soin {

    private int id_soin;
    private String nom_soin;
    private String discrip_soin;

    public Type_soin(int id_soin, String nom_soin, String discrip_soin) {
        this.id_soin = id_soin;
        this.nom_soin = nom_soin;
        this.discrip_soin = discrip_soin;
    }

    public Type_soin(String nom_soin, String discrip_soin) {
        this.nom_soin = nom_soin;
        this.discrip_soin = discrip_soin;
    }

    @Override
    public String toString() {
        return "Type_soin{" + "id_soin=" + id_soin + ", nom_soin=" + nom_soin + ", discrip_soin=" + discrip_soin + '}';
    }

    public int getId_soin() {
        return id_soin;
    }

    public void setId_soin(int id_soin) {
        this.id_soin = id_soin;
    }

    public String getNom_soin() {
        return nom_soin;
    }

    public void setNom_soin(String nom_soin) {
        this.nom_soin = nom_soin;
    }

    public String getDiscrip_soin() {
        return discrip_soin;
    }

    public void setDiscrip_soin(String discrip_soin) {
        this.discrip_soin = discrip_soin;
    }
}
