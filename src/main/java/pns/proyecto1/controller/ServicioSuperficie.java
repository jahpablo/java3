package pns.proyecto1.controller;

public class ServicioSuperficie {
    Superficie superficie;

    public ServicioSuperficie(Superficie superficie) {
        this.superficie = superficie;
    }

    public ServicioSuperficie() {
    }
    
    public String ServicioArea(){
        Cuadrado d = new Cuadrado();
        d.setLado(6);
        return d.calcularArea();
    }
}
