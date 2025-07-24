package listas;

import java.util.List;
import java.util.ArrayList;

import modelo.Prestamo;
import static utilidades.Print.*;

public class ListaDePrestamos {
    private List<Prestamo> listaDePrestamos;
    private int cantidadDePrestamos;

    public ListaDePrestamos() {
        this.cantidadDePrestamos = 0;
        this.listaDePrestamos = new ArrayList<>();
    }

    public void agregarPrestamo(Prestamo prestamo) {
        listaDePrestamos.add(prestamo);
        cantidadDePrestamos += 1;
    }

    public Prestamo buscarPrestamo(String identificadorDelPrestamo) {
        return listaDePrestamos.stream()
                .filter(prestamo -> prestamo.getIdentificadorDePrestamo().equals(identificadorDelPrestamo))
                .findFirst()
                .orElse(null);
    }

    public void mostrarPrestamos() {
        listaDePrestamos.forEach(prestamo -> print(prestamo));
    }

    //Getter y Setter
    public List<Prestamo> getListaDePrestamos() {
        return listaDePrestamos;
    }

    public void setListaDePrestamos(List<Prestamo> listaDePrestamos) {
        this.listaDePrestamos = listaDePrestamos;
    }

    public int getCantidadDePrestamos() {
        return cantidadDePrestamos;
    }

    public void setCantidadDePrestamos(int cantidadDePrestamos) {
        this.cantidadDePrestamos = cantidadDePrestamos;
    }
}
