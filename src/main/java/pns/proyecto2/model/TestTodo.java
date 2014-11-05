package pns.proyecto2.model;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class TestTodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //abrir la ssession factory
        //cada que muestre algun errorsiyo, con la ayuda de netbeans daremos importar todo a hibernate
        SessionFactory factory = HibernateUtilidades.getSessionFactory();
            Session sesion = factory.openSession();
        //Empezar una transaccion
            Transaction tranza = sesion.beginTransaction();
            
        /*//Haremos un insert 
            Trabajador t = new Trabajador("Sandra","Lezama","Perez");
                sesion.save(t);
        //liberamos la transaccion
                tranza.commit();
        //cerramos la sesion , es decir devolvemos la libertad al borrador
                sesion.close();*/
            
          /* //update 
            sesion.update(new Trabajador(2,"rata","de","dos patas"));
            tranza.commit();
            sesion.close();*/
            
            /* //delete 
            sesion.delete(new Trabajador(4,"Sandra","Lezama","Perez"));
            tranza.commit();
            sesion.close();*/
            
           /* //busqueda de todos
            ArrayList<Trabajador> tra = (ArrayList<Trabajador>)sesion.createCriteria(Trabajador.class).list();
            tranza.commit();
            sesion.close();*/
            
             //busqueda de todos mostrandola
            /*ArrayList<Trabajador> tra = (ArrayList<Trabajador>)sesion.createCriteria(Trabajador.class).list();
            for(Trabajador tonto:tra){
                System.out.println(tonto);
            }
            tranza.commit();
            sesion.close();*/
            
             //busqueda por id
            Trabajador tra = (Trabajador)sesion.createCriteria(Trabajador.class).add(Restrictions.idEq(2)).uniqueResult();
               System.out.println(tra);
            tranza.commit();
            sesion.close();
            
    }
    
}
