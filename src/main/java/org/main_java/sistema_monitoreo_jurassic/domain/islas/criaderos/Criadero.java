package org.main_java.sistema_monitoreo_jurassic.domain.islas.criaderos;

import lombok.*;
import org.main_java.sistema_monitoreo_jurassic.domain.dinosaurios.Dinosaurio;
import org.main_java.sistema_monitoreo_jurassic.domain.islas.Isla;

import java.util.ArrayList;

@Data
@Getter
@Setter
@NoArgsConstructor
public abstract class Criadero extends Isla {

    private boolean permiteMenores;

    public Criadero(String id, String nombre, int capacidadMaxima) {
        super(id, nombre, capacidadMaxima, new ArrayList<>());
    }

    public void criarDinosauriosMenores() {
        permiteMenores = true;
        System.out.println("Criando dinosaurios menores en el criadero " + getNombre());
    }

    @Override
    public abstract void configurarEntorno();
}
