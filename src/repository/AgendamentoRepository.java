package repository;

import model.Agendamento;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AgendamentoRepository {
    private List<Agendamento> agendamentos = new ArrayList<>();

    public void save(Agendamento agendamento) {
        agendamentos.add(agendamento);
    }

    public void delete(Agendamento agendamento) {
        agendamentos.remove(agendamento);
    }

    public List<Agendamento> findAll() {
        return new ArrayList<>(agendamentos);
    }

    public Optional<Agendamento> findById(int id) {
        return agendamentos.stream().filter(a -> a.getId() == id).findFirst();
    }
}
