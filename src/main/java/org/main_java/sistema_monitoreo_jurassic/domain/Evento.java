package org.main_java.sistema_monitoreo_jurassic.domain;

import lombok.*;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Evento {
    private String mensaje;
    private Double valor;
    private OffsetDateTime dateCreated = OffsetDateTime.now();


    public Evento(String mensaje, Double valor) {
        this.mensaje = mensaje;
        this.valor = valor;
        this.dateCreated = OffsetDateTime.now();
    }
}

