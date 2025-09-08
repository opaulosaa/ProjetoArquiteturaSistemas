package controller;

import model.Servico;
import java.util.ArrayList;
import java.util.List;

public class ServicoController {
    private final ServicoService servicoService;

    public ServicoController(ServicoService servicoService) {
        this.servicoService = servicoService;
    }

    public void adicionarServico(Servico servico) {
        servicoService.cadastrarServico(servico);
    }

    public void removerServico(Servico servico) {
        servicoService.removerServico(servico);
    }

    public List<Servico> listarServicos() {
        return servicoService.listarServicos();
    }
}

