package controller;

import model.Servico;
import java.util.ArrayList;
import java.util.List;

public class ServicoController {
    private List<Servico> servicos = new ArrayList<>();

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public void removerServico(Servico servico) {
        servicos.remove(servico);
    }

    public List<Servico> listarServicos() {
        return new ArrayList<>(servicos);
    }
}
