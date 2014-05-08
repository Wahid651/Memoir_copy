package model;

import objet.Veterinaire;
import java.util.*;

public class TableModelVeterinaire extends javax.swing.table.AbstractTableModel {

    private String[] columnNames = {"Nom", "Prénom", "Adresse", " Code postal", "Ville", "Telephone", "Mobile"};
    private ArrayList<Veterinaire> myList;

    public TableModelVeterinaire(ArrayList myList) {
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

        Veterinaire myVeterinairel = myList.get(row);
        switch (col) {
            case 0:
                return myVeterinairel.getNom();
            case 1:
                return myVeterinairel.getPrenom();
            case 2:
                return myVeterinairel.getAdress();
            case 3:
                return myVeterinairel.getCode_postal();
            case 4:
                return myVeterinairel.getVille();
            case 5:
                return myVeterinairel.getTel();
            case 6:
                return myVeterinairel.getMobile();

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

    public ArrayList<Veterinaire> getMyList() {
        return myList;
    }

    public Veterinaire getMyList(int index) {
        return myList.get(index);
    }

}
