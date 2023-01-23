package org.example.Veiculos;

import org.example.Interfaces.Veiculo;

import java.time.LocalDateTime;

public class VeiculoMedio implements Veiculo {

    private final String tipo = "Médio";
    private final double valor = 150;
    private final LocalDateTime data = LocalDateTime.now();

    public VeiculoMedio() {

        System.out.println("Veiculo Médio Cadastrado");
    }

    @Override
    public double getValor() {
        return valor;
    }
}

