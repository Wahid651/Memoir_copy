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
public class Vaccin {

    private int id_vaccin;
    private String nom_vaccin;
    private String discrip_vaccin;

    public Vaccin(int id_vaccin, String nom_vaccin, String discrip_vaccin) {
        this.id_vaccin = id_vaccin;
        this.nom_vaccin = nom_vaccin;
        this.discrip_vaccin = discrip_vaccin;
    }

    public Vaccin(String nom_vaccin, String discrip_vaccin) {
        this.nom_vaccin = nom_vaccin;
        this.discrip_vaccin = discrip_vaccin;
    }

    @Override
    public String toString() {
        return "Vaccin{" + "id_vaccin=" + id_vaccin + ", nom_vaccin=" + nom_vaccin + ", discrip_vaccin=" + discrip_vaccin + '}';
    }

    public int getId_vaccin() {
        return id_vaccin;
    }

    public void setId_vaccin(int id_vaccin) {
        this.id_vaccin = id_vaccin;
    }

    public String getNom_vaccin() {
        return nom_vaccin;
    }

    public void setNom_vaccin(String nom_vaccin) {
        this.nom_vaccin = nom_vaccin;
    }

    public String getDiscrip_vaccin() {
        return discrip_vaccin;
    }

    public void setDiscrip_vaccin(String discrip_vaccin) {
        this.discrip_vaccin = discrip_vaccin;
    }
}
