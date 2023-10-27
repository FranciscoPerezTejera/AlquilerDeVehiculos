
package actividad_1_1_c.ClasesEInterfaces;

import java.util.ArrayList;

public class Listar {
    
    public Listar() {
    
    }
    
    public String mostrar(ArrayList <Vehiculo> lista) {
    
        String mostrarTotales = "###### RESUMEN ######";
         
        return "###### RESUMEN ######\n--> Total de turismos: " 
                + lista.stream().filter(turismo -> turismo instanceof Turismo).count()
                + "\n--> Total de turismos alquilados: " 
                + lista.stream().filter(turismo -> turismo instanceof Turismo && turismo.isAlquilado()).count()
                + "\n--> Total de camiones: " 
                + lista.stream().filter(camion -> camion instanceof Camion).count()
                + "\n--> Total de camiones alquilados: "
                + lista.stream().filter(camion -> camion instanceof Camion && camion.isAlquilado()).count() + "\n";
    }
    
}
