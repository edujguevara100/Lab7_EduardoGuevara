/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_eduardoguevara;

import java.util.ArrayList;

/**
 *
 * @author edujg
 */
public class Orden {

    private Cajero cajero;
    private Cliente cliente;
    private ArrayList<Productos> lista = new ArrayList();

    public Orden() {
    }
    
    public Orden(Cajero cajero, Cliente cliente) {
        this.cajero = cajero;
        this.cliente = cliente;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Productos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Productos> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Orden{" + "cajero=" + cajero + ", cliente=" + cliente + ", lista=" + lista + '}';
    }

}
