package pns.proyecto1.controller;

public class Cuadrado implements Superficie{
    private int lado;
    
    public Cuadrado(){
    }
    
    public Cuadrado(int lado){
        this.lado=lado;
    }
    
    public int getLado(){
        return lado;
    }
    
    public void setLado(int lado){
        this.lado=lado;
    }
    
    public String calcularArea(){
        int area = lado*lado;
            return "El area es: " + area;
    }
}
