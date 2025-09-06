package service;

import model.Agendamento;
import repository.AgendamentoRepository;
import java.util.List;
import java.util.Optional;

public class AgendamentoService {
    private AgendamentoRepository agendamentoRepository = new AgendamentoRepository();

    public void agendar(Agendamento agendamento) {
        agendamentoRepository.save(agendamento);
    }

    public void cancelarAgendamento(Agendamento agendamento) {
        agendamentoRepository.delete(agendamento);
    }

    public List<Agendamento> listarAgendamentos() {
        return agendamentoRepository.findAll();
    }

    public Optional<Agendamento> buscarPorId(int id) {
        return agendamentoRepository.findById(id);
    }
}
