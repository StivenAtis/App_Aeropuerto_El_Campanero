package Classes;

/**
 *
 * @author Booh
 */
public class clsFlightRequerimentsReprogramation {
    
    //--------------------------------------------------------------------------
    
    private int id;
    private String codigoVuelo;
    private String TipoVuelo;
    private String salidaLlegada;
    private String tripulación;
    private String destino;
    private String capacidadCarga;
    private String ModeloAvion;
    private String fecha;
    private String hora;
    private String descripcion;
    private String id_airline;
    
    //--------------------------------------------------------------------------

    public clsFlightRequerimentsReprogramation(int id, String codigoVuelo, String TipoVuelo, String salidaLlegada, String tripulación, String destino, String capacidadCarga, String ModeloAvion, String fecha, String hora, String descripcion, String id_airline) {
        this.id = id;
        this.codigoVuelo = codigoVuelo;
        this.TipoVuelo = TipoVuelo;
        this.salidaLlegada = salidaLlegada;
        this.tripulación = tripulación;
        this.destino = destino;
        this.capacidadCarga = capacidadCarga;
        this.ModeloAvion = ModeloAvion;
        this.fecha = fecha;
        this.hora = hora;
        this.descripcion = descripcion;
        this.id_airline = id_airline;
    }
    
    //--------------------------------------------------------------------------


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public String getTipoVuelo() {
        return TipoVuelo;
    }

    public void setTipoVuelo(String TipoVuelo) {
        this.TipoVuelo = TipoVuelo;
    }

    public String getSalidaLlegada() {
        return salidaLlegada;
    }

    public void setSalidaLlegada(String salidaLlegada) {
        this.salidaLlegada = salidaLlegada;
    }

    public String getTripulación() {
        return tripulación;
    }

    public void setTripulación(String tripulación) {
        this.tripulación = tripulación;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getModeloAvion() {
        return ModeloAvion;
    }

    public void setModeloAvion(String ModeloAvion) {
        this.ModeloAvion = ModeloAvion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getId_airline() {
        return id_airline;
    }

    public void setId_airline(String id_airline) {
        this.id_airline = id_airline;
    }

    //--------------------------------------------------------------------------
}
