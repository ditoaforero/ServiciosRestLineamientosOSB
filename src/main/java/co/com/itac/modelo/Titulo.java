/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.itac.modelo;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dito
 */

@XmlRootElement
public class Titulo {
    
    private String id;
    private String nombre;
    private String descripcion;
    private List<String> keywords;
    private List<Autor> autores;

    public Titulo() {
    }

    public Titulo(String id, String nombre, String descripcion, List<String> keywords, List<Autor> autores) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.keywords = keywords;
        this.autores = autores;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
    
    
    
}
