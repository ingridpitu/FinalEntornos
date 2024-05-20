

/**
 *
 * @author ingla
 */
public class Artista extends Participante {
    
    
    /**
     * atributos numero de integrantes, tipo int.
     * tipo de música, tipo String.
     * atributo caché, tipo double.
     */
    
    private int numIntegrantes;
    private String tipoMusica;
    private double cache;

    
    /**
     * metodos getters y setters de los atributos.
     * devulven valores tipo int, String, double.
     */
    public int getNumIntegrantes() {
        return numIntegrantes;
    }

    public void setNumIntegrantes(int numIntegrantes) {
        this.numIntegrantes = numIntegrantes;
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }
  
    
 /**
 *
 * constructor artista con sus atributos: numIntegrantes, tipoMusica, cache, 
 * codigo, nombre.
 */
    
    public Artista(int numIntegrantes, String tipoMusica, double cache, int codigo, String nombre) {
        super(codigo, nombre);
        this.numIntegrantes = numIntegrantes;
        this.tipoMusica = tipoMusica;
        this.cache = cache;
    }
    
    
}
