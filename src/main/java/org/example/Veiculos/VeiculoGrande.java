package org.example.Veiculos;

import org.example.Interfaces.Veiculo;

public class VeiculoGrande implements Veiculo {
    private final String tipo = "Grande";
    private final double valor = 200;

    public VeiculoGrande() {
        System.out.println("Veiculo Grande Cadastrado");
    }

    @Override
    public double getValor() {
        return valor;
    }
}
