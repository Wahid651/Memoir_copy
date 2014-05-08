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
public class Veterinaire {

    private int id_vet;
    private String nom;
    private String prenom;
    private String adress;
    private int code_postal;
    private String ville;
    private String tel;
    private String mobile;

    public Veterinaire(int id_vet, String nom, String prenom, String adress, int code_postal, String ville, String tel, String mobile) {
        this.id_vet = id_vet;
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
        this.code_postal = code_postal;
        this.ville = ville;
        this.tel = tel;
        this.mobile = mobile;
    }

    public Veterinaire(String nom, String prenom, String adress, int code_postal, String ville, String tel, String mobile) {
        this.nom = nom;
        this.prenom = prenom;
        this.adress = adress;
        this.code_postal = code_postal;
        this.ville = ville;
        this.tel = tel;
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

    public int getId_vet() {
        return id_vet;
    }

    public void setId_vet(int id_vet) {
        this.id_vet = id_vet;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Veterinaire{" + "id_vet=" + id_vet + ", nom=" + nom + ", prenom=" + prenom + ", adress=" + adress + ", code_postal=" + code_postal + ", ville=" + ville + ", tel=" + tel + ", mobile=" + mobile + '}';
    }

}
