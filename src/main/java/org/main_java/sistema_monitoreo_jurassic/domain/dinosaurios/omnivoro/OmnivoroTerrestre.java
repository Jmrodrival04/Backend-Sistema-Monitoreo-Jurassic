package org.main_java.sistema_monitoreo_jurassic.domain.dinosaurios.omnivoro;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class OmnivoroTerrestre extends Omnivoro {

    @Override
    public void buscarComida() {
        System.out.println("El omnívoro terrestre está buscando comida.");
    }

    @Override
    public boolean estaEnfermo() {
        return false;
    }

}