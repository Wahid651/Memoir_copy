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
import objet.Medicament;

/**
 *
 * @author Super-Afg
 */
public class TableListMedicament extends javax.swing.table.AbstractTableModel {

    private String[] columnNames = {"titre", "discription"};
    private ArrayList<Medicament> myList;

    public TableListMedicament(ArrayList<Medicament> myList) {
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

        Medicament myMedoc = myList.get(row);
        switch (col) {
            case 0:
                return myMedoc.getNom_m();
            case 1:
                return myMedoc.getDiscrip_m();

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

    public ArrayList<Medicament> getMyList() {
        return myList;
    }

    public Medicament getMyList(int index) {
        return myList.get(index);
    }

}
