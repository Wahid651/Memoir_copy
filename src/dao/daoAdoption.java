/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import objet.Adoption;

/**
 *
 * @author Super-Afg
 */
public interface daoAdoption {

    boolean deleteAdoption(Adoption myAdopt);

    boolean insertAdoption(Adoption myAdopt);

    ArrayList<Adoption> selectAdoption();

    boolean updateAdoption(Adoption myAdopt);
}
