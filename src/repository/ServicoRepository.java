package repository;

import model.Servico;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ServicoRepository {
    private List<Servico> servicos = new ArrayList<>();

    public void save(Servico servico) {
        servicos.add(servico);
    }

    public void delete(Servico servico) {
        servicos.remove(servico);
    }

    public List<Servico> findAll() {
        return new ArrayList<>(servicos);
    }

    public Optional<Servico> findById(int id) {
        return servicos.stream().filter(s -> s.getId() == id).findFirst();
    }
}
