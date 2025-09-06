package controller;

import model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    private List<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public List<Cliente> listarClientes() {
        return new ArrayList<>(clientes);
    }
}
