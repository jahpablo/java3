package pns.proyecto2.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

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
        //Haremos un insert 
            Trabajador t = new Trabajador("pablo","nieto","Suarez del Real");
                sesion.save(t);
        //liberamos la transaccion
                tranza.commit();
        //cerramos la sesion , es decir devolvemos la libertad al borrador
                sesion.close();
    }
    
}
