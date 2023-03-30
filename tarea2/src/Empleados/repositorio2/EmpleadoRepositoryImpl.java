package Empleados.repositorio2;

import  Empleados.modelo2.Empleado;

import javax.swing.plaf.LabelUI;
import java.util.ArrayList;
import java.util.List;
public class EmpleadoRepositoryImpl implements EmpleadoRepository {
    private List<Empleado> empleados;
    public  EmpleadoRepositoryImpl(){
        empleados = new ArrayList<>();
    }

    @Override
    public Empleado findById(int id){
        return empleados.stream()
                .filter(local -> local.getId() == id)
                .findFirst()
                .orElse(null);
    }
    @Override
    public List<Empleado> findAll(){
        return empleados;
    }

    @Override
    public void save(Empleado empleado){
        empleados.add(empleado);
    }

    @Override
    public  void update(Empleado empleado){
        Empleado oldEmpleado = findById(empleado.getId());
        if (oldEmpleado != null){
            empleados.remove(oldEmpleado);
            empleados.add(empleado);
        }
    }
    @Override
    public void delete(Empleado empleado) {empleados.remove(empleado);}
}
