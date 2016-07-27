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
        String id = String.valueOf(titulos.size()+1);
        titulo.setId(id);
        titulos.add(titulo);
        return titulo;
    }

    public Titulo updateTitulo(Titulo titulo) {
        int posicion = getPosicion(titulo.getId());
        try {
            titulos.set(posicion, titulo);
        } catch (IndexOutOfBoundsException ex) {
            return null;
        }
        return titulo;
    }

    private int getPosicion(String id) {
        for (int i = 0; i < titulos.size(); i++) {
            if (titulos.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void deleteTitulo(String id) {
        int posicion = getPosicion(id);
        titulos.remove(posicion);
    }

}
