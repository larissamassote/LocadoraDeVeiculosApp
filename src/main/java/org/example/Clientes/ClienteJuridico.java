package org.example.Clientes;

import org.example.Interfaces.Cliente;
public class ClienteJuridico implements Cliente {

    private String nome;

    private final String tipoDeCliente="Pessoa Juridica";
    private double descontoTaxa;
    private int diasParaDesconto;

    public ClienteJuridico(String nome){
        this.nome = nome;
        this.descontoTaxa = 1-0.10;
        this.diasParaDesconto = 3;

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
