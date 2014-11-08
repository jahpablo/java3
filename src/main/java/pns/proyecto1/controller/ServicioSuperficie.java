package pns.proyecto1.controller;

public class ServicioSuperficie {
    Superficie superficie;

    public ServicioSuperficie(Superficie superficie) {
        this.superficie = superficie;
    }

    public ServicioSuperficie() {
    }
    
    public String ServicioArea(){
        return superficie.calcularArea();
    }
}
