/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.itac.dao;

import co.com.itac.modelo.Autor;
import co.com.itac.modelo.Copia;
import co.com.itac.modelo.Titulo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dito
 */
public final class BaseDeDatos {

    private final static BaseDeDatos baseDeDatos = new BaseDeDatos();

    private final List<Titulo> titulos = new ArrayList();
    private final List<Copia> copias = new ArrayList();

    private BaseDeDatos() {

        List<String> keywords = new ArrayList();
        keywords.add("REST");
        keywords.add("WebServices");
        keywords.add("Design");
        keywords.add("Development");

        List<Autor> autores = new ArrayList();
        Autor autor01 = new Autor("Jim", "Webber", "Caceres");
        Autor autor02 = new Autor("Savas", "Parastatidis", "");
        Autor autor03 = new Autor("Ian", "Robinson", "");
        autores.add(autor01);
        autores.add(autor02);
        autores.add(autor03);

        Titulo titulo = new Titulo("LB43567", "REST in practice", "REST is different from traditional approaches to application design and development. It’s important to clearly understand REST and build on successful examples. REST in Practice meets this need head-on. Its authors are all excellent technologists and communicators, and have done a great job tackling this challenging subject", keywords, autores);

        titulos.add(titulo);

        Copia copia01 = new Copia("CP116546615", "LB43567", "O’Reilly books", "2013", "impreso", "Segunda edicion", "Mark Harley", true, "Biblioteca Luis Angel Arango Bogota Sala TI", "disponible", "grruedat", "DVD complementario disponible");
        copias.add(copia01);

    }

    public static BaseDeDatos getInstancia() {
        return baseDeDatos;
    }

    public List<Titulo> getTitulos() {
        return titulos;
    }

    public List<Copia> getCopias() {
        return copias;
    }

}
