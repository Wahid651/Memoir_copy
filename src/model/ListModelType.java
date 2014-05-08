package model;

import java.util.*;
import objet.Type;

public class ListModelType extends javax.swing.AbstractListModel {

    private ArrayList<Type> myList;

    public ListModelType(ArrayList myList) {
        this.myList = myList;
    }

    public Object getElementAt(int index) {
        return myList.get(index).getNom_t();
    }

    public int getSize() {
        return myList.size();
    }

    public void setMyList(ArrayList<Type> myList) {
        this.myList = myList;
        this.fireContentsChanged(this, 0, getSize());
    }

    public ArrayList<Type> getMyList() {
        return myList;
    }

    public Type getMyList(int index) {
        return myList.get(index);
    }
}
