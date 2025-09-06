package service;

import model.Cliente;
import repository.ClienteRepository;
import java.util.List;
import java.util.Optional;

public class ClienteService {
    private ClienteRepository clienteRepository = new ClienteRepository();

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
