package listas;

import java.util.List;
import java.util.ArrayList;

import modelo.modelosAbstractos.CuentaBancaria;
import modelo.CuentaCorriente;
import modelo.CuentaDeAhorro;
import modelo.CuentaNomina;

import static utilidades.Print.*;

public class ListaDeCuentas {
    private List<CuentaBancaria> listaDeCuentas;
    private int cantidadDeCuentas;

    public ListaDeCuentas() {
        this.cantidadDeCuentas = 0;
        this.listaDeCuentas = new ArrayList<>();
    }

    public void agregarCuentaAhorro(CuentaDeAhorro cuentaDeAhorro) {
        listaDeCuentas.add(cuentaDeAhorro);
        cantidadDeCuentas += 1;
        print("Cuenta agregada correctamente a la lista!!!");
    }

    public void agregarCuentaCorriente(CuentaCorriente cuentaCorriente) {
        listaDeCuentas.add(cuentaCorriente);
        cantidadDeCuentas += 1;
        print("Cuenta agregada correctamente a la lista!!!");
    }

    public void agregarCuentaNomina(CuentaNomina cuentaNomina) {
        listaDeCuentas.add(cuentaNomina);
        cantidadDeCuentas += 1;
        print("Cuenta agregada correctamente a la lista!!!");
    }

    public void mostrarCuentas() {
        print("--------------- LISTA DE CUENTAS --------------");
        for(CuentaBancaria cuenta : listaDeCuentas) {
            print("\n" + cuenta);
        }
    }

    public CuentaDeAhorro buscarCuentaDeAhorro(String numeroDeCuenta) {
        return (CuentaDeAhorro) listaDeCuentas.stream()
                .filter(cuentaBancaria -> cuentaBancaria.getNumeroDeCuenta().equals(numeroDeCuenta))
                .findFirst()
                .orElse(null);
    }

    public CuentaCorriente buscarCuentaCorriente(String numeroDeCuenta) {
        return (CuentaCorriente) listaDeCuentas.stream()
                .filter(cuentaBancaria -> cuentaBancaria.getNumeroDeCuenta().equals(numeroDeCuenta))
                .findFirst()
                .orElse(null);
    }

    public CuentaNomina buscarCuentaNomina(String numeroDeCuenta) {
        return (CuentaNomina) listaDeCuentas.stream()
                .filter(cuentaBancaria -> cuentaBancaria.getNumeroDeCuenta().equals(numeroDeCuenta))
                .findFirst()
                .orElse(null);
    }
}
