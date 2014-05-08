/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import objet.Type_soin;

/**
 *
 * @author Super-Afg
 */
public interface daoSoin {

    boolean deleteType_soin(Type_soin soin);

    boolean insertType_soin(Type_soin soin);

    ArrayList<Type_soin> selectType_soin();

    boolean updateType_soin(Type_soin soin);
}
