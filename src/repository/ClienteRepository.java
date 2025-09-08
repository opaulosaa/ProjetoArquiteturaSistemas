package repository;

import model.Cliente;
import java.util.*;

public class ClienteRepository implements Repository<Cliente> {
    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public void save(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void delete(Cliente cliente) {
        clientes.remove(cliente);
    }

    @Override
    public List<Cliente> findAll() {
        return new ArrayList<>(clientes);
    }

    @Override
    public Optional<Cliente> findById(int id) {
        return clientes.stream().filter(c -> c.getId() == id).findFirst();
    }
}
