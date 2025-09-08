package controller;

import model.Pagamento;
import java.util.List;

public class PagamentoController {
    private final PagamentoService pagamentoService;

    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    public void adicionarPagamento(Pagamento pagamento) {
        pagamentoService.registrarPagamento(pagamento);
    }

    public void removerPagamento(Pagamento pagamento) {
        pagamentoService.cancelarPagamento(pagamento);
    }

    public List<Pagamento> listarPagamentos() {
        return pagamentoService.listarPagamentos();
    }
}
