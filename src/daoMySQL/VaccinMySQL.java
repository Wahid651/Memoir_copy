/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import dao.daoSoin;
import dao.daoVaccin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import objet.Vaccin;

/**
 *
 * @author Super-Afg
 */
public class VaccinMySQL implements daoVaccin {

    private static daoVaccin uniqueInstance = new VaccinMySQL();

    public static daoVaccin getInstance() {
        return uniqueInstance;
    }

    @Override
    public boolean updateVaccin(Vaccin soin) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Update vaccin set nom_vaccin = "
                + "'" + soin.getNom_vaccin() + "'" + ", discrip_vaccin = " + "'" + soin.getDiscrip_vaccin() + "'" + " where id_vaccin = " + soin.getId_vaccin());

        return ok;
    }

    @Override
    public boolean insertVaccin(Vaccin soin) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Insert into vaccin (nom_vaccin,discrip_vaccin) values ('" + soin.getNom_vaccin() + "','" + soin.getDiscrip_vaccin() + "')");

        return ok;
    }

    @Override
    public ArrayList<Vaccin> selectVaccin() {
        ArrayList<Vaccin> myList = new ArrayList();

        String req = "Select * from vaccin";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Vaccin(resu.getInt(1), resu.getString(2), resu.getString(3)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

    @Override
    public boolean deleteVaccin(Vaccin soin) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Delete  from vaccin where id_vaccin = "
                + soin.getId_vaccin() + "");

        return ok;
    }

}
