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
/*SELECT vac.date_vacc, est.`date_rappel`, est.`id_vaccin`,v.nom_vaccin,vet.nom,
 vet.prenom FROM `estvacciner` est, veterinaire vet, vaccin v, vaccination vac, animal 
 a WHERE est.id_vaccination = vac.id_vaccination and est.id_vaccin = v.id_vaccin and vac.id_a 
 =a.id_a and vac.id_vet = vet.id_vet and a.id = 3*/
public class EstVacciner {

    private int id_vaccination;
    private int id_vaccin;
    private Date date_vacc;
    private Date date_rappel;
    private String nom_vaccin;
    private String nom_vet;
    private String prenom_vet;

    public EstVacciner(int id_vaccination, int id_vaccin, Date date_vacc, Date date_rappel, String nom_vaccin, String nom_vet, String prenom_vet) {
        this.id_vaccination = id_vaccination;
        this.id_vaccin = id_vaccin;
        this.date_vacc = date_vacc;
        this.date_rappel = date_rappel;
        this.nom_vaccin = nom_vaccin;
        this.nom_vet = nom_vet;
        this.prenom_vet = prenom_vet;

    }

    public int getId_vaccination() {
        return id_vaccination;
    }

    public void setId_vaccination(int id_vaccination) {
        this.id_vaccination = id_vaccination;
    }

    public int getId_vaccin() {
        return id_vaccin;
    }

    public void setId_vaccin(int id_vaccin) {
        this.id_vaccin = id_vaccin;
    }

    public Date getDate_vacc() {
        return date_vacc;
    }

    public void setDate_vacc(Date date_vacc) {
        this.date_vacc = date_vacc;
    }

    public Date getDate_rappel() {
        return date_rappel;
    }

    public void setDate_rappel(Date date_rappel) {
        this.date_rappel = date_rappel;
    }

    public String getNom_vaccin() {
        return nom_vaccin;
    }

    public void setNom_vaccin(String nom_vaccin) {
        this.nom_vaccin = nom_vaccin;
    }

    public String getNom_vet() {
        return nom_vet;
    }

    public void setNom_vet(String nom_vet) {
        this.nom_vet = nom_vet;
    }

    public String getPrenom_vet() {
        return prenom_vet;
    }

    public void setPrenom_vet(String prenom_vet) {
        this.prenom_vet = prenom_vet;
    }

    @Override
    public String toString() {
        return "EstVaccciner{" + "id_vaccination=" + id_vaccination + ", id_vaccin=" + id_vaccin + ", date_vacc=" + date_vacc + ", date_rappel=" + date_rappel + ", nom_vaccin=" + nom_vaccin + ", nom_vet=" + nom_vet + ", prenom_vet=" + prenom_vet + '}';
    }

    public String getDate_RappelSQL() {
        String result;
        if (this.date_rappel == null) {
            result = "null";
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            result = sdf.format(this.date_rappel);
        }
        return result;
    }

    public String getDate_VaccSQL() {
        String result;
        if (this.date_vacc == null) {
            result = "null";
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            result = sdf.format(this.date_vacc);
        }
        return result;
    }
}
