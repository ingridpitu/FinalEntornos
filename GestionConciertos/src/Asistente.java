
import java.time.LocalDate;


/**
 *
 * @author ingla
 */
public class Asistente extends Participante {
    
    /**
     * atributos dni, tipo String.
     * fecha de nacimiento LocalDate.
     */
    
    private String dni;
    private LocalDate fechaNac;

    /**
     * métodos getters y setters de  dni y
     * fecha de nacimiento LocalDate.
     */
    
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

 /**
 *
 * método constructor público de asistente con sus atributos: dni, 
 * fechaNac, codigo, nombre.
 */
    
    public Asistente(String dni, LocalDate fechaNac, int codigo, String nombre) {
        super(codigo, nombre);
        this.dni = dni;
        this.fechaNac = fechaNac;
    }

    

    
}
