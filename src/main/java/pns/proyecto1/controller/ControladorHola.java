package pns.proyecto1.controller;

import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pns.proyecto2.model.DAOUsuarioImpl;

@Controller
@RequestMapping("/")
public class ControladorHola {
    
    @RequestMapping(value = "/hola", method = RequestMethod.GET, headers = {"Accept=application/json"})
        public @ResponseBody String hola(){
            
            return "hola desde mi primer controler malo ";
        }
         @RequestMapping(value = "/user", method = RequestMethod.GET, headers = {"Accept=application/json"})
        public @ResponseBody String usuarios()throws Exception{
             DAOUsuarioImpl da = new DAOUsuarioImpl();
             
            return da.obtenerTodos();
        }
        
          @RequestMapping(value="/user/{id}", method=RequestMethod.GET, headers={"Accept=Application/json"})
    public @ResponseBody String userid(@PathVariable Integer id)throws Exception{
   DAOUsuarioImpl du=new DAOUsuarioImpl();
     
        return du.obtenerUsuarioPorId(id) ;
    }
   /* esto es una opcion
    //primero hacemos el get
    @RequestMapping(value="/hola", method=RequestMethod.GET, headers={"Accept=text/html"})
    public @ResponseBody String holaConGet(){
        return "Este es el primer controller con un get";
    }
    
    //crear un metodo get para los usuarios que me devuelva todos 
    
    @RequestMapping(value = "/usuario",method=RequestMethod.GET, headers = {"Accept=Application/json"})
    public @ResponseBody String obtenerTodos()throws IOException{
    //vamos a usar la implementacion de json para java de fasterxml o codehouse
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(GenerarUsuarios.obtenerUsuario());
    }*/
}
