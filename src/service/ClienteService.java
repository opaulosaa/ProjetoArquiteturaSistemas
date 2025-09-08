package service;

import model.Cliente;
import java.util.*;

public class ClienteService {
    private final Repository<Cliente> clienteRepository;

    public ClienteService(Repository<Cliente> clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public void cadastrarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clienteRepository.delete(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarPorId(int id) {
        return clienteRepository.findById(id);
    }
}
