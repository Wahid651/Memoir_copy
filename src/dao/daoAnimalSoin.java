/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import objet.Soin;

/**
 *
 * @author Super-Afg
 */
public interface daoAnimalSoin {

    boolean deleteSoin(Soin soin);

    boolean insertSoin(Soin soin);

    ArrayList<Soin> selectSoin();
    int selectlastid();
    boolean updateSoin(Soin soin);
    
    
}
