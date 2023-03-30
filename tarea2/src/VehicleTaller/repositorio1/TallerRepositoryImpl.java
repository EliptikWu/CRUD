package VehicleTaller.repositorio1;

import VehicleTaller.modelo1.Taller;

import java.util.ArrayList;
import java.util.List;
public class TallerRepositoryImpl implements TallerRepository {

    private  List<Taller> talleres;
    public TallerRepositoryImpl() { talleres = new ArrayList<>();}

    @Override
    public Taller findByPla(int pla) {
        return talleres.stream()
                .filter(taller -> taller.getPla() == pla)
                .findFirst()
                .orElse( null);
    }

    @Override
    public  List<Taller> findAll() {return talleres;}

    @Override
    public void save (Taller taller) {talleres.add(taller);}

    @Override
    public void update(Taller taller) {
        Taller oldTaller = findByPla(taller.getPla());
        if (oldTaller != null){
            talleres.remove(oldTaller);
            talleres.add(taller);
        }
    }
    @Override
    public void delete(Taller taller) { talleres.remove(taller); }
}
