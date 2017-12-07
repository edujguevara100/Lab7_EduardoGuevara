/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_eduardoguevara;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author edujg
 */
public class Cajero {

    private String nombre;
    private String id;
    private ArrayList<Productos> poratender = new ArrayList();
    private JFrame frame;

    public Cajero(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        frame = new Ventanas();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Productos> getPoratender() {
        return poratender;
    }

    public void setPoratender(ArrayList<Productos> poratender) {
        this.poratender = poratender;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

}
