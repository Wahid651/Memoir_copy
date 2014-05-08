/*
 * Factory concrète d'objets DAOAccess.
 * Normalement, il faudrait passer par une fabrique abstraite (interface)
 * capable de fabriquer n'importe quels objets DAO (MySQL, Oracle...).
 * C'est seulement à l'exécution qu'on choisirait la fabrique DAOAccess
 * plutôt qu'une autre...
 * Dans cet exemple simplifié, si on voulait changer de BD, il faudrait changer 
 * la classe Factory...
 */
package factory;

import dao.*;
import daoMySQL.*;

public class Factory {

    public static daoAnimal getdaoAnimal() {
        return AnimalMySQL.getInstance();
    }

    public static daoPersonne getdaoPersonne() {
        return PersonneMySQL.getInstance();
    }

    public static daoVeterinaire getdaoVeterinaire() {
        return VeterinaireMySQL.getInstance();
    }

    public static daoAdoption getdaoAdoption() {
        return AdoptionMySQL.getInstance();
    }

    public static daoRace getdaoRace() {
        return RaceMySQL.getInstance();
    }

    public static daoLieu getdaoLieu() {
        return LieuMySQL.getInstance();
    }

    public static daoType getdaoType() {
        return TypeMySQL.getInstance();
    }

    public static daoMedicament getdaoMedicament() {
        return MedicamentMySQL.getInstance();
    }

    public static daoSoin getdaoSoin() {
        return SoinMySQL.getInstance();
    }

    public static daoAnimalSoin getdaoAnimalSoin() {
        return AnimalSoinMySQL.getInstance();
    }

    public static daoVaccin getdaoVaccin() {
        return VaccinMySQL.getInstance();
    }

    public static daoVaccination getdaoVaccination() {
        return VaccinationMySQL.getInstance();
    }

    public static daoSoinConcernMedoc getdaoConcernMedoc() {
        return SoinConcerMedocMySQL.getInstance();
    }

    public static daoEstVacciner getdaoEstVacciner() {
        return EstVaccinerMySQL.getInstance();
    }

    public static Connexion getDAOConnexion() {
        return ConnexionMySQL.getInstance();
    }
     public static Connexion getDAOConnexion(String chaineConn) {
        return ConnexionMySQL.getInstance(chaineConn);
    }

}
