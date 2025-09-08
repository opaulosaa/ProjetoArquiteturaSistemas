package repository;

import model.Agendamento;
import java.util.*;

public class AgendamentoRepository implements Repository<Agendamento> {
    private List<Agendamento> agendamentos = new ArrayList<>();

    @Override
    public void save(Agendamento agendamento) {
        agendamentos.add(agendamento);
    }

    @Override
    public void delete(Agendamento agendamento) {
        agendamentos.remove(agendamento);
    }

    @Override
    public List<Agendamento> findAll() {
        return new ArrayList<>(agendamentos);
    }

    @Override
    public Optional<Agendamento> findById(int id) {
        return agendamentos.stream().filter(a -> a.getId() == id).findFirst();
    }
}
