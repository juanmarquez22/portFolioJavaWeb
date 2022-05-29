/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.ControladoraPersistencia;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author juanm
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //CURSO
    public void crearCurso (Curso curso){
       controlPersis.crearCurso(curso);
    }
    public void eliminarCurso (int id){
       controlPersis.eliminarCurso(id);
    }
    public void eliminarCurso (Curso curso){
      controlPersis.eliminarCurso(curso);
    }
    public List<Curso> traerCursos () {
        return controlPersis.traerCursos();
    }
    
    //EXPERIENCIA
    public void crearExper (Experiencia exper){
        controlPersis.crearExper(exper);
    }
    public void eliminarExper (int id){
        controlPersis.eliminarExper(id);
    }
    public void eliminarExper (Experiencia exper){
        controlPersis.eliminarExper(exper);
    }
    public List<Experiencia> traerExper () {
        return controlPersis.traerExper();
    }
    
    //GRADO
    public void crearGrado (Grado grado){
        controlPersis.crearGrado(grado);
    }
    public void eliminarGrado (int id){
        controlPersis.eliminarGrado(id);
    }
    public void eliminarGrado (Grado grado){
        controlPersis.eliminarGrado(grado);
    }
    public List<Grado> traerGrados () {
        return controlPersis.traerGrados();
    }
    
    //IDIOMA
    public void crearIdioma (Idioma idioma){
        controlPersis.crearIdioma(idioma);
    }
    public void eliminarIdioma (int id){
        controlPersis.eliminarIdioma(id);
    }
    public void eliminarIdioma (Idioma idioma){
        controlPersis.eliminarIdioma(idioma);
    }
    public List<Idioma> traerIdiomas () {
        return controlPersis.traerIdiomas();
    }
    
    //PREGRADO
    public void crearPregrado (Pregrado pregrado){
        controlPersis.crearPregrado(pregrado);
    }
    public void eliminarPregrado (int id){
        controlPersis.eliminarPregrado(id);
    }
    public void eliminarPregrado (Pregrado pregrado){
        controlPersis.eliminarPregrado(pregrado);
    }
    public List<Pregrado> traerPregrados () {
        return controlPersis.traerPregrados();
    }
    
    //ESTUDIO
    public void crearEstudio (Estudio estudio){
        controlPersis.crearEstudio(estudio);
    }
    public void eliminarEstudio (int id){
        controlPersis.eliminarEstudio(id);
    }
    public void eliminarEstudio (Estudio estudio){
        controlPersis.eliminarEstudio(estudio);
    }
    public List<Estudio> traerEstudios () {
        return controlPersis.traerEstudios();
    }
}
