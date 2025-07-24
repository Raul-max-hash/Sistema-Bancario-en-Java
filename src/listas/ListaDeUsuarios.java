package listas;

import java.util.List;
import java.util.ArrayList;

import modelo.Usuario;
import static utilidades.Print.*;

public class ListaDeUsuarios {
    private List<Usuario> listaDeUsuarios;

    public ListaDeUsuarios(List<Usuario> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    public ListaDeUsuarios() {
        this.listaDeUsuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuarioNuevo) {
        listaDeUsuarios.add(usuarioNuevo);
    }

    public void mostrarUsuarios() {
        listaDeUsuarios.forEach(usuario -> print(usuario));
    }

    public Usuario buscarUsuario(String CURP_DEL_USUARIO) {
        return listaDeUsuarios.stream()
                .filter(usuario -> usuario.getCURP().equals(CURP_DEL_USUARIO))
                .findFirst()
                .orElse(null);
    }

    public List<Usuario> getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public void setListaDeUsuarios(List<Usuario> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }
}
