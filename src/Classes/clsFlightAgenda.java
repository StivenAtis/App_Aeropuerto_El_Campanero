package Classes;

/**
 *
 * @author Booh
 */
public class clsFlightAgenda {
    
    private int id;
    private String codigoVueloAgenda;
    private String tipoVuelo;
    private String claseVuelo;
    private String tripulación;
    private String destino;
    private String pista;
    private String fecha;
    private String tiempo;
    private String idAerolinea;

    //--------------------------------------------------------------------------
    
    public clsFlightAgenda(int id, String codigoVueloAgenda, String tipoVuelo, String claseVuelo, String tripulación, String destino, String pista, String fecha, String tiempo, String idAerolinea) {
        this.id = id;
        this.codigoVueloAgenda = codigoVueloAgenda;
        this.tipoVuelo = tipoVuelo;
        this.claseVuelo = claseVuelo;
        this.tripulación = tripulación;
        this.destino = destino;
        this.pista = pista;
        this.fecha = fecha;
        this.tiempo = tiempo;
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

    public String getClaseVuelo() {
        return claseVuelo;
    }

    public void setClaseVuelo(String claseVuelo) {
        this.claseVuelo = claseVuelo;
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

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getIdAerolinea() {
        return idAerolinea;
    }

    public void setIdAerolinea(String idAerolinea) {
        this.idAerolinea = idAerolinea;
    }
    
    //--------------------------------------------------------------------------
}
