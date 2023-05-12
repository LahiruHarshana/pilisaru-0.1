package pilisaru.custom;

public interface Crud {
    boolean save(Object o);
    boolean update(Object o);
    boolean delete(Object o);
    void getAll();
}
