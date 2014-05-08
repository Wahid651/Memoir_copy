/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import dao.daoLieu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import objet.Lieu;

/**
 *
 * @author Super-Afg
 */
public class LieuMySQL implements daoLieu {

    private static daoLieu uniqueIsntance = new LieuMySQL();

    public static daoLieu getInstance() {
        return uniqueIsntance;
    }

    @Override
    public boolean deleteLieu(Lieu MyLieu) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Delete  from lieu where  id_l"
                + " = "
                + MyLieu.getId_l());

        return ok;
    }

    @Override
    public boolean insertLieu(Lieu MyLieu) {

        boolean ok = ConnexionMySQL.getInstance().actionQuery("Insert into lieu(id_l, nom) values ( " + MyLieu.getId_l() + ",'" + MyLieu.getNom_l() + "')");

        return ok;
    }

    @Override
    public ArrayList<Lieu> selectLieu() {
        ArrayList<Lieu> myList = new ArrayList();

        String req = "Select * from lieu";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Lieu(resu.getInt(1), resu.getString(2)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

    @Override
    public boolean updateLieu(Lieu MyLieu) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Update lieu set  nom = " + "'" + MyLieu.getNom_l() + "'"
                + " where id_l = " + MyLieu.getId_l());

        return ok;
    }

}
