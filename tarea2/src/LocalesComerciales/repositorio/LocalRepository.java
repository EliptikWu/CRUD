package LocalesComerciales.repositorio;

import LocalesComerciales.modelo.Local;

import java.util.List;

public interface LocalRepository {
        Local findById(int id);
        List<Local> findAll();
        void save(Local local);
        void update(Local local);
        void delete(Local local);
}

