/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import dao.daoAnimal;
import dao.daoAnimalSoin;
import dao.daoSoin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import objet.Soin;
import objet.Soin;

/**
 *
 * @author Super-Afg
 */
public class AnimalSoinMySQL implements daoAnimalSoin {

    private static daoAnimalSoin uniqueInstance = new AnimalSoinMySQL();

    public static daoAnimalSoin getInstance() {
        return uniqueInstance;
    }

    public boolean deleteSoin(Soin soin) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Delete  from soin where id_soin = "
                + soin.getId_soin() + "");

        return ok;
    }

    public boolean insertSoin(Soin soin) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Insert into soin (date_soin, note, id_a, id_soin_type_soin, id_vet) values ('"
                + soin.getDate_SoinSQL() + "','" + soin.getNote() + "',"
                + soin.getId_a() + "," + soin.getId_soin_type_soin() + "," + soin.getId_vet() + ")");

        return ok;
    }

    public ArrayList<Soin> selectSoin() {
        ArrayList<Soin> myList = new ArrayList();

        String req = "Select * from soin";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Soin(resu.getInt(1), resu.getDate(2), resu.getString(3), resu.getInt(4), resu.getInt(5), resu.getInt(6)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

    public boolean updateSoin(Soin soin) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Update soin set date_soin = "
                + "'" + soin.getDate_SoinSQL() + "'" + ", note = " + "'" + soin.getNote() + "'"
                + ", id_a = " + "" + soin.getId_a() + "" + ", id_soin_type_soin = " + "" + soin.getId_soin_type_soin() + ""
                + ", id_vet = " + "" + soin.getId_vet() + "" + " where id_soin = " + soin.getId_soin());

        return ok;
    }

    @Override
    public int selectlastid() {
        ArrayList<Soin> myList = new ArrayList();
        int retour = 0;
        String req = "SELECT MAX(id_soin) from soin";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                retour = resu.getInt(1);
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return retour;
    }

}
