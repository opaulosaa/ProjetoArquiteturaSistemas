package service;

import model.Agendamento;
import java.util.*;

public class AgendamentoService {
    private final Repository<Agendamento> agendamentoRepository;

    public AgendamentoService(Repository<Agendamento> agendamentoRepository) {
        this.agendamentoRepository = agendamentoRepository;
    }

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
