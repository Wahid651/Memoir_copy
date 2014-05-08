/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objet;

/**
 *
 * @author Super-Afg
 */
public class Type {

    private int id_t;
    private String lib_r;

    public Type(String lib_r) {

        this.lib_r = lib_r;
    }

    public Type(int id_t, String lib_r) {
        this.id_t = id_t;
        this.lib_r = lib_r;
    }

    public int getId_t() {
        return id_t;
    }

    public String getNom_t() {
        return lib_r;
    }

    public void setId_t(int id_t) {
        this.id_t = id_t;
    }

    public void setNom_t(String lib_r) {
        this.lib_r = lib_r;
    }

    @Override
    public String toString() {
        return "Type{" + "id_t=" + id_t + ", lib_r=" + lib_r + '}';
    }

}
