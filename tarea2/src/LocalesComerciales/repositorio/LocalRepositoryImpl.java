package LocalesComerciales.repositorio;

import LocalesComerciales.modelo.Local;

import java.util.ArrayList;
import java.util.List;
public class LocalRepositoryImpl implements LocalRepository{
    private List<Local> locales;

    public LocalRepositoryImpl() {
        locales = new ArrayList<>();
    }
    @Override
    public Local findById(int id) {
        return locales.stream()
                .filter(local -> local.getId() == id)
                .findFirst()
                .orElse(null);
    }
    @Override
    public List<Local> findAll() {
        return locales;
    }

    @Override
    public void save(Local local) {
        locales.add(local);
    }

    @Override
    public void update(Local local) {
        Local oldLocal = findById(local.getId());
        if (oldLocal != null) {
            locales.remove(oldLocal);
            locales.add(local);
        }
    }

    @Override
    public void delete(Local local) {
        locales.remove(local);
    }
}