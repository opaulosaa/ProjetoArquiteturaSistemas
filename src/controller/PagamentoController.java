package controller;

import model.Pagamento;
import java.util.ArrayList;
import java.util.List;

public class PagamentoController {
    private List<Pagamento> pagamentos = new ArrayList<>();

    public void adicionarPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public void removerPagamento(Pagamento pagamento) {
        pagamentos.remove(pagamento);
    }

    public List<Pagamento> listarPagamentos() {
        return new ArrayList<>(pagamentos);
    }
}
