package repository;

import model.Barbeiro;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BarbeiroRepository {
    private List<Barbeiro> barbeiros = new ArrayList<>();

    public void save(Barbeiro barbeiro) {
        barbeiros.add(barbeiro);
    }

    public void delete(Barbeiro barbeiro) {
        barbeiros.remove(barbeiro);
    }

    public List<Barbeiro> findAll() {
        return new ArrayList<>(barbeiros);
    }

    public Optional<Barbeiro> findById(int id) {
        return barbeiros.stream().filter(b -> b.getId() == id).findFirst();
    }
}
