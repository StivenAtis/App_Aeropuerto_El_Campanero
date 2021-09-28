package Classes;

/**
 *
 * @author Booh
 */
public class clsFlightRequirements {
    
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

    //--------------------------------------------------------------------------
    
    public clsFlightRequirements(int id, String codigoVuelo, String ModeloAvion, String TipoVuelo, String salidaLlegada, String capacidadCarga, String tripulación, String fecha, String hora, String destino) {
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

    //--------------------------------------------------------------------------
}
