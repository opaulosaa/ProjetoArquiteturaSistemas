package repository;

import model.Barbeiro;
import java.util.*;

public class BarbeiroRepository implements Repository<Barbeiro> {
    private List<Barbeiro> barbeiros = new ArrayList<>();

    @Override
    public void save(Barbeiro barbeiro) {
        barbeiros.add(barbeiro);
    }

    @Override
    public void delete(Barbeiro barbeiro) {
        barbeiros.remove(barbeiro);
    }

    @Override
    public List<Barbeiro> findAll() {
        return new ArrayList<>(barbeiros);
    }

    @Override
    public Optional<Barbeiro> findById(int id) {
        return barbeiros.stream().filter(b -> b.getId() == id).findFirst();
    }
}
