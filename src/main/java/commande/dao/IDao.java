package commande.dao;

import java.util.List;

public interface IDao< T , S>{
    boolean save(T t);
    boolean delete(T t);
    boolean update(T t);
    T findById(S s);
    List<T> findAll();
}
