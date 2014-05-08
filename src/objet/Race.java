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
public class Race {

    private int id_r;
    private String lib_r;
    private int id_t;

    public Race(String lib_r, int id_t) {
        this.lib_r = lib_r;
        this.id_t = id_t;
    }

    public Race(int id_r, String lib_r, int id_t) {
        this.id_r = id_r;
        this.lib_r = lib_r;
        this.id_t = id_t;
    }

    public void setLib_r(String lib_r) {
        this.lib_r = lib_r;
    }

    public String getLib_r() {
        return lib_r;
    }

    public int getId_r() {
        return id_r;
    }

    public int getId_t() {
        return id_t;
    }

    public void setId_r(int id_r) {
        this.id_r = id_r;
    }

    public void setId_t(int id_t) {
        this.id_t = id_t;
    }

    @Override
    public String toString() {
        return "Race{" + "id_r=" + id_r + ", lib_r=" + lib_r + ", id_t=" + id_t + '}';
    }

}
