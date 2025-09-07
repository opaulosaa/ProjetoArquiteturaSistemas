import model.*;
import service.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ClienteService clienteService = new ClienteService();
        BarbeiroService barbeiroService = new BarbeiroService();
        ServicoService servicoService = new ServicoService();
        AgendamentoService agendamentoService = new AgendamentoService();
        PagamentoService pagamentoService = new PagamentoService();

        int opcao;
        do {
            System.out.println("\n===== SISTEMA BARBEARIA =====");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Barbeiro");
            System.out.println("3 - Cadastrar Serviço");
            System.out.println("4 - Listar Clientes");
            System.out.println("5 - Listar Barbeiros");
            System.out.println("6 - Listar Serviços");
            System.out.println("7 - Agendar Serviço");
            System.out.println("8 - Listar Agendamentos");
            System.out.println("9 - Registrar Pagamento");
            System.out.println("10 - Listar Pagamentos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("ID do Cliente: ");
                    int idCliente = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nomeCliente = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    clienteService.cadastrarCliente(new Cliente(idCliente, nomeCliente, telefone, email));
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("ID do Barbeiro: ");
                    int idBarbeiro = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nomeBarbeiro = scanner.nextLine();
                    System.out.print("Especialidade: ");
                    String especialidade = scanner.nextLine();
                    barbeiroService.cadastrarBarbeiro(new Barbeiro(idBarbeiro, nomeBarbeiro, especialidade));
                    System.out.println("Barbeiro cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.print("ID do Serviço: ");
                    int idServico = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nomeServico = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    servicoService.cadastrarServico(new Servico(idServico, nomeServico, preco));
                    System.out.println("Serviço cadastrado com sucesso!");
                    break;

                case 4:
                    System.out.println("=== Clientes ===");
                    clienteService.listarClientes().forEach(
                            c -> System.out.println(c.getId() + " - " + c.getNome() + " (" + c.getEmail() + ")"));
                    break;

                case 5:
                    System.out.println("=== Barbeiros ===");
                    barbeiroService.listarBarbeiros().forEach(b -> System.out
                            .println(b.getId() + " - " + b.getNome() + " [" + b.getEspecialidade() + "]"));
                    break;

                case 6:
                    System.out.println("=== Serviços ===");
                    servicoService.listarServicos()
                            .forEach(s -> System.out.println(s.getId() + " - " + s.getNome() + " R$" + s.getPreco()));
                    break;

                case 7:
                    System.out.print("ID do Agendamento: ");
                    int idAgendamento = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("ID do Cliente: ");
                    int cliId = scanner.nextInt();
                    System.out.print("ID do Serviço: ");
                    int servId = scanner.nextInt();
                    scanner.nextLine();

                    Cliente cli = clienteService.buscarPorId(cliId).orElse(null);
                    Servico serv = servicoService.buscarPorId(servId).orElse(null);

                    if (cli != null && serv != null) {
                        Agendamento agendamento = new Agendamento(idAgendamento, cli, serv, LocalDateTime.now());
                        agendamentoService.agendar(agendamento);
                        System.out.println("Agendamento realizado com sucesso!");
                    } else {
                        System.out.println("Cliente ou Serviço não encontrado!");
                    }
                    break;

                case 8:
                    System.out.println("=== Agendamentos ===");
                    agendamentoService.listarAgendamentos()
                            .forEach(a -> System.out.println(a.getId() + " - Cliente: " + a.getCliente().getNome()
                                    + " - Serviço: " + a.getServico().getNome()
                                    + " - Data: " + a.getDataHora()));
                    break;

                case 9:
                    System.out.print("ID do Pagamento: ");
                    int idPagamento = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Valor: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Método de Pagamento: ");
                    String metodo = scanner.nextLine();

                    Pagamento pagamento = new Pagamento(idPagamento, valor, LocalDateTime.now(), metodo);
                    pagamentoService.registrarPagamento(pagamento);
                    System.out.println("Pagamento registrado com sucesso!");
                    break;

                case 10:
                    System.out.println("=== Pagamentos ===");
                    pagamentoService.listarPagamentos()
                            .forEach(p -> System.out.println(p.getId() + " - R$" + p.getValor()
                                    + " [" + p.getMetodo() + "] - " + p.getDataHora()));
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
