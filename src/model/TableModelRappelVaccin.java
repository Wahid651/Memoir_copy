package model;

import objet.Animal;
import java.util.*;

public class TableModelRappelVaccin extends javax.swing.table.AbstractTableModel {

    private String[] columnNames = {"N° id", "Identifiant", "Espèce", "Race", "Vaccination", "Rappel vaccination", "Observation", "Type vaccination "};
    private ArrayList<Animal> myList;

    public TableModelRappelVaccin(ArrayList myList) {
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
        Animal myAnimal = myList.get(row);

        switch (col) {
            case 0:
                return myAnimal.getId_a();
            case 1:
                return myAnimal.getIdent_puce();
            case 2:
                return myAnimal.getEspece();
            case 3:
                return myAnimal.getRace();
            case 4:
                return myAnimal.getDate_vacc();
            case 5:
                return myAnimal.getDate_vacc_rappel();
            case 6:
                return myAnimal.getObservation();
            case 7:
                return myAnimal.getNom_vaccin();

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

    public ArrayList<Animal> getMyList() {
        return myList;
    }

    public Animal getMyList(int index) {
        return myList.get(index);
    }

}
