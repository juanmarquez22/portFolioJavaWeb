package logica;

import java.util.Date;
import javax.persistence.*;

@Entity
@DiscriminatorValue(value="Pregrado")
public class Pregrado extends Estudio{
    @Basic
    private String promedio;

    public Pregrado() {
    }
    
    

    public Pregrado(String promedio, int id, String titulo, String institucion, String imagen, String ingreso, String egreso) {
        super(id, titulo, institucion, imagen, ingreso, egreso);
        this.promedio = promedio;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Pregrado{" + "promedio=" + promedio + '}';
    }

       
    
}
