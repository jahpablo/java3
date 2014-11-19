package pns.proyecto2.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProbarUsuariosDireccion {

    public static void main(String[] args) {
       SessionFactory factory = HibernateUtilidades.getSessionFactory();
        Session sesion = factory.openSession();
         Transaction tranza = sesion.beginTransaction();
            
            Usuarios u = new Usuarios();
            Direccion d = new Direccion();
            
            d.setCalle("Calle de la amargura");
            d.setColonia("Colonia de avon");
            d.setCp(55130);
            d.setEstado("Ebriedad");
            //importante ligar al usuario anterior esta direccion
            d.setIdUsuario(u);
            
            u.setDireccion(d);
            u.setEdad(27);
            u.setNombre("Pablo");
            u.setSueldo(4567f);
            
            sesion.save(u);
            sesion.save(d);
            
            tranza.commit();
            sesion.close();
            System.out.println("todo se guardo bien");
    }
    
}
