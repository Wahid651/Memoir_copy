package model;

import java.util.*;
import objet.Race;

public class ListModelRace extends javax.swing.AbstractListModel {

    private ArrayList<Race> myList;

    public ListModelRace(ArrayList myList) {
        this.myList = myList;
    }

    public Object getElementAt(int index) {
        return myList.get(index).getLib_r();
    }

    public int getSize() {
        return myList.size();
    }

    public void setMyList(ArrayList<Race> myList) {
        this.myList = myList;
        this.fireContentsChanged(this, 0, getSize());
    }

    public ArrayList<Race> getMyList() {
        return myList;
    }

    public Race getMyList(int index) {
        return myList.get(index);
    }

}
