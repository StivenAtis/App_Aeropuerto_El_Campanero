package Classes;

/**
 *
 * @author Booh
 */
public class clsFlightRequerimentsCanceled {
    
    private int id;
    private String codigoVuelo;
    private String ModeloAvion;
    private String TipoVuelo;
    private String salidaLlegada;
    private String capacidadCarga;
    private String tripulación;
    private String fecha;
    private String hora;
    private String destino;
    private String descripcion;
    private String id_aerolinea;

    //--------------------------------------------------------------------------

    public clsFlightRequerimentsCanceled(int id, String codigoVuelo, String ModeloAvion, String TipoVuelo, String salidaLlegada, String capacidadCarga, String tripulación, String fecha, String hora, String destino, String descripcion, String id_aerolinea) {
        this.id = id;
        this.codigoVuelo = codigoVuelo;
        this.ModeloAvion = ModeloAvion;
        this.TipoVuelo = TipoVuelo;
        this.salidaLlegada = salidaLlegada;
        this.capacidadCarga = capacidadCarga;
        this.tripulación = tripulación;
        this.fecha = fecha;
        this.hora = hora;
        this.destino = destino;
        this.descripcion = descripcion;
        this.id_aerolinea = id_aerolinea;
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

    public String getModeloAvion() {
        return ModeloAvion;
    }

    public void setModeloAvion(String ModeloAvion) {
        this.ModeloAvion = ModeloAvion;
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

    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getTripulación() {
        return tripulación;
    }

    public void setTripulación(String tripulación) {
        this.tripulación = tripulación;
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

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getId_aerolinea() {
        return id_aerolinea;
    }

    public void setId_aerolinea(String id_aerolinea) {
        this.id_aerolinea = id_aerolinea;
    }
    
    //--------------------------------------------------------------------------

    
}
