package service;

import model.Pagamento;
import java.util.*;

public class PagamentoService {
    private final Repository<Pagamento> pagamentoRepository;

    public PagamentoService(Repository<Pagamento> pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    public void registrarPagamento(Pagamento pagamento) {
        pagamentoRepository.save(pagamento);
    }

    public void cancelarPagamento(Pagamento pagamento) {
        pagamentoRepository.delete(pagamento);
    }

    public List<Pagamento> listarPagamentos() {
        return pagamentoRepository.findAll();
    }

    public Optional<Pagamento> buscarPorId(int id) {
        return pagamentoRepository.findById(id);
    }
}
