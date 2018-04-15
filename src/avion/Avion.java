

package avion;



public class Avion {

    String matricula, tipo;
    int capacidad, horas;
   
    Avion(){
    }

    public Avion(String matricula, String tipo, int capacidad, int horas ) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.horas = horas;
    }
    
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(){
        this.matricula=matricula;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(){
        this.tipo=tipo;
    }    
    public int getCapacidad(){
        return capacidad;
    }
    public void setCapacidad(){
        this.capacidad=capacidad;
    }
    public int getHoras(){
        return horas;
    }
    public void setHoras(){
        this.horas=horas;
    }
    
    public static void main(String[] args) {
       
    }
    
}
