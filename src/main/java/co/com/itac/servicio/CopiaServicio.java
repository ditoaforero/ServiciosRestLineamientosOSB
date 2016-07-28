/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.itac.servicio;

import co.com.itac.dao.BaseDeDatos;
import co.com.itac.modelo.Copia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo-arevalo
 */
public class CopiaServicio {

    private List<Copia> copias = BaseDeDatos.getInstancia().getCopias();
    private TituloServicio tituloServicio = new TituloServicio();

    public List<Copia> getCopias(String idTitulo) {
        if(!tituloServicio.existsTitulo(idTitulo)){
            return null;
        }
        List<Copia> respuestaCopias = new ArrayList();
        for (Copia copia : copias) {
            if (copia.getIdTitulo().equals(idTitulo)) {
                respuestaCopias.add(copia);
            }
        }
        return respuestaCopias;
    }

    public Copia getCopia(String id) {
        for (Copia copia : copias) {
            if (copia.getId().equals(id)) {
                return copia;
            }
        }
        return null;
    }

    public Copia addCopia(Copia copia, String idTitulo) {
        if(!tituloServicio.existsTitulo(idTitulo)){
            return null;
        }
        String id = String.valueOf(copias.size()+1);
        copia.setId(id);
        copia.setIdTitulo(idTitulo);
        copias.add(copia);
        return copia;
    }

    public Copia updateCopia(Copia copia) {
        int posicion = getPosicion(copia.getId());
        try {
            copias.set(posicion, copia);
        } catch (IndexOutOfBoundsException ex) {
            return null;
        }
        return copia;
    }

    private int getPosicion(String id) {
        for (int i = 0; i < copias.size(); i++) {
            if (copias.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void deleteCopia(String id) {
        int posicion = getPosicion(id);
        copias.remove(posicion);
    }

}
