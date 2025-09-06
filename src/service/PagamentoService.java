package service;

import model.Pagamento;
import repository.PagamentoRepository;
import java.util.List;
import java.util.Optional;

public class PagamentoService {
    private PagamentoRepository pagamentoRepository = new PagamentoRepository();

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
