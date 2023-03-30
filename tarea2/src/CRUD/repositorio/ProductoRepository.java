package CRUD.repositorio;

import CRUD.modelo.Producto;

import java.util.List;

public interface ProductoRepository {
    Producto findById(int id);
    List<Producto> findAll();
    void save(Producto producto);
    void update(Producto producto);
    void delete(Producto producto);
}