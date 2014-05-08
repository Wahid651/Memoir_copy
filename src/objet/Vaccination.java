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
public class Vaccination {

    private int id_vaccination;
    private Date date_vacc;
    private Date date_rappel;
    private String observation;
    private int id_a;
    private int id_vaccin;
    private int id_vet;
    private String nom_vet;
    private String prenom_vet;
    private String nom_vaccin;

    public Vaccination(int id_vaccination, Date date_vacc, Date date_rappel, String observation, int id_a, int id_vaccin, int id_vet, String nom_vet, String prenom_vet, String nom_vaccin) {
        this.id_vaccination = id_vaccination;
        this.date_vacc = date_vacc;
        this.date_rappel = date_rappel;
        this.observation = observation;
        this.id_a = id_a;
        this.id_vaccin = id_vaccin;
        this.id_vet = id_vet;
        this.nom_vet = nom_vet;
        this.prenom_vet = prenom_vet;
        this.nom_vaccin = nom_vaccin;
    }

    public Vaccination(Date date_vacc, Date date_rappel, String observation, int id_a, int id_vaccin, int id_vet, String nom_vet, String prenom_vet, String nom_vaccin) {
        this.date_vacc = date_vacc;
        this.date_rappel = date_rappel;
        this.observation = observation;
        this.id_a = id_a;
        this.id_vaccin = id_vaccin;
        this.id_vet = id_vet;
        this.nom_vet = nom_vet;
        this.prenom_vet = prenom_vet;
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

    public String getNom_vaccin() {
        return nom_vaccin;
    }

    public void setNom_vaccin(String nom_vaccin) {
        this.nom_vaccin = nom_vaccin;
    }

    @Override
    public String toString() {
        return "Vaccination{" + "id_vaccination=" + id_vaccination + ", date_vacc=" + date_vacc + ", date_rappel=" + date_rappel + ", observation=" + observation + ", id_a=" + id_a + ", id_vaccin=" + id_vaccin + ", id_vet=" + id_vet + ", nom_vet=" + nom_vet + ", prenom_vet=" + prenom_vet + ", nom_vaccin=" + nom_vaccin + '}';
    }

   

    

    public int getId_vaccination() {
        return id_vaccination;
    }

    public void setId_vaccination(int id_vaccination) {
        this.id_vaccination = id_vaccination;
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

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public int getId_a() {
        return id_a;
    }

    public void setId_a(int id_a) {
        this.id_a = id_a;
    }

    public int getId_vaccin() {
        return id_vaccin;
    }

    public void setId_vaccin(int id_vaccin) {
        this.id_vaccin = id_vaccin;
    }

    public int getId_vet() {
        return id_vet;
    }

    public void setId_vet(int id_vet) {
        this.id_vet = id_vet;
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
       public String getDate_RappelQL() {
        String result;
        if (this.date_rappel == null) {
            result = "null";
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            result = sdf.format(this.date_rappel);
        }
        return result;
    }
  public String getDate_FormatBE() {
        String result;
        if (this.date_rappel == null) {
            result = "null";
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            result = sdf.format(this.date_rappel);
        }
        return result;
  }
          public String getDate_VaccFormatBE() {
        String result;
        if (this.date_vacc == null) {
            result = "null";
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            result = sdf.format(this.date_vacc);
        }
        return result;
    }
}
