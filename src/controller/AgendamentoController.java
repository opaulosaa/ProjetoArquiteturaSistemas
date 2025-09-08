package controller;

import model.Agendamento;
import java.util.ArrayList;
import java.util.List;

public class AgendamentoController {
    private final AgendamentoService agendamentoService;

    public AgendamentoController(AgendamentoService agendamentoService) {
        this.agendamentoService = agendamentoService;
    }

    public void adicionarAgendamento(Agendamento agendamento) {
        agendamentoService.agendar(agendamento);
    }

    public void removerAgendamento(Agendamento agendamento) {
        agendamentoService.cancelarAgendamento(agendamento);
    }

    public List<Agendamento> listarAgendamentos() {
        return agendamentoService.listarAgendamentos();
    }
}
