/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.itac.modelo;

/**
 *
 * @author Dito
 */
public class Autor {
    
    private String nombres;
    private String primerApellido;
    private String segundoApellido;

    public Autor() {
    }

    public Autor(String nombres, String primerApellido, String segundoApellido) {
        this.nombres = nombres;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    
    
    
}
