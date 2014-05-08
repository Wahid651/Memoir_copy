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
public class Personne {

    private int id_p;
    private String nom;
    private String prenom;
    private String adress;
    private int code_postal;
    private String ville;
    private String tel;
    private String mail;
    private String note;
    private int ckh_home;
    private Date date_chk;
    private int est_bannie;
    private int est_membre;
    private int est_donateur;
    private int est_volontaire;
    private int est_autre_refuge;
    private int est_refuge_pers;
    private int est_renvendeur;
    private String mobile;

    public Personne(int id_p, String nom, String prenom, String adress, int code_postal, String ville, String tel, String mail, String note, int ckh_home, Date date_chk, int est_bannie, int est_membre, int est_donateur, int est_volontaire, int est_autre_refuge, int est_refuge_pers, int est_renvendeur, String mobile) {
        this.id_p = id_p;
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
        this.code_postal = code_postal;
        this.ville = ville;
        this.tel = tel;
        this.mail = mail;
        this.note = note;
        this.ckh_home = ckh_home;
        this.date_chk = date_chk;
        this.est_bannie = est_bannie;
        this.est_membre = est_membre;
        this.est_donateur = est_donateur;
        this.est_volontaire = est_volontaire;
        this.est_autre_refuge = est_autre_refuge;
        this.est_refuge_pers = est_refuge_pers;
        this.est_renvendeur = est_renvendeur;
        this.mobile = mobile;
    }

    public Personne(String nom, String prenom, String adress, int code_postal, String ville, String tel, String mail, String note, int ckh_home, Date date_chk, int est_bannie, int est_membre, int est_donateur, int est_volontaire, int est_autre_refuge, int est_refuge_pers, int est_renvendeur, String mobile) {
        //       this.id_p = id_p;
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
        this.code_postal = code_postal;
        this.ville = ville;
        this.tel = tel;
        this.mail = mail;
        this.note = note;
        this.ckh_home = ckh_home;
        this.date_chk = date_chk;
        this.est_bannie = est_bannie;
        this.est_membre = est_membre;
        this.est_donateur = est_donateur;
        this.est_volontaire = est_volontaire;
        this.est_autre_refuge = est_autre_refuge;
        this.est_refuge_pers = est_refuge_pers;
        this.est_renvendeur = est_renvendeur;
        this.mobile = mobile;
    }

    public int getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(int code_postal) {
        this.code_postal = code_postal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Personne{" + "id_p=" + id_p + ", nom=" + nom + ", prenom=" + prenom + ", adress=" + adress + ", code_postal=" + code_postal + ", ville=" + ville + ", tel=" + tel + ", mail=" + mail + ", note=" + note + ", ckh_home=" + ckh_home + ", date_chk=" + date_chk + ", est_bannie=" + est_bannie + ", est_membre=" + est_membre + ", est_donateur=" + est_donateur + ", est_volontaire=" + est_volontaire + ", est_autre_refuge=" + est_autre_refuge + ", est_refuge_pers=" + est_refuge_pers + ", est_renvendeur=" + est_renvendeur + ", mobile=" + mobile + '}';
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getId_p() {
        return id_p;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getCkh_home() {
        return ckh_home;
    }

    public void setCkh_home(int ckh_home) {
        this.ckh_home = ckh_home;
    }

    public Date getDate_chk() {
        return date_chk;
    }

    public void setDate_chk(Date date_chk) {
        this.date_chk = date_chk;
    }

    public int getEst_bannie() {
        return est_bannie;
    }

    public void setEst_bannie(int est_bannie) {
        this.est_bannie = est_bannie;
    }

    public int getEst_membre() {
        return est_membre;
    }

    public void setEst_membre(int est_membre) {
        this.est_membre = est_membre;
    }

    public int getEst_donateur() {
        return est_donateur;
    }

    public void setEst_donateur(int est_donateur) {
        this.est_donateur = est_donateur;
    }

    public int getEst_volontaire() {
        return est_volontaire;
    }

    public void setEst_volontaire(int est_volontaire) {
        this.est_volontaire = est_volontaire;
    }

    public int getEst_autre_refuge() {
        return est_autre_refuge;
    }

    public void setEst_autre_refuge(int est_autre_refuge) {
        this.est_autre_refuge = est_autre_refuge;
    }

    public int getEst_refuge_pers() {
        return est_refuge_pers;
    }

    public void setEst_refuge_pers(int est_refuge_pers) {
        this.est_refuge_pers = est_refuge_pers;
    }

    public int getEst_renvendeur() {
        return est_renvendeur;
    }

    public void setEst_renvendeur(int est_renvendeur) {
        this.est_renvendeur = est_renvendeur;
    }

    public String getDate_ChkSQL() {
        String result;
        if (this.date_chk == null) {
            result = "null";
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            result = sdf.format(this.date_chk);
        }
        return result;
    }

}
