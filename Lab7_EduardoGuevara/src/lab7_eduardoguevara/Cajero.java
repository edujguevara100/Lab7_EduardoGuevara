/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_eduardoguevara;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edujg
 */
public class Cajero implements Runnable {

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

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < poratender.size() - 1; i++) {
                ((Ventanas) (this.frame)).getjLabel10().setText(poratender.get(i).toString());
                try {
                    Thread.sleep(poratender.get(i).getTiempo() * 1000);
                    DefaultTableModel modelo = (DefaultTableModel) ((Ventanas) (this.frame)).getJt_tabla().getModel();
                    Object[] newrow = {
                        poratender.get(i).getNombre(),
                        ((Ventanas) (this.frame)).getJl_nombrec().getText(),
                        poratender.get(i).getTiempo(),};
                    modelo.addRow(newrow);
                    ((Ventanas) (this.frame)).getJt_tabla().setModel(modelo);
                    poratender.remove(i);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cajero.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
