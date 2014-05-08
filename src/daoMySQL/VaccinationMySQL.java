/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import dao.daoVaccination;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import objet.Vaccination;
import objet.Vaccination;

/**
 *
 * @author Super-Afg
 */
public class VaccinationMySQL implements daoVaccination {

    private static daoVaccination uniqueInstance = new VaccinationMySQL();

    public static daoVaccination getInstance() {
        return uniqueInstance;
    }

    @Override
    public boolean deleteVaccination(Vaccination soin) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Delete  from vaccination where id_vaccination = "
                + soin.getId_vaccination() + "");

        return ok;
    }

    @Override
    public boolean insertVaccination(Vaccination soin) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Insert into vaccination ( date_vacc, date_rappel, observation , id_a, id_vaccin, id_vet) values ('"
                + soin.getDate_VaccSQL() + "','"
                + soin.getDate_RappelQL() + "','"
                + soin.getObservation() + "'," + soin.getId_a() + "," + soin.getId_vaccin() + "," + soin.getId_vet() + ")");

        return ok;
    }

    @Override
    public ArrayList<Vaccination> selectVaccination() {
        ArrayList<Vaccination> myList = new ArrayList();

        String req = "SELECT v.*, vet.nom,vet.prenom , vac.nom_vaccin FROM `vaccination` v, veterinaire vet, vaccin vac WHERE v.id_vet=vet.id_vet and vac.id_vaccin=v.id_vaccin";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Vaccination(resu.getInt(1), resu.getDate(2), resu.getDate(3), resu.getString(4), resu.getInt(5), resu.getInt(6), resu.getInt(7), resu.getString(8), resu.getString(9), resu.getString(10)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

    @Override
    public boolean updateVaccination(Vaccination soin) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Update vaccination set date_vacc = "
                + "'" + soin.getDate_VaccSQL() + "'" + ", date_rappel = "
                + "'" + soin.getDate_RappelQL() + "'" + ", observation = "
                + "'" + soin.getObservation() + "'" + ", id_a = " + "" + soin.getId_a() + ", id_vaccin = " + "" + soin.getId_vaccin() + ", id_vet = " + "" + soin.getId_vet() + "" + "" + " where id_vaccination = " + soin.getId_vaccination());

        return ok;
    }
      public ArrayList<Vaccination> selectVaccination(int idAnimal) {
        ArrayList<Vaccination> myList = new ArrayList();

        String req = "SELECT v.*, vet.nom,vet.prenom , vac.nom_vaccin FROM `vaccination` v, veterinaire vet, vaccin vac WHERE v.id_vet=vet.id_vet and vac.id_vaccin=v.id_vaccin and v.id_a= " +idAnimal;

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Vaccination(resu.getInt(1), resu.getDate(2), resu.getDate(3), resu.getString(4), resu.getInt(5), resu.getInt(6), resu.getInt(7), resu.getString(8), resu.getString(9), resu.getString(10)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

}
