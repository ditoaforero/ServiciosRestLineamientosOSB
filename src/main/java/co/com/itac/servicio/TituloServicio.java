/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.itac.servicio;

import co.com.itac.dao.BaseDeDatos;
import co.com.itac.modelo.Titulo;
import java.util.List;

/**
 *
 * @author eduardo-arevalo
 */
public class TituloServicio {

    private List<Titulo> titulos = BaseDeDatos.getInstancia().getTitulos();
    

    public List<Titulo> getTitulos() {
        return titulos;
    }

    public Titulo getTitulo(String id) {
        for (Titulo titulo : titulos) {
            if (titulo.getId().equals(id)) {
                return titulo;
            }
        }
        return null;
    }

    public Titulo addTitulo(Titulo titulo) {
        String id = String.valueOf(titulos.size() + 1);
        titulo.setId(id);
        titulos.add(titulo);
        return titulo;
    }

    public Titulo updateTitulo(String idTitulo, Titulo tituloParam) {
        Titulo titulo = getTitulo(idTitulo);
        if (titulo == null) {
            return null;
        }
        int posicion = getPosicion(idTitulo);
        try {
            titulo = updateCamposTitulo(tituloParam, titulo);
            titulos.set(posicion, titulo);
            return titulo;
        } catch (IndexOutOfBoundsException ex) {
            return null;
        }
    }

    private Titulo updateCamposTitulo(Titulo tituloOrigen, Titulo tituloDestino) {
        if (tituloOrigen.getDescripcion() != null) {
            tituloDestino.setDescripcion(tituloOrigen.getDescripcion());
        }
        if (tituloOrigen.getAutores() != null) {
            tituloDestino.setAutores(tituloOrigen.getAutores());
        }
        if (tituloOrigen.getKeywords() != null) {
            tituloDestino.setKeywords(tituloOrigen.getKeywords());
        }
        if (tituloOrigen.getNombre() != null) {
            tituloDestino.setNombre(tituloOrigen.getNombre());
        }
        return tituloDestino;
    }

    private int getPosicion(String id) {
        for (int i = 0; i < titulos.size(); i++) {
            if (titulos.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void deleteTitulo(String idTitulo) {
        int posicion = getPosicion(idTitulo);
        titulos.remove(posicion);
    }
    

    public boolean existsTitulo(String id) {
        for (Titulo titulo : titulos) {
            if (titulo.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

}
