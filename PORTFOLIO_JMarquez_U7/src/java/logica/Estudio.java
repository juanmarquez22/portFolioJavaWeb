package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Tipo", discriminatorType=DiscriminatorType.STRING)

public abstract class Estudio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int id;
    @Basic
    protected String titulo;
    protected String institucion;
    protected String imagen;
    protected String ingreso;
    protected String egreso;
    protected String tipo;

    public Estudio() {
    }

    public Estudio(int id, String titulo, String institucion, String imagen, String ingreso, String egreso) {
        this.id = id;
        this.titulo = titulo;
        this.institucion = institucion;
        this.imagen = imagen;
        this.ingreso = ingreso;
        this.egreso = egreso;
    }
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getEgreso() {
        return egreso;
    }

    public void setEgreso(String egreso) {
        this.egreso = egreso;
    }
    
    public String getTipo() {
        return tipo;
    }

    
      
    
}
