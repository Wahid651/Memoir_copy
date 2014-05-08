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

import dao.daoRace;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import objet.Race;

/**
 *
 * @author Super-Afg
 */
public class RaceMySQL implements daoRace {

    private static daoRace uniqueInstance = new RaceMySQL();

    public static daoRace getInstance() {
        return uniqueInstance;
    }

    @Override
    public boolean deleteRace(Race race) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Delete  from race where  id_r"
                + " = "
                + race.getId_r());

        return ok;
    }

    @Override
    public boolean insertRace(Race race) {

        boolean ok = ConnexionMySQL.getInstance().actionQuery("Insert into race (id_r,lib_r,id_t) values ( " + race.getId_r() + ",'" + race.getLib_r() + "'," + "" + race.getId_t() + ")");

        return ok;
    }

    @Override
    public ArrayList<Race> selectRaces() {
        ArrayList<Race> myList = new ArrayList();

        String req = "Select * from Race";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Race(resu.getInt(1), resu.getString(2), resu.getInt(3)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

    @Override
    public boolean updateRace(Race race) {

        boolean ok = ConnexionMySQL.getInstance().actionQuery("Update race set  lib_r = " + "'" + race.getLib_r() + "'"
                + " where id_r = " + race.getId_r());

        return ok;
    }

    @Override
    public ArrayList<Race> selectRaceparType(int id) {
        ArrayList<Race> myList = new ArrayList();

        String req = "Select * from Race WHERE id_t =" + id + "";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Race(resu.getInt(1), resu.getString(2), resu.getInt(3)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

}
