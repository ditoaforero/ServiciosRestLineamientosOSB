/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.itac.modelo;

/**
 *
 * @author eduardo-arevalo
 */
public class Copia {
    
    private String id;
    private String idTitulo;
    private String editorial;
    private String anho;
    private String formato;
    private String edicion;
    private String introduccion;
    private boolean esConsultaGeneral;
    private String ubicacion;
    private String estado;
    private String ultimoUsuario;
    private String comentario;

    public Copia() {
    }

    public Copia(String id, String idTitulo, String editorial, String anho, String formato, String edicion, String introduccion, boolean esConsultaGeneral, String ubicacion, String estado, String ultimoUsuario, String comentario) {
        this.id = id;
        this.idTitulo = idTitulo;
        this.editorial = editorial;
        this.anho = anho;
        this.formato = formato;
        this.edicion = edicion;
        this.introduccion = introduccion;
        this.esConsultaGeneral = esConsultaGeneral;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.ultimoUsuario = ultimoUsuario;
        this.comentario = comentario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(String idTitulo) {
        this.idTitulo = idTitulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAnho() {
        return anho;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getIntroduccion() {
        return introduccion;
    }

    public void setIntroduccion(String introduccion) {
        this.introduccion = introduccion;
    }

    public boolean isEsConsultaGeneral() {
        return esConsultaGeneral;
    }

    public void setEsConsultaGeneral(boolean esConsultaGeneral) {
        this.esConsultaGeneral = esConsultaGeneral;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUltimoUsuario() {
        return ultimoUsuario;
    }

    public void setUltimoUsuario(String ultimoUsuario) {
        this.ultimoUsuario = ultimoUsuario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
    
    
}
