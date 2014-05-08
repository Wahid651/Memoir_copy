/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import objet.Veterinaire;

/**
 *
 * @author Super-Afg
 */
public interface daoVeterinaire {

    boolean deleteVeterinaire(Veterinaire myVet);

    boolean insertVeterinaire(Veterinaire myVet);

    ArrayList<Veterinaire> selectVeterinaire();

    boolean updateVeterinaire(Veterinaire myVet);

    public ArrayList selectPersonneParFiltre(String nom, String prenom, String ville);
}
