package repository;

import model.Pagamento;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PagamentoRepository {
    private List<Pagamento> pagamentos = new ArrayList<>();

    public void save(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public void delete(Pagamento pagamento) {
        pagamentos.remove(pagamento);
    }

    public List<Pagamento> findAll() {
        return new ArrayList<>(pagamentos);
    }

    public Optional<Pagamento> findById(int id) {
        return pagamentos.stream().filter(p -> p.getId() == id).findFirst();
    }
}
