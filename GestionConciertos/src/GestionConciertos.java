
import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author ingla
 */
public class GestionConciertos {
    
 /**
 *
 * atributos para listar conciertos y participantes, tipo Arraylist.
 */
    
    private ArrayList<Concierto> listaConciertos;

    private ArrayList<Participante> listaParticipantes;

/**
 *
 * constructor público con los atributos de listar conciertos y participantes.
 */
    
    
    public GestionConciertos(ArrayList<Concierto> listaConciertos, ArrayList<Participante> listaParticipantes) {
        this.listaConciertos = listaConciertos;
        this.listaParticipantes = listaParticipantes;
    }
    
    
    /**
     * método para listar conciertos.
     * No recibe ni devuelve ningun valor.
     */
    
    public void listarConciertos() {
        
    }

    /**
     * no recibe ni devuelve ningun valor.
     * método para listar asistentes.
     * 
     */ 
    public void listarAsistentes() {
        
    }

    /**
     * método para listar artistas.
     * No recibe ni devuelve ningun valor.
     *
     */ 
    public void listarArtistas() {
        
            }
    /**
     * método para dar de alta artistas, dando valor 
     * a los atributos.
     * No reciben ni devuleven ningun valor.
     */
    
    public void altaArtista(int numeroIntegrantes, String musicType, double cache, int codigo, String nombre) {
        
    }

     /**
     * método para dar de alta artistas, dando valor 
     * a los atributos.
     * No reciben ni devuleven ningun valor.
     */
        public void altaAsistente(String dni, LocalDate fechaNacimiento, int codigo, String nombre) {
        
        }
    
        
     /**
     * método para dar de alta concierto, añadiéndolo a la lista, 
     * @param  parametros nombre, fecha, codigo de artista, y tipo de musica.
     * No devuelve nada, tipo void.
     */
        
       public void altaConcierto(String nombreConcierto, LocalDate fechaConcierto, int codigoArtista, String tipoMusica) {
        
        } 
        
     /**
     * método para listar conciertos de un tipo de musica en concreto.
     * No devuelve nada, tipo void.
     */
        
       public void listarConciertoTipoMusica(String tipoMusica){
       
        }
        
        
        /**
         * método para añadir asistente a un concierto.
         * nombre concierto tipo String.
         * codigo concierto tipo int.
         */
        
        public void anadirAsistenteConcierto(String nombre, int codigo){
       
        }
        
        /**
         * método que devuleve la cantidad de conciertos a los que ha ido
         * un asistente.
         * Recibe codigo de asistente.
         * No devuelve nada, tipo void.
         */
        
        public void listarConciertosAsistente(int codigo){
        
        }
        
        /**
         * método para buscar asistente.
         * recibe dni tipo String.
         * devulve el asistente.
         */
        
        public Asistente buscarAsistente(String dni) {
        Asistente asistente = null;
        
                    return asistente;
                }
            
}

    
