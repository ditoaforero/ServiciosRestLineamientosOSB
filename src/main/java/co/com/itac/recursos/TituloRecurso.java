/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.itac.recursos;

import co.com.itac.modelo.Copia;
import co.com.itac.modelo.Titulo;
import co.com.itac.servicio.CopiaServicio;
import co.com.itac.servicio.TituloServicio;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author eduardo-arevalo
 */
@Path("/Titulos")
public class TituloRecurso {

    TituloServicio tituloServicio = new TituloServicio();
    CopiaServicio copiaServicio = new CopiaServicio();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Titulo> getTitulos(@QueryParam("id") String id, @QueryParam("nombre") String nombre, @QueryParam("descripcion") String descripcion, @QueryParam("keywords") List<String> keywords, @QueryParam("autores") String autores) {
        if(esVacio(id) &&  esVacio(nombre) &&  esVacio(descripcion) && esVacio(keywords) && esVacio(autores)){
            return null;
        }
        return tituloServicio.getTitulos();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Titulo getTitulo(@PathParam("id") String id) {
        return tituloServicio.getTitulo(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Titulo addTitulo(Titulo titulo) {
        return tituloServicio.addTitulo(titulo);
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Titulo updateTitulo(Titulo titulo) {
        return tituloServicio.updateTitulo(titulo);
    }

    

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{idTitulo}/Copias")
    public List<Copia> getCopias(@PathParam("idTitulo") String idTitulo, @QueryParam("id") String id, @QueryParam("editorial") String editorial, @QueryParam("anho") String anho, @QueryParam("formato") String formato, @QueryParam("edicion") String edicion, @QueryParam("introduccion") String introduccion, @QueryParam("esConsultaGeneral") boolean esConsultaGeneral, @QueryParam("ubicacion") String ubicacion, @QueryParam("estado") String estado, @QueryParam("comentario") String comentario) {
        return copiaServicio.getCopias(idTitulo);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{idTitulo}/Copias/{idCopia}")
    public Copia getCopia(@PathParam("idCopia") String id) {
        return copiaServicio.getCopia(id);
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{idTitulo}/Copias")
    public Copia addCopia(Copia copia, @PathParam("idTitulo") String idTitulo) {
        return copiaServicio.addCopia(copia, idTitulo);
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{id}/Copias")
    public Copia updateCopia(Copia copia){
        return copiaServicio.updateCopia(copia);
    }
    
    private boolean esVacio(String parametro){
        return (parametro==null || parametro.trim().equals(""));
    }
    
    private boolean esVacio(List<String> parametro){
        return (parametro==null || parametro.isEmpty());
    }
    

}
