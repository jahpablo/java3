package pns.proyecto2.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DAOUsuarioImpl {
    public String obtenerTodos() throws Exception{
        SessionFactory factory = HibernateUtilidades.getSessionFactory();
        Session sesion = factory.openSession();
        Transaction tranza = sesion.beginTransaction();
        
        Criteria cri = sesion.createCriteria(Usuarios.class);
        
        ArrayList<Usuarios> usuarios = (ArrayList<Usuarios>)cri.list();
        Map<String, ArrayList<Usuarios>> singletonMap = Collections.singletonMap("usuarios", usuarios);
        ObjectMapper mapper = new ObjectMapper();
        
        tranza.commit();
        sesion.close();
        
        return mapper.writeValueAsString(singletonMap);
    }
    public String obtenerUsuarioPorId(Integer id) throws Exception{
          SessionFactory factory= HibernateUtilidades.getSessionFactory();
  Session sesion=    factory.openSession();
  Transaction tranza= sesion.beginTransaction();

  //utilizando Criteria
Criteria cri=sesion.createCriteria(Usuarios.class).add(Restrictions.idEq(id));
Usuarios u=(Usuarios)cri.uniqueResult();

//utilizando HQL
Query cuerito = sesion.createQuery("from Usuarios as usuario where id=?");
Usuarios u2 = (Usuarios) cuerito.setInteger(0, id).uniqueResult();
ObjectMapper mapper=new ObjectMapper();
    tranza.commit();
    sesion.close();

return mapper.writeValueAsString(u);
    }
}
