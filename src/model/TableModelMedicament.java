package model;

import objet.Soin;
import java.util.*;
import objet.SoinConcernMedoc;

public class TableModelMedicament extends javax.swing.table.AbstractTableModel {

    private String[] columnNames = {"Date", "Type de soin", "Note", "Medicament","Dosage","Praticien"};
    private ArrayList<SoinConcernMedoc> myList;

    public TableModelMedicament(ArrayList myList) {
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
        SoinConcernMedoc mySoinConcernMedoc = myList.get(row);
        switch (col) {
            case 0:
                return mySoinConcernMedoc.getDate_SoinFormatBE();
            case 1:
                return mySoinConcernMedoc.getNom_soin();
            case 2:
                return mySoinConcernMedoc.getNote();
            case 3:
                return mySoinConcernMedoc.getNom_m();
            case 4:
                return mySoinConcernMedoc.getDosage();
            case 5:
                return mySoinConcernMedoc.getNom() + " " + mySoinConcernMedoc.getPrenom();
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

    public ArrayList<SoinConcernMedoc> getMyList() {
        return myList;
    }

    public SoinConcernMedoc getMyList(int index) {
        return myList.get(index);
    }

}
