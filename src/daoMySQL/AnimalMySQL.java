/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import dao.daoAnimal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import objet.Animal;
import objet.Personne;

/**
 *
 * @author Super-Afg
 */
public class AnimalMySQL implements daoAnimal {

    private static daoAnimal uniqueIstance = new AnimalMySQL();

    public static daoAnimal getInstance() {
        return uniqueIstance;
    }

    @Override
    public boolean deleteAnimal(Animal ani) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Delete  from animal where id_a = "
                + ani.getId_a() + "");

        return ok;
    }

    @Override
    public boolean insertAnimal(Animal ani) {

        boolean ok = ConnexionMySQL.getInstance().actionQuery("INSERT INTO animal(nom, sexe, ident_puce, type_puce, "
                + "puce_loc, couleur, taille, sterile,vermifuge, age, date_entre, raison_arrive, disponible_adoption, "
                + "date_depart, raison_depart, carateristique, discription, id_r, id_p, id_lieu, photo, date_vermifuge, date_sterile, id_vet )"
                + "   values ('" + ani.getNom() + "','" + ani.getSexe() + "','" + ani.getIdent_puce()
                + "','" + ani.getType_puce() + "','" + ani.getPuce_loc() + "','" + ani.getCouleur() + "'"
                + ",'" + ani.getPoil() + "'," + ani.getSterile() + "," + ani.getVermifuge() + ",'" + ani.getAgeSQL() + "'"
                + ",'" + ani.getDateEntreSQL() + "','" + ani.getRaison() + "'," + ani.getDispo() + ""
                + ",'" + ani.getDateDepartSQL() + "','" + ani.getRaison_depart() + "','" + ani.getCarateristique() + "'"
                + ",'" + ani.getDiscription() + "'," + ani.getId_r() + "," + ani.getId_p() + ""
                + "," + ani.getId_lieu() + ",'" + ani.getPhoto() + "','" + ani.getDateVermifugeSQL() + "','" + ani.getDateSterileSQL() + "'," + ani.getId_vet() + ")");
        return ok;

    }

    @Override
    public boolean updateAnimal(Animal ani) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Update animal set nom = "
                + "'" + ani.getNom() + "'" + ", sexe = " + "'" + ani.getSexe() + "'" + ", ident_puce = " + "'" + ani.getIdent_puce() + "'"
                + ", type_puce = " + "'" + ani.getType_puce() + "'" + ", puce_loc = " + "'" + ani.getPuce_loc() + "'"
                + ", couleur = " + "'" + ani.getCouleur() + "'" + ", taille = " + "'" + ani.getPoil() + "'" + ", sterile = " + "" + ani.getSterile() + ""
                + ", vermifuge = " + "" + ani.getVermifuge() + "" + ", age = " + "'" + ani.getAgeSQL() + "'"
                + ", date_entre = " + "'" + ani.getDateEntreSQL() + "'" + ", raison_arrive = " + "'" + ani.getRaison() + "'"
                + ", disponible_adoption = " + "" + ani.getDispo() + "" + ", date_depart = " + "'" + ani.getDateDepartSQL() + "'"
                + ", raison_depart = " + "'" + ani.getRaison_depart() + "'" + ", carateristique = " + "'" + ani.getCarateristique() + "'"
                + ", discription = " + "'" + ani.getDiscription() + "'" + ", id_r = " + "" + ani.getId_r() + ""
                + ", id_p = " + "" + ani.getId_p() + "" + ", id_lieu = " + "" + ani.getId_lieu() + "" + ", photo = " + "'" + ani.getPhoto() + "'"
                + ", date_vermifuge = " + "'" + ani.getDateSterileSQL() + "'" + ", date_sterile = " + "'" + ani.getDateSterileSQL() + "'" + ", id_vet = " + "" + ani.getId_vet() + "" + " where id_a = " + ani.getId_a());
        return ok;
    }

    @Override
    public ArrayList<Animal> selectAnimals() {
        ArrayList<Animal> myList = new ArrayList();

        String req = "Select * from animal" + " order by 1";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Animal(resu.getInt(1), resu.getString(2), resu.getString(3),
                        resu.getString(4), resu.getString(5), resu.getString(6), resu.getString(7),
                        resu.getString(8), resu.getInt(9), resu.getInt(10), resu.getDate(11), resu.getDate(12),
                        resu.getString(13), resu.getInt(14), resu.getDate(15), resu.getString(16), resu.getString(17),
                        resu.getString(18), resu.getInt(19), resu.getInt(20), resu.getInt(21),
                        resu.getString(22), resu.getDate(23), resu.getDate(24), resu.getInt(25)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;

    }

//    @Override
//    public ArrayList<Animal> selectAnimalPourModel() {
//        ArrayList<Animal> myList = new ArrayList();
//
//        String req = "SELECT a.nom,l.nom, r.lib_r, t.lib_t,a.sexe,a.taille, a.couleur,a.ident_puce,a.date_entre " + "FROM animal a, race r, " + "type t, lieu l "
//                + "WHERE a.id_r = r.id_r" + " AND r.id_t = t.id_t" + " AND l.id_lieu = a.id_lieu";
//
//        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
//        try {
//            while (resu.next()) {
//                myList.add(new Animal(resu.getString(1), resu.getString(2), resu.getString(3),
//                        resu.getString(4), resu.getString(5), resu.getString(6), resu.getString(7),
//                        resu.getString(8), resu.getDate(9)));
//            }
//
//        } catch (SQLException e) {
//            System.out.println(e.toString());
//            System.exit(-1);
//        }
//        return myList;
//    }
//
//    @Override
//    public ArrayList<Animal> selectAnimalPourModelAll() {
//      
//            ArrayList<Animal> myList = new ArrayList();
//
//        String req = "SELECT a.id_a, a.nom,l.nom, r.lib_r, t.lib_t, a.sexe, a.ident_puce, a.type_puce, "
//                + "a.puce_loc, a.couleur, a.taille, a.sterile, a.age, a.date_entre, a.raison_arrive, a.disponible_adoption, "
//                + "a.date_depart, a.raison_depart, a.carateristique, a.discription, a.id_r, a.id_p, a.id_lieu, a.photo"
//                + " FROM animal a, race r, " + "type t, lieu l "
//                + "WHERE a.id_r = r.id_r" + " AND r.id_t = t.id_t" + " AND l.id_lieu = a.id_lieu";;
//
//        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
//        try {
//            while (resu.next()) {
//                myList.add(new Animal(resu.getInt(1),resu.getString(2), resu.getString(3), resu.getString(4),
//                        resu.getString(5),resu.getString(6),
//                        resu.getString(7), resu.getString(8), resu.getString(9), resu.getString(10),
//                        resu.getString(11), resu.getInt(12), resu.getDate(13), resu.getDate(14),
//                        resu.getString(15), resu.getInt(16), resu.getDate(17), resu.getString(18), resu.getString(19),
//                        resu.getString(20), resu.getInt(21), resu.getInt(22), resu.getInt(23),
//                        resu.getBytes(24)));
//            }
//
//        } catch (SQLException e) {
//            System.out.println(e.toString());
//            System.exit(-1);
//        }
//        return myList;
//    
//    }
    @Override
    public ArrayList<Animal> selectAnimalPourModel() {
        ArrayList<Animal> myList = new ArrayList();

        String req = "SELECT a.id_a, a.nom,l.nom, r.lib_r, t.lib_t,a.sexe,a.taille, a.couleur,a.ident_puce,a.date_entre " + "FROM animal a, race r, " + "type t, lieu l "
                + "WHERE a.id_r = r.id_r" + " AND r.id_t = t.id_t" + " AND l.id_lieu = a.id_lieu" + " order by 1";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Animal(resu.getInt(1), resu.getString(2), resu.getString(3), resu.getString(4),
                        resu.getString(5), resu.getString(6), resu.getString(7), resu.getString(8),
                        resu.getString(9), resu.getDate(10)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

    @Override
    public ArrayList<Animal> selectAnimalPourModelAll() {

        ArrayList<Animal> myList = new ArrayList();

        String req = "SELECT a.id_a, a.nom,l.nom, r.lib_r, t.lib_t, a.sexe, a.ident_puce, a.type_puce, "
                + "a.puce_loc, a.couleur, a.taille, a.sterile, a.vermifuge, a.age, a.date_entre, a.raison_arrive, a.disponible_adoption, "
                + "a.date_depart, a.raison_depart, a.carateristique, a.discription, a.id_r, a.id_p, a.id_lieu, a.photo, a.date_vermifuge, a.date_sterile, a.id_vet"
                + " FROM animal a, race r, " + "type t, lieu l "
                + "WHERE a.id_r = r.id_r" + " AND r.id_t = t.id_t" + " AND l.id_lieu = a.id_lieu" + " order by 1";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Animal(resu.getInt(1), resu.getString(2), resu.getString(3), resu.getString(4),
                        resu.getString(5), resu.getString(6),
                        resu.getString(7), resu.getString(8), resu.getString(9), resu.getString(10),
                        resu.getString(11), resu.getInt(12), resu.getInt(13), resu.getDate(14), resu.getDate(15),
                        resu.getString(16), resu.getInt(17), resu.getDate(18), resu.getString(19), resu.getString(20),
                        resu.getString(21), resu.getInt(22), resu.getInt(23), resu.getInt(24),
                        resu.getString(25), resu.getDate(26), resu.getDate(27), resu.getInt(28)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;

    }

    @Override
    public ArrayList<Animal> selectAnimalParLocalisationEtRace(String Localisation, String AnimalRace, String Sexe, String debDate, String finDate) {

        ArrayList<Animal> myList = new ArrayList();

        String req = "SELECT a.id_a, a.nom,l.nom, r.lib_r, t.lib_t, a.sexe, a.ident_puce, a.type_puce, "
                + "a.puce_loc, a.couleur, a.taille, a.sterile, a.vermifuge, a.age, a.date_entre, a.raison_arrive, a.disponible_adoption, "
                + "a.date_depart, a.raison_depart, a.carateristique, a.discription, a.id_r, a.id_p, a.id_lieu, a.photo, a.date_vermifuge, a.date_sterile, a.id_vet"
                + " FROM animal a, race r, " + "type t, lieu l "
                + "WHERE a.id_r = r.id_r" + " AND r.id_t = t.id_t" + " AND l.id_lieu = a.id_lieu AND l.nom like '" + Localisation + "'" + " AND t.lib_t like '" + AnimalRace + "'" + " AND a.sexe like '"
                + Sexe + "'" + " AND a.age Between '" + debDate + "'" + " AND '" + finDate + "'" + " order by 1";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Animal(resu.getInt(1), resu.getString(2), resu.getString(3), resu.getString(4),
                        resu.getString(5), resu.getString(6),
                        resu.getString(7), resu.getString(8), resu.getString(9), resu.getString(10),
                        resu.getString(11), resu.getInt(12), resu.getInt(13), resu.getDate(14), resu.getDate(15),
                        resu.getString(16), resu.getInt(17), resu.getDate(18), resu.getString(19), resu.getString(20),
                        resu.getString(21), resu.getInt(22), resu.getInt(23), resu.getInt(24),
                        resu.getString(25), resu.getDate(26), resu.getDate(27), resu.getInt(28)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

    @Override
    public ArrayList<Animal> selectAnimalPourModelParPuce(String idPuce) {
        ArrayList<Animal> myList = new ArrayList();

        String req = "SELECT a.id_a, a.nom,l.nom, r.lib_r, t.lib_t, a.sexe, a.ident_puce, a.type_puce, "
                + "a.puce_loc, a.couleur, a.taille, a.sterile, a.vermifuge, a.age, a.date_entre, a.raison_arrive, a.disponible_adoption, "
                + "a.date_depart, a.raison_depart, a.carateristique, a.discription, a.id_r, a.id_p, a.id_lieu, a.photo, a.date_vermifuge, a.date_sterile, a.id_vet"
                + " FROM animal a, race r, " + "type t, lieu l "
                + "WHERE a.id_r = r.id_r" + " AND r.id_t = t.id_t" + " AND l.id_lieu = a.id_lieu and a.ident_puce like '" + idPuce + "'" + " order by 1";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Animal(resu.getInt(1), resu.getString(2), resu.getString(3), resu.getString(4),
                        resu.getString(5), resu.getString(6),
                        resu.getString(7), resu.getString(8), resu.getString(9), resu.getString(10),
                        resu.getString(11), resu.getInt(12), resu.getInt(13), resu.getDate(14), resu.getDate(15),
                        resu.getString(16), resu.getInt(17), resu.getDate(18), resu.getString(19), resu.getString(20),
                        resu.getString(21), resu.getInt(22), resu.getInt(23), resu.getInt(24),
                        resu.getString(25), resu.getDate(26), resu.getDate(27), resu.getInt(28)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

    @Override
    public ArrayList<Animal> selectCountAbondon() {

        ArrayList<Animal> myList = new ArrayList();

        String req = "  SELECT  `raison_arrive` , COUNT(  `id_a` ) \n"
                + "FROM animal" + " GROUP BY  `raison_arrive`";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Animal(resu.getString(1), resu.getInt(2)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

    @Override
    public ArrayList<Animal> getIdSuivant() {

        ArrayList<Animal> myList = new ArrayList();

        String req = "SELECT MAX( `id_a` ) FROM animal";

        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Animal(resu.getInt(1)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

    @Override
    public ArrayList<Animal> selectPersonneAnimal(int id_p) {
        ArrayList<Animal> myList = new ArrayList();

        String req = "SELECT ad.date_adoption, a.nom , r.lib_r, t.lib_t,a.sexe, a.couleur,a.ident_puce, a.age FROM animal a, race r,type t, lieu l, personne p, adoption ad\n"
                + " WHERE a.id_r = r.id_r AND r.id_t = t.id_t  AND l.id_lieu = a.id_lieu and ad.id_a =a.id_a and p.id_p = ad.id_p and p.id_p = " + id_p + "" + " order by 1";
        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Animal(resu.getDate(1), resu.getString(2), resu.getString(3), resu.getString(4), resu.getString(5), resu.getString(6), resu.getString(7), resu.getDate(8)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }
    /**/

    @Override
    public ArrayList<Animal> selectRappelVaccin() {
        ArrayList<Animal> myList = new ArrayList();

        String req = "SELECT a.id_a,a.ident_puce, t.lib_t,r.lib_r, v.`date_vacc`, v.`date_rappel`, v.`observation`, vac.nom_vaccin FROM `vaccination` v, vaccin vac, animal a, race r, type t WHERE TO_DAYS(date_rappel) - TO_DAYS(NOW()) >=0 and "
                + "  TO_DAYS(date_rappel) - TO_DAYS(NOW()) <=14 and a.id_a=v.id_a and vac.id_vaccin = v.id_vaccin and a.id_r = r.id_r and r.id_t = t.id_t";
        ResultSet resu = ConnexionMySQL.getInstance().selectQuery(req);
        try {
            while (resu.next()) {
                myList.add(new Animal(resu.getInt(1), resu.getString(2), resu.getString(3), resu.getString(4), resu.getDate(5), resu.getDate(6), resu.getString(7), resu.getString(8)));
            }

        } catch (SQLException e) {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return myList;
    }

}
