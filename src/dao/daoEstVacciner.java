/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import objet.EstVacciner;

/**
 *
 * @author Super-Afg
 */
public interface daoEstVacciner {

    boolean deleteEstVacciner(EstVacciner soin);

    boolean insertEstVacciner(EstVacciner soin);

    ArrayList<EstVacciner> selectEstVacciner();

    ArrayList<EstVacciner> selectEstVaccinerPourModel(int id_animal);

    boolean updateEstVacciner(EstVacciner soin);
}
