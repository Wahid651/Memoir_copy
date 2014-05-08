/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
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
public class Animal {

    private int id_a;
    private String nom;
    private String Localisation;
    private String Espece;
    private String Race;
    private String sexe;
    private String ident_puce;
    private String type_puce;
    private String puce_loc;
    private String couleur;
    private String poil;
    private int sterile;
    private int vermifuge;
    private Date age;
    private Date date_entre;
    private String raison;
    private int dispo;
    private Date date_depart;
    private String raison_depart;
    private String carateristique;
    private String discription;
    private int id_r;
    private int id_p;
    private int id_lieu;
    private String photo;
    private Date date_vermifuge;
    private Date date_sterile;
    private int id_vet;
    private int nbStat;
    private Date date_adoption;
    private Date date_vacc;
    private Date date_vacc_rappel;
    private String observation;
    private String nom_vaccin;

    public Animal(int id_a, String Espece, String Race, String ident_puce, Date date_vacc, Date date_vacc_rappel, String observation, String nom_vaccin) {
        this.id_a = id_a;
        this.Espece = Espece;
        this.Race = Race;
        this.ident_puce = ident_puce;
        this.date_vacc = date_vacc;
        this.date_vacc_rappel = date_vacc_rappel;
        this.observation = observation;
        this.nom_vaccin = nom_vaccin;
    }
    

    public Animal(Date date_adoption, String nom, String Race, String Espece, String sexe, String couleur, String ident_puce, Date age) {
        this.date_adoption = date_adoption;
        this.nom = nom;
        this.Race = Race;
        this.Espece = Espece;
        this.sexe = sexe;
        this.ident_puce = ident_puce;
        this.couleur = couleur;
        this.poil = poil;
        this.age = age;
    }

    public Date getDate_adoption() {
        return date_adoption;
    }

    public void setDate_adoption(Date date_adoption) {
        this.date_adoption = date_adoption;
    }

    public Animal(String raison, int nbStat) {
        this.raison = raison;
        this.nbStat = nbStat;
    }

    public Animal(int id_a) {
        this.id_a = id_a + 1;
    }

    public Animal(int id_a, String nom, String Localisation, String Espece, String Race, String sexe, String ident_puce, String type_puce, String puce_loc, String couleur, String taille, int sterile, int vermifuge, Date age, Date date_entre, String raison, int dispo, Date date_depart, String raison_depart, String carateristique, String discription, int id_r, int id_p, int id_lieu, String photo, Date date_vermifuge, Date date_sterile, int id_vet) {
        this.id_a = id_a;
        this.nom = nom;
        this.Localisation = Localisation;
        this.Espece = Espece;
        this.Race = Race;
        this.sexe = sexe;
        this.ident_puce = ident_puce;
        this.type_puce = type_puce;
        this.puce_loc = puce_loc;
        this.couleur = couleur;
        this.poil = taille;
        this.sterile = sterile;
        this.vermifuge = vermifuge;
        this.age = age;
        this.date_entre = date_entre;
        this.raison = raison;
        this.dispo = dispo;
        this.date_depart = date_depart;
        this.raison_depart = raison_depart;
        this.carateristique = carateristique;
        this.discription = discription;
        this.id_r = id_r;
        this.id_p = id_p;
        this.id_lieu = id_lieu;
        this.photo = photo;
        this.date_vermifuge = date_vermifuge;
        this.date_sterile = date_sterile;
        this.id_vet = id_vet;
    }

    public Animal(int id_a, String nom, String Localisation, String Espece, String Race, String sexe, String taille, String couleur, String ident_puce, Date date_entre) {
        this.id_a = id_a;
        this.nom = nom;
        this.Localisation = Localisation;
        this.Espece = Espece;
        this.Race = Race;
        this.sexe = sexe;
        this.ident_puce = ident_puce;
        this.couleur = couleur;
        this.poil = taille;
        this.date_entre = date_entre;
    }

    public Animal(int id_a, String nom, String sexe, String ident_puce, String type_puce, String puce_loc, String couleur, String taille, int sterile, int vermifuge, Date age, Date date_entre, String raison, int dispo, Date date_depart, String raison_depart, String carateristique, String discription, int id_r, int id_p, int id_lieu, String photo, Date date_vermifuge, Date date_sterile, int id_vet) {
        //  this.id_a = id_a;
        this.nom = nom;
        this.sexe = sexe;
        this.ident_puce = ident_puce;
        this.type_puce = type_puce;
        this.puce_loc = puce_loc;
        this.couleur = couleur;
        this.poil = taille;
        this.sterile = sterile;
        this.vermifuge = vermifuge;
        this.age = age;
        this.date_entre = date_entre;
        this.raison = raison;
        this.dispo = dispo;
        this.date_depart = date_depart;
        this.raison_depart = raison_depart;
        this.carateristique = carateristique;
        this.discription = discription;
        this.id_r = id_r;
        this.id_p = id_p;
        this.id_lieu = id_lieu;
        this.photo = photo;
        this.date_vermifuge = date_vermifuge;
        this.date_sterile = date_sterile;
        this.id_vet = id_vet;
    }

    public int getNbStat() {
        return nbStat;
    }

    public void setNbStat(int nbStat) {
        this.nbStat = nbStat;
    }

