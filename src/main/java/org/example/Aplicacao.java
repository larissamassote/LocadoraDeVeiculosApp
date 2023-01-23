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
        AluguelRepo aluguelRepo = new AluguelRepoImpl();
        //cadastro de clientes
        Cliente clienteJuridico = new ClienteJuridico("Terra Viva");
        Cliente clienteFisico = new ClienteFisico("Larissa");

        //cadastro de veículos
        Veiculo suv = new VeiculoGrande();
        Veiculo veiculoMedio = new VeiculoMedio();
        Veiculo veiculoPequeno = new VeiculoPequeno();

        //Alugueis frota empresarial - cliente 1
        Aluguel aluguel1 = new Aluguel(suv, clienteJuridico, 6);
        Aluguel aluguel2 = new Aluguel(veiculoMedio, clienteJuridico, 4);
        aluguelRepo.AddAluguel(aluguel1);
        aluguelRepo.AddAluguel(aluguel2);

        //Alugueis cliente particular
        Aluguel aluguel3 = new Aluguel(veiculoMedio, clienteFisico, 10);
        Aluguel aluguel4 = new Aluguel(veiculoPequeno, clienteFisico, 10);
        aluguelRepo.AddAluguel(aluguel3);
        aluguelRepo.AddAluguel(aluguel4);

        System.out.printf("total: R$%.2f\n", aluguelRepo.ValorPorCliente(clienteJuridico));
        System.out.printf("total: R$%.2f\n", aluguelRepo.ValorPorCliente(clienteFisico));
    }
}
