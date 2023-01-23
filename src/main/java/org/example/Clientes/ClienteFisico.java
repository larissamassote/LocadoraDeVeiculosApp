package org.example.Clientes;

import org.example.Interfaces.Cliente;


public class ClienteFisico implements Cliente {
    private final double descontoTaxa;
    private final int diasParaDesconto;
    private String nome;
    private final String tipoDeCliente="Pessoa Física";

    public ClienteFisico(String nome) {
        this.nome = nome;
        this.descontoTaxa = 1 - 0.05;
        this.diasParaDesconto = 5;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipoDeCliente() {
        return tipoDeCliente;
    }

    @Override
    public double getDesconto() {
        return descontoTaxa;
    }

    @Override
    public int getDiasParaDesconto() {
        return diasParaDesconto;
    }


}
