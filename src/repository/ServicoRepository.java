package repository;

import model.Servico;
import java.util.*;

public class ServicoRepository implements Repository<Servico> {
    private List<Servico> servicos = new ArrayList<>();

    @Override
    public void save(Servico servico) {
        servicos.add(servico);
    }

    @Override
    public void delete(Servico servico) {
        servicos.remove(servico);
    }

    @Override
    public List<Servico> findAll() {
        return new ArrayList<>(servicos);
    }

    @Override
    public Optional<Servico> findById(int id) {
        return servicos.stream().filter(s -> s.getId() == id).findFirst();
    }
}
