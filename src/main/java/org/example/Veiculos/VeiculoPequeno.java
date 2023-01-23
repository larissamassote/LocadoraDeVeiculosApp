package org.example.Veiculos;

import org.example.Interfaces.Veiculo;

import java.time.LocalDateTime;

public class VeiculoPequeno implements Veiculo {
    private final String tipo = "Pequeno";
    private final double valor = 100;
    private final LocalDateTime data = LocalDateTime.now();

    public VeiculoPequeno(){
        System.out.println("Veiculo pequeno cadastrado");
    }

    public double getValor(){
        return valor;
    }
}
