package com.upao.msmatriculas.domain.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mensajes")
@Getter
@Setter
public class Mensaje {

    private String remitente;
    private String destinatario;
    private String asunto;
    private String fecha;
    private String contenido;

}
