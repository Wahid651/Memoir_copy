/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objet;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Super-Afg
 */
public class SoinConcernMedoc {

    private int id_soin;
    private int id_m;
    private Date date_soin;
    private String nom_soin;
    private String note;
    private String dosage;
    private String nom_m;
    private String nom;
    private String prenom;

    public SoinConcernMedoc(int id_soin, int id_m, String dosage) {
        this.id_soin = id_soin;
        this.id_m = id_m;
        this.dosage = dosage;
    }

    public SoinConcernMedoc(int id_soin, int id_m, Date date_soin, String nom_soin, String note, String dosage, String nom_m, String nom, String prenom) {
        this.id_soin = id_soin;
        this.id_m = id_m;
        this.date_soin = date_soin;
        this.nom_soin = nom_soin;
        this.note = note;
        this.dosage = dosage;
        this.nom_m = nom_m;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Date getDate_soin() {
        return date_soin;
    }

    public void setDate_soin(Date date_soin) {
        this.date_soin = date_soin;
    }

    public String getNom_soin() {
        return nom_soin;
    }

    public void setNom_soin(String nom_soin) {
        this.nom_soin = nom_soin;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNom_m() {
        return nom_m;
    }

    public void setNom_m(String nom_m) {
        this.nom_m = nom_m;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "SoinConcernMedoc{" + "id_soin=" + id_soin + ", id_m=" + id_m + ", dosage=" + dosage + '}';
    }

    public int getId_soin() {
        return id_soin;
    }

    public void setId_soin(int id_soin) {
        this.id_soin = id_soin;
    }

    public int getId_m() {
        return id_m;
    }

    public void setId_m(int id_m) {
        this.id_m = id_m;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getDate_SoinSQL() {
        String result;
        if (this.date_soin == null) {
            result = "null";
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            result = sdf.format(this.date_soin);
        }
        return result;
    }
     public String getDate_SoinFormatBE() {
        String result;
        if (this.date_soin == null) {
            result = "null";
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            result = sdf.format(this.date_soin);
        }
        return result;
    }
}
