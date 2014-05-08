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
public class Lieu {

    private int id_l;
    private String nom_l;

    public Lieu(int id_l, String nom_l) {
        this.id_l = id_l;
        this.nom_l = nom_l;
    }

    public int getId_l() {
        return id_l;
    }

    public void setId_l(int id_l) {
        this.id_l = id_l;
    }

    public String getNom_l() {
        return nom_l;
    }

    public void setNom_l(String nom_l) {
        this.nom_l = nom_l;
    }

    @Override
    public String toString() {
        return "Lieu{" + "id_l=" + id_l + ", nom_l=" + nom_l + '}';
    }

}
