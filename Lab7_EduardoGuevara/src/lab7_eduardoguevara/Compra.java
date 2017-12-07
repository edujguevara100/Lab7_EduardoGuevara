/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_eduardoguevara;

import java.util.Date;

/**
 *
 * @author edujg
 */
public class Compra extends Thread {

    private Date recibe;
    private Date completa;
    private Productos agrega;

    public Compra(Date recibe, Date completa, Productos agrega) {
        this.recibe = recibe;
        this.completa = completa;
        this.agrega = agrega;
    }

    public Date getRecibe() {
        return recibe;
    }

    public void setRecibe(Date recibe) {
        this.recibe = recibe;
    }

    public Date getCompleta() {
        return completa;
    }

    public void setCompleta(Date completa) {
        this.completa = completa;
    }

    public Productos getAgrega() {
        return agrega;
    }

    public void setAgrega(Productos agrega) {
        this.agrega = agrega;
    }

    @Override
    public void run() {
        
    }

    @Override
    public String toString() {
        return "Compra{" + "recibe=" + recibe + ", completa=" + completa + ", agrega=" + agrega + '}';
    }

}
