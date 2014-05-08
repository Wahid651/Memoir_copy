package model;

import objet.Soin;
import java.util.*;
import objet.Vaccination;

public class TableModelVaccination extends javax.swing.table.AbstractTableModel {

    private String[] columnNames = {"Date de vaccination", "Date de rappel" , "Observation", "Vaccin", "Praticien"};
    private ArrayList<Vaccination> myList;

    public TableModelVaccination(ArrayList myList) {
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
        Vaccination myVaccination = myList.get(row);
        switch (col) {
            case 0:
                return myVaccination.getDate_VaccFormatBE();
            case 1:
                
                return myVaccination.getDate_FormatBE();
            case 2:
                return myVaccination.getObservation();
            case 3:
                return myVaccination.getNom_vaccin();
            case 4:
                return myVaccination.getNom_vet()+" "+myVaccination.getPrenom_vet();
  
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

    public ArrayList<Vaccination> getMyList() {
        return myList;
    }

    public Vaccination getMyList(int index) {
        return myList.get(index);
    }

}
