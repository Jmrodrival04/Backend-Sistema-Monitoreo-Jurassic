package org.main_java.sistema_monitoreo_jurassic.domain.sensores;

import lombok.*;

@Data
@NoArgsConstructor
public class SensorTemperatura extends Sensor {

    public SensorTemperatura(String id, String tipo, double limiteInferior, double limiteSuperior) {
        super(id, tipo, limiteInferior, limiteSuperior);
    }

    public void registrarTemperatura(double temperatura) {
        System.out.println("Temperatura registrada: " + temperatura + " °C");
        if (estaFueraDeRango(temperatura)) {
            generarEventoFueraDeRango(temperatura);
        }
    }
}
