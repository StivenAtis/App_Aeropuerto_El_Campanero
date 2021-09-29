package Classes;

/**
 *
 * @author Booh
 */
public class clsDeniedFlights {
    
    //--------------------------------------------------------------------------

    private int id;
    private String codigoVueloAgenda;
    private String tipoVuelo;
    private String llegadaSalida;
    private String fecha;
    private String hora;
    private String ModeloAvion;
    private String capacidadAvion;
    private String tripulación;    
    private String destino;
    private String despricion;   
    private String idAerolinea;

    //--------------------------------------------------------------------------
    
    public clsDeniedFlights(int id, String codigoVueloAgenda, String tipoVuelo, String llegadaSalida, String fecha, String hora, String ModeloAvion, String capacidadAvion, String tripulación, String destino, String despricion, String idAerolinea) {
        this.id = id;
        this.codigoVueloAgenda = codigoVueloAgenda;
        this.tipoVuelo = tipoVuelo;
        this.llegadaSalida = llegadaSalida;
        this.fecha = fecha;
        this.hora = hora;
        this.ModeloAvion = ModeloAvion;
        this.capacidadAvion = capacidadAvion;
        this.tripulación = tripulación;
        this.destino = destino;
        this.despricion = despricion;
        this.idAerolinea = idAerolinea;
    }

    //--------------------------------------------------------------------------
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoVueloAgenda() {
        return codigoVueloAgenda;
    }

    public void setCodigoVueloAgenda(String codigoVueloAgenda) {
        this.codigoVueloAgenda = codigoVueloAgenda;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public String getLlegadaSalida() {
        return llegadaSalida;
    }

    public void setLlegadaSalida(String llegadaSalida) {
        this.llegadaSalida = llegadaSalida;
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

    public String getModeloAvion() {
        return ModeloAvion;
    }

    public void setModeloAvion(String ModeloAvion) {
        this.ModeloAvion = ModeloAvion;
    }

    public String getCapacidadAvion() {
        return capacidadAvion;
    }

    public void setCapacidadAvion(String capacidadAvion) {
        this.capacidadAvion = capacidadAvion;
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

    public String getDespricion() {
        return despricion;
    }

    public void setDespricion(String despricion) {
        this.despricion = despricion;
    }

    public String getIdAerolinea() {
        return idAerolinea;
    }

    public void setIdAerolinea(String idAerolinea) {
        this.idAerolinea = idAerolinea;
    }
    
    //--------------------------------------------------------------------------
}
