package service;

import model.Servico;
import java.util.*;

public class ServicoService {
    private final Repository<Servico> servicoRepository;

    public ServicoService(Repository<Servico> servicoRepository) {
        this.servicoRepository = servicoRepository;
    }

    public void cadastrarServico(Servico servico) {
        servicoRepository.save(servico);
    }

    public void removerServico(Servico servico) {
        servicoRepository.delete(servico);
    }

    public List<Servico> listarServicos() {
        return servicoRepository.findAll();
    }

    public Optional<Servico> buscarPorId(int id) {
        return servicoRepository.findById(id);
    }
}
