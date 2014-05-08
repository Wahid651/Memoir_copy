/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import objet.Type;

/**
 *
 * @author Super-Afg
 */
public interface daoType {

    boolean deleteType(Type type);

    boolean insertType(Type type);

    boolean insertType(String type);

    ArrayList<Type> selectTypes();

    boolean updateType(Type type);

}
