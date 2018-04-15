

package avion;


public class Vuelos {
    String Id, origen, destino;

    Vuelos(){
    }
    
    public Vuelos(String Id, String origen, String destino) {
        this.Id = Id;
        this.origen = origen;
        this.destino = destino;
    }

    public String getId(){
        return Id;
    }
    public void setId(){
        this.Id=Id;
    }
    public String getOrigen(){
        return origen;
    }
    public void setOrigen(){
        this.origen=origen;
    }
    public String getDestino(){
        return destino;
    }
    public void setDestino(){
        this.destino=destino;
    }
}
