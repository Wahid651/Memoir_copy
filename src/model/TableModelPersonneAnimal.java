package model;

import java.awt.Component;
import objet.Animal;
import java.util.*;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class TableModelPersonneAnimal extends javax.swing.table.AbstractTableModel {

    private String[] columnNames = {"Adoption", "Nom", "Espèce", "Race", "Sexe", "Couleur", "Identification", "Age"};
    private ArrayList<Animal> myList;

    public TableModelPersonneAnimal(ArrayList myList) {
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
                return myAnimal.getDate_adoption();
            case 1:
                return myAnimal.getNom();
            case 2:
                return myAnimal.getEspece();
            case 3:
                return myAnimal.getRace();
            case 4:
                return myAnimal.getSexe();
            case 5:
                return myAnimal.getCouleur();
            case 6:
                return myAnimal.getIdent_puce();
            case 7:
                String result;
                if (getAge(myAnimal.getAge()) != 0) {
                    result = getAge(myAnimal.getAge()) + " an(s)";
                } else {
                    result = getAgebebe(myAnimal.getAge()) + " sem";
                }
                return result;
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

    public static int getAge(Date birthday) {
        GregorianCalendar today = new GregorianCalendar();
        GregorianCalendar bday = new GregorianCalendar();
        GregorianCalendar bdayThisYear = new GregorianCalendar();

        bday.setTime(birthday);
        bdayThisYear.setTime(birthday);
        bdayThisYear.set(Calendar.YEAR, today.get(Calendar.YEAR));

        int age = today.get(Calendar.YEAR) - bday.get(Calendar.YEAR);

        if (today.getTimeInMillis() < bdayThisYear.getTimeInMillis()) {
            age--;
        }
        return age;
    }

    public static int getAgebebe(Date birthday) {
        GregorianCalendar today = new GregorianCalendar();
        GregorianCalendar bday = new GregorianCalendar();
        bday.setTime(birthday);

        int age = today.get(Calendar.WEEK_OF_YEAR) - bday.get(Calendar.WEEK_OF_YEAR);
        if (age < 0) {
            //52 dans 1 ans
            age = age + 52;
        }
        return age;
    }
}
