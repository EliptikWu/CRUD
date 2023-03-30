package VehicleTaller.repositorio1;

import VehicleTaller.modelo1.Taller;

import  java.util.List;
public interface TallerRepository {
    Taller findByPla(int pla);
    List<Taller> findAll();
    void save(Taller taller);
    void update(Taller taller);
    void delete(Taller taller);
}
