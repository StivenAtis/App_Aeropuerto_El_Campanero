package Classes;

/**
 *
 * @author Booh
 */
public class clsFlightCancelationAirline {
 
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
    private String id_airline;

    public clsFlightCancelationAirline(int id, String codigoVuelo, String ModeloAvion, String TipoVuelo, String salidaLlegada, String capacidadCarga, String tripulación, String fecha, String hora, String destino, String descripcion, String id_airline) {
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
        this.id_airline = id_airline;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the codigoVuelo
     */
    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    /**
     * @param codigoVuelo the codigoVuelo to set
     */
    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    /**
     * @return the ModeloAvion
     */
    public String getModeloAvion() {
        return ModeloAvion;
    }

    /**
     * @param ModeloAvion the ModeloAvion to set
     */
    public void setModeloAvion(String ModeloAvion) {
        this.ModeloAvion = ModeloAvion;
    }

    /**
     * @return the TipoVuelo
     */
    public String getTipoVuelo() {
        return TipoVuelo;
    }

    /**
     * @param TipoVuelo the TipoVuelo to set
     */
    public void setTipoVuelo(String TipoVuelo) {
        this.TipoVuelo = TipoVuelo;
    }

    /**
     * @return the salidaLlegada
     */
    public String getSalidaLlegada() {
        return salidaLlegada;
    }

    /**
     * @param salidaLlegada the salidaLlegada to set
     */
    public void setSalidaLlegada(String salidaLlegada) {
        this.salidaLlegada = salidaLlegada;
    }

    /**
     * @return the capacidadCarga
     */
    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    /**
     * @param capacidadCarga the capacidadCarga to set
     */
    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    /**
     * @return the tripulación
     */
    public String getTripulación() {
        return tripulación;
    }

    /**
     * @param tripulación the tripulación to set
     */
    public void setTripulación(String tripulación) {
        this.tripulación = tripulación;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the id_airline
     */
    public String getId_airline() {
        return id_airline;
    }

    /**
     * @param id_airline the id_airline to set
     */
    public void setId_airline(String id_airline) {
        this.id_airline = id_airline;
    }
    
    
}
