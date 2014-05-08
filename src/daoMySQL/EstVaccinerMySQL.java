/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import dao.daoEstVacciner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import objet.EstVacciner;

/**
 *
 * @author Super-Afg
 */
public class EstVaccinerMySQL implements daoEstVacciner {

    private static daoEstVacciner uniqueInstance = new EstVaccinerMySQL();

    public static daoEstVacciner getInstance() {
        return uniqueInstance;
    }

    @Override
    public boolean deleteEstVacciner(EstVacciner vac) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Delete  from estvacciner where date_rappel = '"
                + vac.getDate_RappelSQL() + "'" + " and id_vaccination = "
                + vac.getId_vaccination() + " and id_vaccin = "
                + vac.getId_vaccin() + "");

        return ok;
    }

    @Override
    public boolean insertEstVacciner(EstVacciner soin) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("INSERT INTO `estvacciner`(`date_rappel`, `id_vaccination`, `id_vaccin`) VALUES('" + soin.getDate_RappelSQL() + "',"
                + "" + soin.getId_vaccination() + "," + soin.getId_vaccin() + ")");

        return ok;
    }

    @Override
    public ArrayList<EstVacciner> selectEstVacciner() {
        ArrayList<EstVacciner> myList = new ArrayList();

        String req = "Select * from estvacciner";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new EstVacciner(resu.getInt(1), resu.getInt(2), resu.getDate(3), resu.getDate(4), resu.getString(5),
                        resu.getString(6), resu.getString(7)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }
//int id_vaccination, int id_vaccin, Date date_vacc, Date date_rappel, String nom_vaccin, String nom_vet, String prenom_vet

    @Override
    public boolean updateEstVacciner(EstVacciner vac) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Update estvacciner set id_vaccination = "
                + "" + vac.getId_vaccination() + "" + ", id_vaccin = "
                + "" + vac.getId_vaccin() + "" + ", date_vacc= " + "'" + vac.getDate_VaccSQL() + "'"
                + ", date_rappel= " + "'" + vac.getDate_RappelSQL() + "'" + ", nom_vaccin= " + "'" + vac.getNom_vaccin() + "'"
                + ", nom= " + "'" + vac.getNom_vet() + "'" + ", prenom= " + "'" + vac.getPrenom_vet() + "'" + "where date_rappel = '"
                + vac.getDate_RappelSQL() + "'" + " and id_vaccination = "
                + vac.getId_vaccination() + " and id_vaccin = "
                + vac.getId_vaccin() + "");
        return ok;
    }

    @Override
    public ArrayList<EstVacciner> selectEstVaccinerPourModel(int id_animal) {
        ArrayList<EstVacciner> myList = new ArrayList();

        String req = "SELECT vac.id_vaccination, v.id_vaccin, vac.date_vacc, est.`date_rappel`,v.nom_vaccin,vet.nom,\n"
                + "vet.prenom FROM `estvacciner` est, veterinaire vet, vaccin v, vaccination vac, animal a\n"
                + "WHERE est.id_vaccination = vac.id_vaccination and est.id_vaccin = v.id_vaccin and vac.id_a \n"
                + "=a.id_a and vac.id_vet = vet.id_vet and vac.id_a =" + id_animal;
        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new EstVacciner(resu.getInt(1), resu.getInt(2), resu.getDate(3), resu.getDate(4), resu.getString(5), resu.getString(6), resu.getString(7)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

}