    @Override
    public String toString() {
        return "Animal{" + "id_a=" + "\n" + id_a + ", nom=" + nom + ", Localisation=" + Localisation + "\n" + ", Espece=" + Espece + ", Race=" + Race + ", sexe=" + sexe + ", ident_puce=" + ident_puce + ", type_puce=" + type_puce + ", puce_loc=" + puce_loc + ", couleur=" + couleur + ", taille=" + poil + ", sterile=" + sterile + ", vermifuge=" + vermifuge + ", age=" + age + ", date_entre=" + date_entre + ", raison=" + raison + ", dispo=" + dispo + ", date_depart=" + date_depart + ", raison_depart=" + raison_depart + ", carateristique=" + carateristique + ", discription=" + discription + ", id_r=" + id_r + ", id_p=" + id_p + ", id_lieu=" + id_lieu + ", photo=" + photo + ", date_vermifuge=" + date_vermifuge + ", date_sterile=" + date_sterile + ", id_vet=" + id_vet + '}';
    }

    public int getId_vet() {
        return id_vet;
    }

    public void setId_vet(int id_vet) {
        this.id_vet = id_vet;
    }

    public int getVermifuge() {
        return vermifuge;
    }

    public void setVermifuge(int vermifuge) {
        this.vermifuge = vermifuge;
    }

    public Date getDate_vermifuge() {
        return date_vermifuge;
    }

    public void setDate_vermifuge(Date date_vermifuge) {
        this.date_vermifuge = date_vermifuge;
    }

    public Date getDate_sterile() {
        return date_sterile;
    }

    public void setDate_sterile(Date date_sterile) {
        this.date_sterile = date_sterile;
    }

    public int getId_a() {
        return id_a;
    }

    public void setId_a(int id_a) {
        this.id_a = id_a;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLocalisation() {
        return Localisation;
    }

    public void setLocalisation(String Localisation) {
        this.Localisation = Localisation;
    }

    public String getEspece() {
        return Espece;
    }

    public void setEspece(String Espece) {
        this.Espece = Espece;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String Race) {
        this.Race = Race;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getIdent_puce() {
        return ident_puce;
    }

    public void setIdent_puce(String ident_puce) {
        this.ident_puce = ident_puce;
    }

    public String getType_puce() {
        return type_puce;
    }

    public void setType_puce(String type_puce) {
        this.type_puce = type_puce;
    }

    public String getPuce_loc() {
        return puce_loc;
    }

    public void setPuce_loc(String puce_loc) {
        this.puce_loc = puce_loc;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getPoil() {
        return poil;
    }

    public void setPoil(String poil) {
        this.poil = poil;
    }

    public int getSterile() {
        return sterile;
    }

    public void setSterile(int sterile) {
        this.sterile = sterile;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public Date getDate_entre() {
        return date_entre;
    }

    public void setDate_entre(Date date_entre) {
        this.date_entre = date_entre;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }

    public int getDispo() {
        return dispo;
    }

    public void setDispo(int dispo) {
        this.dispo = dispo;
    }

    public Date getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }

    public String getRaison_depart() {
        return raison_depart;
    }

    public void setRaison_depart(String raison_depart) {
        this.raison_depart = raison_depart;
    }

    public String getCarateristique() {
        return carateristique;
    }

    public void setCarateristique(String carateristique) {
        this.carateristique = carateristique;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getId_r() {
        return id_r;
    }

    public void setId_r(int id_r) {
        this.id_r = id_r;
    }

    public int getId_p() {
        return id_p;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
    }

    public int getId_lieu() {
        return id_lieu;
    }

    public void setId_lieu(int id_lieu) {
        this.id_lieu = id_lieu;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    /*permet de parser la date pour Mysql*/

    public String getAgeSQL() {
        String result;
        if (this.age == null) {
            result = "null";
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            result = sdf.format(this.age);
        }
        return result;
    }

    public String getDateEntreSQL() {
        String result;
        if (this.date_entre == null) {
            result = "null";
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            result = sdf.format(this.date_entre);
        }
        return result;
    }

    public String getDateDepartSQL() {
        String result;
        if (this.date_depart == null) {
            result = "null";
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            result = sdf.format(this.date_depart);
        }
        return result;
    }

    public String getDateVermifugeSQL() {
        String result;
        if (this.date_vermifuge == null) {
            result = "null";
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            result = sdf.format(this.date_vermifuge);
        }
        return result;
    }

    public String getDateSterileSQL() {
        String result;
        if (this.date_sterile == null) {
            result = "null";
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            result = sdf.format(this.date_sterile);
        }
        return result;
    }

    public String AnimalContrat() {
        return "Animal{" + "Nom : \t"+ nom + ", Puce \t" + ident_puce+ "\n" + ", Espece=" + Espece + ", Race=" + Race + ", sexe=" + sexe + ", ident_puce=" + ident_puce + ", type_puce=" + type_puce + ", puce_loc=" + puce_loc + ", couleur=" + couleur + ", taille=" + poil + ", sterile=" + sterile + ", vermifuge=" + vermifuge + ", age=" + age + ", date_entre=" + date_entre + ", raison=" + raison + ", dispo=" + dispo + ", date_depart=" + date_depart + ", raison_depart=" + raison_depart + ", carateristique=" + carateristique + ", discription=" + discription + ", id_r=" + id_r + ", id_p=" + id_p + ", id_lieu=" + id_lieu + ", photo=" + photo + ", date_vermifuge=" + date_vermifuge + ", date_sterile=" + date_sterile + ", id_vet=" + id_vet + '}';
    }

    public Date getDate_vacc() {
        return date_vacc;
    }

    public void setDate_vacc(Date date_vacc) {
        this.date_vacc = date_vacc;
    }

    public Date getDate_vacc_rappel() {
        return date_vacc_rappel;
    }

    public void setDate_vacc_rappel(Date date_vacc_rappel) {
        this.date_vacc_rappel = date_vacc_rappel;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getNom_vaccin() {
        return nom_vaccin;
    }

    public void setNom_vaccin(String nom_vaccin) {
        this.nom_vaccin = nom_vaccin;
    }
    
}
