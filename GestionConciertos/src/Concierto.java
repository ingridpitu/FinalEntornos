
import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author ingla
 */
public class Concierto {
    
/**
 *
 * atributos para incluir nombre concierto, tipo String, fecha concierto LocalDate, 
 * objeto artista, música tipo String, lista de asistentes tipo Arraylist.
 */
    
    private String nombreConcierto;
    private LocalDate fechaConcierto;
    private Artista artista;
    private String tipoMusica;
    private ArrayList<Asistente> listaAsistentes;

    /**
     * métodos getters y setters
     * los datos de atributos nombre concierto, fecha concierto, artista, tipo musica,
     * lista de asistentes.
     */
    
    
    public String getNombreConcierto() {
        return nombreConcierto;
    }

    public void setNombreConcierto(String nombreConcierto) {
        this.nombreConcierto = nombreConcierto;
    }

    public LocalDate getFechaConcierto() {
        return fechaConcierto;
    }

    public void setFechaConcierto(LocalDate fechaConcierto) {
        this.fechaConcierto = fechaConcierto;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    public ArrayList<Asistente> getListaAsistentes() {
        return listaAsistentes;
    }

    public void setListaAsistentes(ArrayList<Asistente> listaAsistentes) {
        this.listaAsistentes = listaAsistentes;
    }

/**
 *
 * constructor público con sus atributos: nombre concierto, fecha concierto, artista, tipo musica,
 * lista de asistentes.
 */
    
    
    public Concierto(String nombreConcierto, LocalDate fechaConcierto, Artista artista, String tipoMusica, ArrayList<Asistente> listaAsistentes) {
        this.nombreConcierto = nombreConcierto;
        this.fechaConcierto = fechaConcierto;
        this.artista = artista;
        this.tipoMusica = tipoMusica;
        this.listaAsistentes = listaAsistentes;
    }

   
    
    
}
