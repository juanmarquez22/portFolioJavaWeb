package logica;

import java.util.Date;
import javax.persistence.*;

@Entity
@DiscriminatorValue(value="Grado")
public class Grado extends Estudio{
    
    @Basic
    private String carrera;

    public Grado() {
    }
    
    

    public Grado(String carrera, int id, String titulo, String institucion, String imagen, String ingreso, String egreso) {
        super(id, titulo, institucion, imagen, ingreso, egreso);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Grado{" + "carrera=" + carrera + '}';
    }
    
    
    
}