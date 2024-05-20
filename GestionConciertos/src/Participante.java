

/**
 *
 * @author ingla
 */
public class Participante {
    
    /**
     * atributos de participante, codigo, nombre.
     * 
     */
    
    private int codigo;
    private String nombre;

    /**
     * métodos getters y setters participante: codigo, nombre.
     * 
     */
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
 /**
 *
 * método constructor público de participante con sus atributos.
 */
    public Participante(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
}
