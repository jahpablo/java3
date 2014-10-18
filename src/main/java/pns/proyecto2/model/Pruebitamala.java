
package pns.proyecto2.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Pruebitamala {
    public static void main (String[] args){
        //pasos para la transaccion
        SessionFactory factory = UtilidadesHibernate.getSessionFactory();
        //abrir la sesion
            Session sesion = factory.openSession();
            //importantisimo. empezar la sesion
            Transaction t= sesion.beginTransaction();
                //viene lo bueno, hacer la operacion
            sesion.save(new Trabajador("pablo","nieto","suárez"));
                //el siguiente renglon libera el candado de la transaccion
                t.commit();
                //serramos la sesion
                factory.close();
    }
}
