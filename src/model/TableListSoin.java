/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import objet.Type_soin;

/**
 *
 * @author Super-Afg
 */
public class TableListSoin extends javax.swing.table.AbstractTableModel {

    private String[] columnNames = {"titre", "discription"};
    private ArrayList<Type_soin> myList;

    public TableListSoin(ArrayList<Type_soin> myList) {
        this.myList = myList;
    }

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return myList.size();
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {

        Type_soin MySoin = myList.get(row);
        switch (col) {
            case 0:
                return MySoin.getNom_soin();
            case 1:
                return MySoin.getDiscrip_soin();

            default:
                return null;
        }
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    public void setMyList(ArrayList myList) {
        this.myList = myList;
        this.fireTableDataChanged();
    }

    public ArrayList<Type_soin> getMyList() {
        return myList;
    }

    public Type_soin getMyList(int index) {
        return myList.get(index);
    }

}
