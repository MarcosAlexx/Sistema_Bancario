package models;

import java.time.LocalDateTime;

public class Transacao {

    private final TipoTransacao tipo;
    private final double valor;
    private final LocalDateTime dataHora;
    private final double saldoAposOperacao;

    public Transacao(TipoTransacao tipo, double valor, double saldoAposOperacao) {
        this.tipo = tipo;
        this.valor = valor;
        this.saldoAposOperacao = saldoAposOperacao;
        this.dataHora = LocalDateTime.now();
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public double getSaldoAposOperacao() {
        return saldoAposOperacao;
    }
}
