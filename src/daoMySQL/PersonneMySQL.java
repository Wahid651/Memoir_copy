/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import dao.daoPersonne;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import objet.Personne;

/**
 *
 * @author Super-Afg
 */
public class PersonneMySQL implements daoPersonne {

    private static daoPersonne UniquerInstance = new PersonneMySQL();

    public static daoPersonne getInstance() {
        return UniquerInstance;
    }

    @Override
    public boolean deletePersonne(Personne pers) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Delete  from personne where id_p = "
                + pers.getId_p() + "");
        return ok;
    }

    @Override
    public boolean insertPersonne(Personne pers) {

        boolean ok = ConnexionMySQL.getInstance().actionQuery("INSERT INTO personne(id_p, nom, prenom, adress,code_postal,ville,"
                + " tel, mail, note, chk_home, date_chk, est_bannie, est_membre, est_donateur, est_volontaire, est_autre_refuge,"
                + " est_refuge_pers, est_revendeur, mobile ) values (" + pers.getId_p() + ",'" + pers.getNom()
                + "','" + pers.getPrenom() + "','" + pers.getAdress() + "'," + pers.getCode_postal() + ",'" + pers.getVille() + "','" + pers.getTel() + "','" + pers.getMail() + "','"
                + pers.getNote() + "'," + pers.getCkh_home() + ",'" + pers.getDate_ChkSQL() + "'," + pers.getEst_bannie() + "," + pers.getEst_membre() + ","
                + "" + pers.getEst_donateur() + "," + pers.getEst_volontaire() + "," + pers.getEst_autre_refuge() + "," + pers.getEst_refuge_pers() + "," + pers.getEst_renvendeur() + ",'" + pers.getMobile() + "')");

        return ok;
    }

    @Override
    public ArrayList<Personne> selectPersonne() {
        ArrayList<Personne> myList = new ArrayList();

        String req = "Select * from personne";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Personne(resu.getInt(1), resu.getString(2), resu.getString(3), resu.getString(4), resu.getInt(5), resu.getString(6), resu.getString(7), resu.getString(8), resu.getString(9), resu.getInt(10), resu.getDate(11), resu.getInt(12), resu.getInt(13), resu.getInt(14),
                        resu.getInt(15), resu.getInt(16), resu.getInt(17), resu.getInt(18), resu.getString(19)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

    @Override
    public boolean updatePersonne(Personne pers) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Update personne set nom = "
                + "'" + pers.getNom() + "'" + ", prenom = " + "'" + pers.getPrenom() + "'" + ", adress = " + "'" + pers.getAdress() + "'"
                + ", code_postal = " + "" + pers.getCode_postal() + ""
                + ", ville = " + "'" + pers.getVille() + "'"
                + ", mail = " + "'" + pers.getMail() + "'" + ", tel = " + "'" + pers.getTel() + "'"
                + ", note = " + "'" + pers.getNote() + "'" + ", chk_home = " + "" + pers.getCkh_home() + "" + ", date_chk = " + "'" + pers.getDate_ChkSQL() + "'"
                + ", est_bannie = " + "" + pers.getEst_bannie() + "" + ", est_membre = " + "" + pers.getEst_membre() + ""
                + ", est_donateur = " + "" + pers.getEst_donateur() + "" + ", est_volontaire = " + "" + pers.getEst_volontaire() + ""
                + ", est_autre_refuge = " + "" + pers.getEst_autre_refuge() + "" + ", est_refuge_pers = " + "" + pers.getEst_refuge_pers() + ""
                + ", est_revendeur = " + "" + pers.getEst_renvendeur() + ""
                + ", mobile = " + "'" + pers.getMobile() + "'" + " where id_p = " + pers.getId_p());

        return ok;
    }

    @Override
    public ArrayList<Personne> selectPersonneParNomEtPrenom(String Nom, String Prenom, String Ville) {
        ArrayList<Personne> myList = new ArrayList();

        String req = "Select * from personne where nom like '" + Nom + "'" + " and prenom like '" + Prenom + "'"+ " and ville like '" + Ville + "'" +"order by 2";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Personne(resu.getInt(1), resu.getString(2), resu.getString(3), resu.getString(4), resu.getInt(5), resu.getString(6), resu.getString(7), resu.getString(8), resu.getString(9), resu.getInt(10), resu.getDate(11), resu.getInt(12), resu.getInt(13), resu.getInt(14),
                        resu.getInt(15), resu.getInt(16), resu.getInt(17), resu.getInt(18), resu.getString(19)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }
 

}
