package logica;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class Persona {
    private int id;
    private String nombre;
    private String dni;
    private Date fechaNac;
    private String telefono;
    private String email;
    private String imagen;
    private List <Idioma> listaIdiomas;
    private List <Estudio> listaEstudios;
    private List <Experiencia> listaExperiencias;
    private List <Curso> listaCursos;

    public Persona(int id, String nombre, String dni, Date fechaNac, String telefono, String email, String imagen, List<Idioma> listaIdiomas, List<Estudio> listaEstudios, List<Experiencia> listaExperiencias, List<Curso> listaCursos) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.email = email;
        this.imagen = imagen;
        this.listaIdiomas = listaIdiomas;
        this.listaEstudios = listaEstudios;
        this.listaExperiencias = listaExperiencias;
        this.listaCursos = listaCursos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<Idioma> getListaIdiomas() {
        return listaIdiomas;
    }

    public void setListaIdiomas(List<Idioma> listaIdiomas) {
        this.listaIdiomas = listaIdiomas;
    }

    public List<Estudio> getListaEstudios() {
        return listaEstudios;
    }

    public void setListaEstudios(List<Estudio> listaEstudios) {
        this.listaEstudios = listaEstudios;
    }

    public List<Experiencia> getListaExperiencias() {
        return listaExperiencias;
    }

    public void setListaExperiencias(List<Experiencia> listaExperiencias) {
        this.listaExperiencias = listaExperiencias;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + 
                ", dni=" + dni + 
                ", fechaNac=" + fechaNac + 
                ", telefono=" + telefono + 
                ", email=" + email + 
                ", imagen=" + imagen + 
                ", listaIdiomas=" + listaIdiomas + 
                ", listaEstudios=" + listaEstudios + 
                ", listaExperiencias=" + listaExperiencias + 
                ", listaCursos=" + listaCursos + '}';
    }
  
    public void agregarCurso(int id, String nombre, String certificado, String detalle, String imagen) {     
        this.listaCursos.add(new Curso(id, nombre, certificado, detalle, imagen));                
    }   
    
    public void agregarEstudioGrado(String carrera, int id, String titulo, String institucion, String imagen, String ingreso, String egreso){
        this.listaEstudios.add(new Grado(carrera,id,titulo,institucion,imagen,ingreso,egreso));
    }
    
    public void agregarEstudioPregrado(String promedio, int id, String titulo, String institucion, String imagen, String ingreso, String egreso){
        this.listaEstudios.add(new Pregrado(promedio,id,titulo,institucion,imagen,ingreso,egreso));
    }
    
    public void agregarExperiencia(int id, String empresa, String periodo, String descripcion, String imagen){
        this.listaExperiencias.add(new Experiencia(id, empresa,periodo,descripcion,imagen));
    }
    
    public void agregarIdioma(int id,String idiom, String nivel, String institucion, String imagen){
        this.listaIdiomas.add(new Idioma(id,idiom,nivel,institucion,imagen));
    }
}
