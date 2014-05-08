/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import objet.Animal;

/**
 *
 * @author Super-Afg
 */
public interface daoAnimal {

    boolean deleteAnimal(Animal ani);

    boolean insertAnimal(Animal ani);

    ArrayList<Animal> selectAnimals();
    ArrayList<Animal> selectPersonneAnimal(int id_p);
    ArrayList<Animal> selectRappelVaccin();

    ArrayList<Animal> getIdSuivant();

    ArrayList<Animal> selectAnimalParLocalisationEtRace(String Localisation, String AnimalRace, String Sexe, String debDate, String finDate);

    ArrayList<Animal> selectAnimalPourModel();

    ArrayList<Animal> selectAnimalPourModelParPuce(String idPuce);

    ArrayList<Animal> selectAnimalPourModelAll();

    ArrayList<Animal> selectCountAbondon();

    boolean updateAnimal(Animal ani);

}
