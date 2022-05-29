package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Idioma implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String idiom;
    private String nivel;
    private String institucion;
    private String imagen;

    public Idioma() {
    }
    
    
    public Idioma(int id, String idiom, String nivel, String institucion, String imagen) {
        this.id = id;
        this.idiom = idiom;
        this.nivel = nivel;
        this.institucion = institucion;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }


    public String getIdiom() {
        return idiom;
    }

    public void setIdiom(String idiom) {
        this.idiom = idiom;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }


    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Idioma{" + "idiom=" + idiom + ", nivel=" + nivel + ", insittucion=" + institucion + ", imagen=" + imagen + '}';
    }
    
}
