/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import objet.Personne;

/**
 *
 * @author Super-Afg
 */
public interface daoPersonne {

    boolean deletePersonne(Personne pers);

    boolean insertPersonne(Personne pers);

    ArrayList<Personne> selectPersonne();

    ArrayList<Personne> selectPersonneParNomEtPrenom(String Nom, String Prenom, String Ville);

    boolean updatePersonne(Personne pers);
}
