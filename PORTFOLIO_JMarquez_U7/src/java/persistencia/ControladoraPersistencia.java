
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Curso;
import logica.Estudio;
import logica.Experiencia;
import logica.Grado;
import logica.Idioma;
import logica.Pregrado;
import persistencia.exceptions.NonexistentEntityException;


public class ControladoraPersistencia {
    
    CursoJpaController cursoJPA = new CursoJpaController();
    EstudioJpaController estudioJPA = new EstudioJpaController();
    ExperienciaJpaController experJPA = new ExperienciaJpaController();
    GradoJpaController gradoJPA = new GradoJpaController();
    IdiomaJpaController idiomaJPA = new IdiomaJpaController();
    PregradoJpaController pregradoJPA = new PregradoJpaController();
    
    //CURSOS
    public void crearCurso (Curso curso){
        cursoJPA.create(curso);
    }
    public void eliminarCurso (int id){
        try {
            cursoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarCurso (Curso curso){
        try {
            cursoJPA.destroy(curso.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Curso> traerCursos () {
        return cursoJPA.findCursoEntities();
    }
    
    //EXPERIENCIA
    public void crearExper (Experiencia exper){
        experJPA.create(exper);
    }
    public void eliminarExper (int id){
        try {
            experJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarExper (Experiencia exper){
        try {
            experJPA.destroy(exper.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Experiencia> traerExper () {
        return experJPA.findExperienciaEntities();
    }
    
    //GRADO
    public void crearGrado (Grado grado){
        gradoJPA.create(grado);
    }
    public void eliminarGrado (int id){
        try {
            gradoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarGrado (Grado grado){
        try {
            gradoJPA.destroy(grado.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Grado> traerGrados () {
        return gradoJPA.findGradoEntities();
    }
    
    //IDIOMA
    public void crearIdioma (Idioma idioma){
        idiomaJPA.create(idioma);
    }
    public void eliminarIdioma (int id){
        try {
            idiomaJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarIdioma (Idioma idioma){
        try {
            idiomaJPA.destroy(idioma.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Idioma> traerIdiomas () {
        return idiomaJPA.findIdiomaEntities();
    }
    
    //PREGRADO
    public void crearPregrado (Pregrado pregrado){
        pregradoJPA.create(pregrado);
    }
    public void eliminarPregrado (int id){
        try {
            pregradoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarPregrado (Pregrado pregrado){
        try {
            pregradoJPA.destroy(pregrado.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Pregrado> traerPregrados () {
        return pregradoJPA.findPregradoEntities();
    }
    
    //ESTUDIO
    public void crearEstudio (Estudio estudio){
        estudioJPA.create(estudio);
    }
    public void eliminarEstudio (int id){
        try {
            estudioJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarEstudio (Estudio estudio){
        try {
            pregradoJPA.destroy(estudio.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Estudio> traerEstudios () {
        return estudioJPA.findEstudioEntities();
    }
}
