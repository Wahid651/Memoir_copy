package model;

import objet.Personne;
import java.util.*;

public class TableModelPersonne extends javax.swing.table.AbstractTableModel {

    private String[] columnNames = {"Nom", "Prénom", "Telephone", "Mail", "Adresse", "Code postal", "Ville", "Reçu viste", "Liste rouge"};
    private ArrayList<Personne> myList;

    public TableModelPersonne(ArrayList myList) {
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
        String rep_viste;
        String rep_listRouge;
        Personne myPersonne = myList.get(row);
        if (myPersonne.getCkh_home() == 1) {
            rep_viste = "oui";
        } else {
            rep_viste = "non";
        }
        if (myPersonne.getEst_bannie() == 1) {
            rep_listRouge = "oui";
        } else {
            rep_listRouge = "non";
        }
        switch (col) {
            case 0:
                return myPersonne.getNom();
            case 1:
                return myPersonne.getPrenom();
            case 2:
                return myPersonne.getTel();
            case 3:
                return myPersonne.getMail();
            case 4:
                return myPersonne.getAdress();
            case 5:
                return myPersonne.getCode_postal();
            case 6:
                return myPersonne.getVille();
            case 7:
                return rep_viste;
            case 8:
                return rep_listRouge;
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

    public ArrayList<Personne> getMyList() {
        return myList;
    }

    public Personne getMyList(int index) {
        return myList.get(index);
    }

}
