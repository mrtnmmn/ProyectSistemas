package com.herokuSistemasMrtnmmn.ej02.repositories;

import com.herokuSistemasMrtnmmn.ej02.models.DatosModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DatosRepository extends CrudRepository<DatosModel,Long>{
    
}
