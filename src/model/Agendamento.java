package model;

import java.time.LocalDateTime;

public class Agendamento {
    private int id;
    private Cliente cliente;
    private Servico servico;
    private LocalDateTime dataHora;

    public Agendamento(int id, Cliente cliente, Servico servico, LocalDateTime dataHora) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.dataHora = dataHora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
