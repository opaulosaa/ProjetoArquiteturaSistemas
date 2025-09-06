package repository;

import model.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClienteRepository {
    private List<Cliente> clientes = new ArrayList<>();

    public void save(Cliente cliente) {
        clientes.add(cliente);
    }

    public void delete(Cliente cliente) {
        clientes.remove(cliente);
    }

    public List<Cliente> findAll() {
        return new ArrayList<>(clientes);
    }

    public Optional<Cliente> findById(int id) {
        return clientes.stream().filter(c -> c.getId() == id).findFirst();
    }
}
