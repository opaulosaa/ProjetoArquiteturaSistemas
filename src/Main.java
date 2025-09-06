

import model.*;
import service.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Instanciando services
        ClienteService clienteService = new ClienteService();
        BarbeiroService barbeiroService = new BarbeiroService();
        ServicoService servicoService = new ServicoService();
        AgendamentoService agendamentoService = new AgendamentoService();
        PagamentoService pagamentoService = new PagamentoService();

        // Criando e cadastrando um cliente
        Cliente cliente = new Cliente(1, "João", "11999999999", "joao@email.com");
        clienteService.cadastrarCliente(cliente);

        // Criando e cadastrando um barbeiro
        Barbeiro barbeiro = new Barbeiro(1, "Carlos", "Corte Masculino");
        barbeiroService.cadastrarBarbeiro(barbeiro);

        // Criando e cadastrando um serviço
        Servico servico = new Servico(1, "Corte de Cabelo", 50.0);
        servicoService.cadastrarServico(servico);

        // Criando e cadastrando um agendamento
        Agendamento agendamento = new Agendamento(1, cliente, servico, LocalDateTime.now());
        agendamentoService.agendar(agendamento);

        // Criando e registrando um pagamento
        Pagamento pagamento = new Pagamento(1, 50.0, LocalDateTime.now(), "Dinheiro");
        pagamentoService.registrarPagamento(pagamento);

        // Exibindo dados cadastrados
        System.out.println("Clientes cadastrados: " + clienteService.listarClientes().size());
        System.out.println("Barbeiros cadastrados: " + barbeiroService.listarBarbeiros().size());
        System.out.println("Serviços cadastrados: " + servicoService.listarServicos().size());
        System.out.println("Agendamentos cadastrados: " + agendamentoService.listarAgendamentos().size());
        System.out.println("Pagamentos registrados: " + pagamentoService.listarPagamentos().size());
    }
}
