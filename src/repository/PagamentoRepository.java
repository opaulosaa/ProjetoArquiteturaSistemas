package repository;

import model.Pagamento;
import java.util.*;

public class PagamentoRepository implements Repository<Pagamento> {
    private List<Pagamento> pagamentos = new ArrayList<>();

    @Override
    public void save(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    @Override
    public void delete(Pagamento pagamento) {
        pagamentos.remove(pagamento);
    }

    @Override
    public List<Pagamento> findAll() {
        return new ArrayList<>(pagamentos);
    }

    @Override
    public Optional<Pagamento> findById(int id) {
        return pagamentos.stream().filter(p -> p.getId() == id).findFirst();
    }
}
