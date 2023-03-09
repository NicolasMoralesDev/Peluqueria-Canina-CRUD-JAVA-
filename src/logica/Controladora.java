
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author Nicolas Morales
 */
public class Controladora {
    
    ControladoraPersistencia controlPersist = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, String observaciones, String nombreDuenio, String celDuenio, String alergico, String atenEsp) {

      Duenio duenio = new Duenio();
      
      duenio.setNombre(nombreDuenio);
      duenio.setCelDuenio(celDuenio);
      
      Mascota masco = new Mascota();
      
      masco.setAlergico(alergico);
      masco.setAtencion_especial(atenEsp);
      masco.setNombre(nombreMasco);
      masco.setRaza(raza);
      masco.setObservaciones(observaciones);
      masco.setUnDuenio(duenio);
      
      controlPersist.guardar(masco, duenio);
      
    }

    public List<Mascota> traerMascotas() {
        
        return controlPersist.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersist.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
       return controlPersist.traerMascota(num_cliente);
    }

    public void modificarMascota(String nombreMasco, String raza, String color, String observaciones, String nombreDuenio, String celDuenio, String alergico, String atenEsp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
