package org.main_java.sistema_monitoreo_jurassic.model.islasDTO;

import lombok.*;
import org.main_java.sistema_monitoreo_jurassic.domain.dinosaurios.Dinosaurio;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class EnfermeriaDTO extends IslaDTO {

    public EnfermeriaDTO(String id, String nombre, int capacidadMaxima, int tamanioTablero, int[][] tablero, List<Dinosaurio> dinosaurios) {
        super(id, nombre, capacidadMaxima, tamanioTablero, tablero, dinosaurios);
    }
}
