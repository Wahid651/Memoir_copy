/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import dao.daoType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import objet.Type;

/**
 *
 * @author Super-Afg
 */
public class TypeMySQL implements daoType {

    private static daoType uniqueInstance = new TypeMySQL();

    public static daoType getInstance() {
        return uniqueInstance;
    }

    @Override
    public boolean insertType(Type type) {

        boolean ok = ConnexionMySQL.getInstance().actionQuery("Insert into type (lib_t) values ('" + type.getNom_t() + "')");

        return ok;
    }

    @Override
    public ArrayList<Type> selectTypes() {
        ArrayList<Type> myList = new ArrayList();

        String req = "Select * from Type";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Type(resu.getInt(1), resu.getString(2)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

    @Override
    public boolean updateType(Type type) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Update type set lib_t = "
                + "'" + type.getNom_t() + "'" + " where id_t = " + type.getId_t());

        return ok;
    }

    @Override
    public boolean insertType(String type) {

        boolean ok = ConnexionMySQL.getInstance().actionQuery("Insert into type (lib_t) values ('" + type + "')");

        return ok;
    }

    @Override
    public boolean deleteType(Type type) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Delete  from type where id_t = "
                + type.getId_t() + "");

        return ok;
    }

}
