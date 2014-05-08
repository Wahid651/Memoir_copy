/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objet;

/**
 *
 * @author Super-Afg
 */
public class Medicament {

    private int id_m;
    private String nom_m;
    private String discrip_m;

    public Medicament(int id_m, String nom_m, String discrip_m) {
        this.id_m = id_m;
        this.nom_m = nom_m;
        this.discrip_m = discrip_m;
    }

    public Medicament(String nom_m, String discrip_m) {
        this.nom_m = nom_m;
        this.discrip_m = discrip_m;
    }

    @Override
    public String toString() {
        return "Medicament{" + "id_m=" + id_m + ", nom_m=" + nom_m + ", discrip_m=" + discrip_m + '}';
    }

    public int getId_m() {
        return id_m;
    }

    public void setId_m(int id_m) {
        this.id_m = id_m;
    }

    public String getNom_m() {
        return nom_m;
    }

    public void setNom_m(String nom_m) {
        this.nom_m = nom_m;
    }

    public String getDiscrip_m() {
        return discrip_m;
    }

    public void setDiscrip_m(String discrip_m) {
        this.discrip_m = discrip_m;
    }
}
