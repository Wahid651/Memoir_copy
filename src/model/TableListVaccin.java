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

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import objet.Vaccin;

/**
 *
 * @author Super-Afg
 */
public class TableListVaccin extends javax.swing.table.AbstractTableModel {

    private String[] columnNames = {"titre", "discription"};
    private ArrayList<Vaccin> myList;

    public TableListVaccin(ArrayList<Vaccin> myList) {
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

        Vaccin MyVaccin = myList.get(row);
        switch (col) {
            case 0:
                return MyVaccin.getNom_vaccin();
            case 1:
                return MyVaccin.getDiscrip_vaccin();

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

    public ArrayList<Vaccin> getMyList() {
        return myList;
    }

    public Vaccin getMyList(int index) {
        return myList.get(index);
    }

}
