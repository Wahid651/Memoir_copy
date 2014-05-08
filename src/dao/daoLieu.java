/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import objet.Lieu;

/**
 *
 * @author Super-Afg
 */
public interface daoLieu {

    boolean deleteLieu(Lieu MyLieu);

    boolean insertLieu(Lieu MyLieu);

    ArrayList<Lieu> selectLieu();

    boolean updateLieu(Lieu MyLieu);
}
