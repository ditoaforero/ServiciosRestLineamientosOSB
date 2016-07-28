/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.itac.servicio;

import co.com.itac.dao.BaseDeDatos;
import co.com.itac.modelo.Copia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author eduardo-arevalo
 */
public class CopiaServicio {

    private List<Copia> copias = BaseDeDatos.getInstancia().getCopias();
    private TituloServicio tituloServicio = new TituloServicio();

    public List<Copia> getCopias(String idTitulo) {
        List<Copia> respuestaCopias = new ArrayList();
        for (Copia copia : copias) {
            if (copia.getIdTitulo().equals(idTitulo)) {
                respuestaCopias.add(copia);
            }
        }
        return respuestaCopias;
    }

    public Copia getCopia(String idTitulo, String id) {
        for (Copia copia : copias) {
            if (copia.getIdTitulo().equals(idTitulo) && copia.getId().equals(id)) {
                return copia;
            }
        }
        return null;
    }

    public Copia addCopia(String idTitulo, Copia copia) {
        if (!tituloServicio.existsTitulo(idTitulo)) {
            return null;
        }
        String id = String.valueOf(copias.size() + 1);
        copia.setId(id);
        copia.setIdTitulo(idTitulo);
        copias.add(copia);
        return copia;
    }

    public Copia updateCopia(String idTitulo, String idCopia, Copia copiaParametro) {
        Copia copia = getCopia(idTitulo, idCopia);
        if (copia == null) {
            return null;
        }
        int posicion = getPosicion(idTitulo, idCopia);
        try {
            copia = updateCamposCopia(copiaParametro, copia);
            copias.set(posicion, copia);
            return copia;
        } catch (IndexOutOfBoundsException ex) {
            return null;
        }
    }

    private int getPosicion(String idTitulo, String idCopia) {
        for (int i = 0; i < copias.size(); i++) {
            Copia copia = copias.get(i);
            if (copia.getIdTitulo().equals(idTitulo) && copia.getId().equals(idCopia)) {
                return i;
            }
        }
        return -1;
    }

    public void deleteCopia(String idTitulo, String idCopia) {
        int posicion = getPosicion(idTitulo, idCopia);
        copias.remove(posicion);
    }

    public void deleteCopiasXIdTitulo(String idTitulo) {
        for (Iterator<Copia> iter = copias.iterator(); iter.hasNext();) {
            Copia copia = iter.next();
            if (copia.getIdTitulo().equals(idTitulo)) {
                iter.remove();
            }
        }
    }

    private Copia updateCamposCopia(Copia copiaOrigen, Copia copiaDestino) {
        if (copiaOrigen.getEditorial() != null) {
            copiaDestino.setEditorial(copiaOrigen.getEditorial());
        }
        return copiaDestino;
    }

}
