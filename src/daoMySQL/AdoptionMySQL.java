/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import dao.daoAdoption;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import objet.Adoption;

/**
 *
 * @author Super-Afg
 */
public class AdoptionMySQL implements daoAdoption {

    private static daoAdoption uniqueInstance = new AdoptionMySQL();

    public static daoAdoption getInstance() {
        return uniqueInstance;
    }

    @Override
    public boolean deleteAdoption(Adoption myAdopt) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Delete  from adoption where id_adoption = "
                + myAdopt.getId_adoption() + "");

        return ok;
    }

    @Override
    public boolean insertAdoption(Adoption myAdopt) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Insert into adoption (date_adoption, id_a, id_p) values ('" + myAdopt.getDateAdoptionSQL() + "'," + myAdopt.getId_a() + "," + myAdopt.getId_p() + ")");

        return ok;
    }

    @Override
    public ArrayList<Adoption> selectAdoption() {
        ArrayList<Adoption> myList = new ArrayList();

        String req = "Select * from type_soin";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Adoption(resu.getInt(1), resu.getDate(2), resu.getInt(3), resu.getInt(4)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

    @Override
    public boolean updateAdoption(Adoption myAdopt) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Update adoption set date_adoption = "
                + "'" + myAdopt.getDateAdoptionSQL() + "'" + ", id_a = " + "" + myAdopt.getId_a() + "" + ", id_p = " + "" + myAdopt.getId_p() + "" + " where id_m = " + myAdopt.getId_adoption());

        return ok;
    }

}
