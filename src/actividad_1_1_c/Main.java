package actividad_1_1_c;

import actividad_1_1_c.ClasesEInterfaces.Camion;
import actividad_1_1_c.ClasesEInterfaces.Turismo;
import actividad_1_1_c.ClasesEInterfaces.Vehiculo;
import actividad_1_1_c.Interfaces.AlquilerDeVehiculos;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList <Vehiculo> nuevosVehiculos = new ArrayList<>();
        List <String> matriculasTurismos = List.of("E-3454-FGR","E-3454-FGT","GC-7777-CRH","TF-2321-A","E-8976-HVK");
        List <String> matriculasCamiones = List.of("E-3333-GYG","TF-3455-FGH","GC-9898-JKT","E-4321-KLM","TF-4567-HJK");
        
        matriculasTurismos.forEach(turismos -> nuevosVehiculos.add(new Turismo(turismos, false)));
        matriculasCamiones.forEach(camiones -> nuevosVehiculos.add(new Camion(camiones, false)));

        AlquilerDeVehiculos nuevoAlquilerDeVehiculos = new AlquilerDeVehiculos(nuevosVehiculos);
        nuevoAlquilerDeVehiculos.setVisible(true);

    }

}
