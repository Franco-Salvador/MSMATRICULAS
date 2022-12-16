package com.upao.msmatriculas.infraestructure.repositories;

import com.upao.msmatriculas.domain.entities.Mensaje;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MensajeNosqlRepository extends MongoRepository<Mensaje,String> {

    //funciones personalizadas

    @Query("{remitente: '?0'}")
    List<Mensaje> ListarxRemitente(String remitente);

}
