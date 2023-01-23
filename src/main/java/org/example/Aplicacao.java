package org.example;

import org.example.Clientes.ClienteFisico;
import org.example.Clientes.ClienteJuridico;
import org.example.Interfaces.Cliente;
import org.example.Interfaces.Veiculo;
import org.example.Veiculos.VeiculoGrande;
import org.example.Veiculos.VeiculoMedio;
import org.example.Veiculos.VeiculoPequeno;

public class Aplicacao
{
    public static void main( String[] args )
    {
        Cliente cliente1 = new ClienteJuridico("Terra Viva");
        Veiculo veiculo1 = new VeiculoPequeno();

        Cliente cliente2 = new ClienteFisico("Larissa");
        Veiculo veiculo2 = new VeiculoMedio();

        Aluguel aluguel1 = new Aluguel(veiculo1, cliente1, 6);

        System.out.println("O Valor do alguel do cliente "+cliente1.getNome()+" é:");
        System.out.println(aluguel1.ValorFinalAluguel());

        Aluguel aluguel2 = new Aluguel(veiculo2, cliente2, 6);

        System.out.println("O Valor do alguel do cliente "+cliente2.getNome()+" é:");
        System.out.println(aluguel2.ValorFinalAluguel());
    }
}
