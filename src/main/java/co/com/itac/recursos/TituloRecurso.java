/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.itac.recursos;

import co.com.itac.modelo.Titulo;
import co.com.itac.servicio.TituloServicio;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Dito
 */

@Path("/Titulos")
public class TituloRecurso {
    
    
    TituloServicio tituloServicio = new TituloServicio();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Titulo> getTitulos(){
        return tituloServicio.getTitulos();
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Titulo addTitulo(Titulo titulo){
        return tituloServicio.addTitulo(titulo);
    }
    
}