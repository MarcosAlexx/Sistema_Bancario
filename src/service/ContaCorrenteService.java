package service;

import model.ContaCorrente;

public class ContaCorrenteService extends ContaService {

    public void verificarLimite(ContaCorrente conta) {
        double limiteDisponivel = conta.getSaldo() + conta.getLimite();
        System.out.println("Limite disponível: R$ " + limiteDisponivel);
    }

}