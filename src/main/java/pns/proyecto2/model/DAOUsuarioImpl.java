package pns.proyecto2.model;

import java.util.ArrayList;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DAOUsuarioImpl {
    public String obtenerTodos() throws Exception{
        SessionFactory factory = HibernateUtilidades.getSessionFactory();
        Session sesion = factory.openSession();
        Transaction tranza = sesion.beginTransaction();
        
        Criteria cri = sesion.createCriteria(Usuarios.class);
        ArrayList<Usuarios> usuarios = (ArrayList<Usuarios>)cri.list();
        
        ObjectMapper mapper = new ObjectMapper();
        
        tranza.commit();
        sesion.close();
        
        return mapper.writeValueAsString(usuarios);
    }
}
