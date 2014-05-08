/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import dao.daoAnimal;
import dao.daoSoinConcernMedoc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import objet.Animal;
import objet.SoinConcernMedoc;

/**
 *
 * @author Super-Afg
 */
public class SoinConcerMedocMySQL implements daoSoinConcernMedoc {

    private static daoSoinConcernMedoc uniqueInstance = new SoinConcerMedocMySQL();

    public static daoSoinConcernMedoc getInstance() {
        return uniqueInstance;
    }

    @Override
    public boolean deleteSoinConcernMedoc(SoinConcernMedoc soin) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Delete  from soinconcernmedoc where id_soin = "
                + soin.getId_soin() + "" + " and id_m = "
                + soin.getId_m() + " and id_vaccin = '"
                + soin.getDate_SoinSQL() + "'");

        return ok;
    }

    @Override
    public boolean insertSoinConcernMedoc(SoinConcernMedoc soin) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Insert into soinconcernmedoc (id_soin,id_m, dosage) values ("
                + soin.getId_soin() + ","
                + soin.getId_m() + ",'" + soin.getDosage() + "')");

        return ok;
    }

    @Override
    public ArrayList<SoinConcernMedoc> selectSoinConcernMedoc() {
        ArrayList<SoinConcernMedoc> myList = new ArrayList();

        String req = "Select * from soinconcernmedoc";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new SoinConcernMedoc(resu.getInt(1), resu.getInt(2), resu.getString(3)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

    @Override
    public boolean updateSoinConcernMedoc(SoinConcernMedoc soin) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Update soinconcernmedoc set id_soin = "
                + "" + soin.getId_soin() + "" + ", id_m = "
                + "" + soin.getId_m() + "" + ", dosage= " + "'" + soin.getDosage() + "'" + " where id_soin = "
                + soin.getId_soin() + "" + " and id_m = "
                + soin.getId_m() + " and id_vaccin = '"
                + soin.getDate_SoinSQL() + "'");

        return ok;
    }

    @Override
    public ArrayList<SoinConcernMedoc> selectSoinConcernMedocPourModel(int id_animal) {
        ArrayList<SoinConcernMedoc> myList = new ArrayList();

        String req = "SELECT c.id_soin, c.id_m,  s.date_soin , t.nom_soin,s.note,c.dosage,m.nom_m,v.nom,v.prenom  FROM animal ani, soinconcernmedoc c , "
                + "soin s, medicament m, type_soin t, veterinaire v WHERE s.id_soin=c.id_soin and c.id_m=m.id_m and s.id_vet= v.id_vet and s.id_soin_type_soin = t.id_soin and s.id_a=ani.id_a and s.id_a =" + id_animal;

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new SoinConcernMedoc(resu.getInt(1), resu.getInt(2), resu.getDate(3), resu.getString(4), resu.getString(5), resu.getString(6), resu.getString(7), resu.getString(8), resu.getString(9)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

}
