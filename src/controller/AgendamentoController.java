package controller;

import model.Agendamento;
import java.util.ArrayList;
import java.util.List;

public class AgendamentoController {
    private List<Agendamento> agendamentos = new ArrayList<>();

    public void adicionarAgendamento(Agendamento agendamento) {
        agendamentos.add(agendamento);
    }

    public void removerAgendamento(Agendamento agendamento) {
        agendamentos.remove(agendamento);
    }

    public List<Agendamento> listarAgendamentos() {
        return new ArrayList<>(agendamentos);
    }
}
