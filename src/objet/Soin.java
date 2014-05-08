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
public class Soin {

    private int id_soin;
    private Date date_soin;
    private String note;
    private int id_a;
    private int id_soin_type_soin;
    private int id_vet;

    public Soin(int id_soin, Date date_soin, String note, int id_a, int id_soin_type_soin, int id_vet) {
        this.id_soin = id_soin;
        this.date_soin = date_soin;
        this.note = note;
        this.id_a = id_a;
        this.id_soin_type_soin = id_soin_type_soin;
        this.id_vet = id_vet;
    }

    @Override
    public String toString() {
        return "Soin{" + "id_soin=" + id_soin + ", date_soin=" + date_soin + ", note=" + note + ", id_a=" + id_a + ", id_soin_type_soin=" + id_soin_type_soin + ", id_vet=" + id_vet + '}';
    }

    public int getId_soin() {
        return id_soin;
    }

    public void setId_soin(int id_soin) {
        this.id_soin = id_soin;
    }

    public Date getDate_soin() {
        return date_soin;
    }

    public void setDate_soin(Date date_soin) {
        this.date_soin = date_soin;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getId_a() {
        return id_a;
    }

    public void setId_a(int id_a) {
        this.id_a = id_a;
    }

    public int getId_soin_type_soin() {
        return id_soin_type_soin;
    }

    public void setId_soin_type_soin(int id_soin_type_soin) {
        this.id_soin_type_soin = id_soin_type_soin;
    }

    public int getId_vet() {
        return id_vet;
    }

    public void setId_vet(int id_vet) {
        this.id_vet = id_vet;
    }

    public String getDate_SoinSQL() {
        String result;
        if (this.date_soin == null) {
            result = "null";
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            result = sdf.format(this.date_soin);
        }
        return result;
    }

}
