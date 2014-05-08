/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import dao.daoSoin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import objet.Type_soin;
import objet.Type_soin;

/**
 *
 * @author Super-Afg
 */
public class SoinMySQL implements daoSoin {

    private static daoSoin uniqueInstance = new SoinMySQL();

    public static daoSoin getInstance() {
        return uniqueInstance;
    }

    @Override
    public boolean deleteType_soin(Type_soin soin) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Delete  from type_soin where id_soin = "
                + soin.getId_soin() + "");

        return ok;
    }

    @Override
    public boolean insertType_soin(Type_soin soin) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Insert into type_soin (nom_soin,discrip_soin) values ('"
                + soin.getNom_soin() + "','" + soin.getDiscrip_soin() + "')");

        return ok;
    }

    @Override
    public ArrayList<Type_soin> selectType_soin() {
        ArrayList<Type_soin> myList = new ArrayList();

        String req = "Select * from type_soin";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Type_soin(resu.getInt(1), resu.getString(2), resu.getString(3)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

    @Override
    public boolean updateType_soin(Type_soin soin) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Update type_soin set nom_soin = "
                + "'" + soin.getNom_soin() + "'" + ", discrip_soin = " + "'" + soin.getDiscrip_soin() + "'" + " where id_soin = " + soin.getId_soin());

        return ok;
    }

}
