/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import objet.Medicament;

/**
 *
 * @author Super-Afg
 */
public interface daoMedicament {

    boolean deleteMedicament(Medicament Medic);

    boolean insertMedicament(Medicament Medic);

    ArrayList<Medicament> selectMedicament();

    boolean updateMedicament(Medicament Medic);
}
