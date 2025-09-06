package model;

import java.time.LocalDateTime;

public class Pagamento {
    private int id;
    private double valor;
    private LocalDateTime dataHora;
    private String metodo;

    public Pagamento(int id, double valor, LocalDateTime dataHora, String metodo) {
        this.id = id;
        this.valor = valor;
        this.dataHora = dataHora;
        this.metodo = metodo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }
}
