package daoMySQL;

import dao.daoMedicament;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import objet.Medicament;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Super-Afg
 */
public class MedicamentMySQL implements daoMedicament {

    private static daoMedicament uniqueIstance = new MedicamentMySQL();

    public static daoMedicament getInstance() {
        return uniqueIstance;
    }

    @Override
    public boolean deleteMedicament(Medicament Medic) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Delete  from medicament where id_m = "
                + Medic.getId_m() + "");

        return ok;
    }

    @Override
    public boolean insertMedicament(Medicament Medic) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Insert into medicament (nom_m,discrip_m) values ('" + Medic.getNom_m() + "','" + Medic.getDiscrip_m() + "')");

        return ok;
    }

    @Override
    public ArrayList<Medicament> selectMedicament() {
        ArrayList<Medicament> myList = new ArrayList();

        String req = "Select * from medicament";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Medicament(resu.getInt(1), resu.getString(2), resu.getString(3)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

    @Override
    public boolean updateMedicament(Medicament Medic) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Update medicament set nom_m = "
                + "'" + Medic.getNom_m() + "'" + ", discrip_m = " + "'" + Medic.getDiscrip_m() + "'" + " where id_m = " + Medic.getId_m());

        return ok;
    }

}
