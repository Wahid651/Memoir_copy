/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import dao.daoVeterinaire;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import objet.Veterinaire;

/**
 *
 * @author Super-Afg
 */
public class VeterinaireMySQL implements daoVeterinaire {

    private static daoVeterinaire uniqueInstance = new VeterinaireMySQL();

    public static daoVeterinaire getInstance() {
        return uniqueInstance;
    }

    @Override
    public boolean deleteVeterinaire(Veterinaire myVet) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Delete  from veterinaire where id_vet = "
                + myVet.getId_vet() + "");
        return ok;
    }

    @Override
    public boolean insertVeterinaire(Veterinaire myVet) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("INSERT INTO veterinaire(nom, prenom, adress, code_postal, ville,"
                + " tel, mobile ) values ('" + myVet.getNom()
                + "','" + myVet.getPrenom() + "','" + myVet.getAdress() + "'," + myVet.getCode_postal() + ",'" + myVet.getVille() + "','" + myVet.getTel() + "','" + myVet.getMobile() + "')");

        return ok;
    }

    @Override
    public ArrayList<Veterinaire> selectVeterinaire() {
        ArrayList<Veterinaire> myList = new ArrayList();

        String req = "Select * from veterinaire order by 2";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Veterinaire(resu.getInt(1), resu.getString(2), resu.getString(3), resu.getString(4), resu.getInt(5), resu.getString(6), resu.getString(7), resu.getString(8)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

    @Override
    public boolean updateVeterinaire(Veterinaire myVet) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Update veterinaire set nom = "
                + "'" + myVet.getNom() + "'" + ", prenom = " + "'" + myVet.getPrenom() + "'" + ", adress = " + "'" + myVet.getAdress() + "'"
                + ", code_postal = " + "'" + myVet.getCode_postal() + "'" + ", ville = " + "'" + myVet.getVille() + "'" + ", tel = " + "'" + myVet.getTel() + "'" + ", mobile = " + "'" + myVet.getMobile() + "'"+"where id_vet= "+myVet.getId_vet());

        return ok;
    }

    @Override
    public ArrayList selectPersonneParFiltre(String nom, String prenom, String ville) {
        ArrayList<Veterinaire> myList = new ArrayList();

        String req = "Select * from veterinaire where nom like '" + nom + "'" + " and prenom like '" + prenom + "'" + " and ville like '" + ville + "'" + "order by 2";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Veterinaire(resu.getInt(1), resu.getString(2), resu.getString(3), resu.getString(4), resu.getInt(5), resu.getString(6), resu.getString(7), resu.getString(8)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

}
