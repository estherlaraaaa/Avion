

package avion;

public class Aeropuerto {
    String Id, pais, ciudad;

    Aeropuerto(){
    }
    
    public Aeropuerto(String Id, String pais, String ciudad) {
        this.Id = Id;
        this.pais = pais;
        this.ciudad = ciudad;
    
    }
    
    public String getId(){
        return Id;
    }
    public void setId(){
        this.Id=Id;
    }
    public String getPais(){
        return pais;
    }
    public void setPais(){
        this.pais=pais;
    }
    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(){
        this.ciudad=ciudad;
    }
    
}
