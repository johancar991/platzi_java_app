package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    List<Producto> findByCategoriaOrderByNombreAsc(int categoria);

    Optional<List<Producto>> findByIdCAndCantidadStockThanAndEstado(int cantidadStock, boolean estado);

}
