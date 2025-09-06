package service;

import model.Servico;
import repository.ServicoRepository;
import java.util.List;
import java.util.Optional;

public class ServicoService {
    private ServicoRepository servicoRepository = new ServicoRepository();

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
