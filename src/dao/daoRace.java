/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import objet.Race;

/**
 *
 * @author Super-Afg
 */
public interface daoRace {

    boolean deleteRace(Race race);

    boolean insertRace(Race race);

    ArrayList<Race> selectRaces();

    ArrayList<Race> selectRaceparType(int id);

    boolean updateRace(Race race);
}
