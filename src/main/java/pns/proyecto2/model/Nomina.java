package pns.proyecto2.model;


public class Nomina {
    Trabajador t;

    public Nomina() {
       
    }

    public Nomina(Trabajador t) {
        this.t = t;
    }
    public float pagarNomina(){
        
        float pago=t.getHorasLaboradas()*t.getSueldoBase();
        return pago;
    }
    
}
    

