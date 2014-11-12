package pns.proyecto1.controller;

public class ProbarAreas {
    
      public static void main(String[] args) {
          /*lo quitamos porque la logica nunca va en una clase main.
        System.out.println(calcularArea(5));*/
          /*lo quitamos nuevamente para ahora poder utilizar spring, aunque ya es util
          System.out.println(new Cuadrado(5).calcularArea());*/
          ServicioSuperficie superficie = new ServicioSuperficie();
            System.out.println(superficie.ServicioArea());
    }
   /* public static String calcularArea(int x){
        int area = x*x;
        return "El area es: "+area;
    }*/
      
      
      
}
