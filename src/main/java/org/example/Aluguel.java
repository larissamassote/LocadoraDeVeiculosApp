package org.example;

import org.example.Interfaces.Cliente;
import org.example.Interfaces.Veiculo;

public class Aluguel {

    private final Veiculo veiculo;
    private final Cliente cliente;
    private final int dias;

    public Aluguel(Veiculo veiculo, Cliente cliente, int dias){
        this.veiculo = veiculo;
        this.cliente=cliente;
        this.dias=dias;
    }
    public double ValorFinalAluguel(){
        double valorFinal = (veiculo.getValor()*dias);
        if(dias>=cliente.getDiasParaDesconto()){
            valorFinal=valorFinal*cliente.getDesconto();
        }
        return valorFinal;
    }

}

