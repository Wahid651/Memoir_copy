/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objet;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Super-Afg
 */
public class Adoption {

    private int id_adoption;
    private Date date_adoption;
    private int id_a;
    private int id_p;

    public Adoption(int id_adoption, Date date_adoption, int id_a, int id_p) {
        this.id_adoption = id_adoption;
        this.date_adoption = date_adoption;
        this.id_a = id_a;
        this.id_p = id_p;
    }

    public int getId_adoption() {
        return id_adoption;
    }

    public void setId_adoption(int id_adoption) {
        this.id_adoption = id_adoption;
    }

    public Date getDate_adoption() {
        return date_adoption;
    }

    public void setDate_adoption(Date date_adoption) {
        this.date_adoption = date_adoption;
    }

    public int getId_a() {
        return id_a;
    }

    public void setId_a(int id_a) {
        this.id_a = id_a;
    }

    public int getId_p() {
        return id_p;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
    }

    @Override
    public String toString() {
        return "Adoption{" + "id_adoption=" + id_adoption + ", date_adoption=" + date_adoption + ", id_a=" + id_a + ", id_p=" + id_p + '}';
    }

    public String getDateAdoptionSQL() {
        String result;
        if (this.date_adoption == null) {
            result = "null";
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            result = sdf.format(this.date_adoption);
        }
        return result;
    }

}
