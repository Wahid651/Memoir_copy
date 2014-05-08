/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import objet.SoinConcernMedoc;

/**
 *
 * @author Super-Afg
 */
public interface daoSoinConcernMedoc {

    boolean deleteSoinConcernMedoc(SoinConcernMedoc soin);

    boolean insertSoinConcernMedoc(SoinConcernMedoc soin);

    ArrayList<SoinConcernMedoc> selectSoinConcernMedoc();

    ArrayList<SoinConcernMedoc> selectSoinConcernMedocPourModel(int id_animal);

    boolean updateSoinConcernMedoc(SoinConcernMedoc soin);
}
