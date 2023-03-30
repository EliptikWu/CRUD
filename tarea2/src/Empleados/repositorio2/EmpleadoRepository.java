package Empleados.repositorio2;

import Empleados.modelo2.Empleado;

import java.util.List;

public interface EmpleadoRepository {
    Empleado findById(int id);
    List<Empleado> findAll();
    void save(Empleado empleado);
    void update(Empleado empleado);
    void delete(Empleado empleado);
}