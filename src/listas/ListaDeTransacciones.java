package listas;

import java.util.List;
import java.util.ArrayList;

import static utilidades.Print.*;
import modelo.Transaccion;

public class ListaDeTransacciones {
    private List<Transaccion> listaDeTransacciones;
    private int cantidadDeTransacciones;

    public ListaDeTransacciones() {
        this.cantidadDeTransacciones = 0;
        this.listaDeTransacciones = new ArrayList<>();
    }

    public void agregarTransaccion(Transaccion transaccion) {
        listaDeTransacciones.add(transaccion);
        cantidadDeTransacciones += 1;
        print("La transaccion se agrego correctamente!!!");
    }

    public void mostrarTransacciones() {
        listaDeTransacciones.forEach(transaccion -> print(transaccion + "\n"));
    }

    public Transaccion buscarTransaccion(String identificadorDeTransaccion) {
        return listaDeTransacciones.stream()
                .filter(transaccion -> transaccion.getIdDeLaTransacion().equals(identificadorDeTransaccion))
                .findFirst()
                .orElse(null);

    }

    //Getters y Setters
    public List<Transaccion> getListaDeTransacciones() {
        return listaDeTransacciones;
    }

    public void setListaDeTransacciones(List<Transaccion> listaDeTransacciones) {
        this.listaDeTransacciones = listaDeTransacciones;
    }

    public int getCantidadDeTransacciones() {
        return cantidadDeTransacciones;
    }

    public void setCantidadDeTransacciones(int cantidadDeTransacciones) {
        this.cantidadDeTransacciones = cantidadDeTransacciones;
    }
}
