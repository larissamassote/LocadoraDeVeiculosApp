package org.example;

import org.example.Interfaces.Cliente;
import org.example.Interfaces.Veiculo;

import java.util.ArrayList;

public class AluguelRepoImpl implements AluguelRepo{

    private ArrayList<Aluguel> alugueis;

    public AluguelRepoImpl(){
        alugueis = new ArrayList<>();
    }
    @Override
    public double ValorPorCliente(Cliente cliente) {
        double valorPorCliente = 0;
        int i=1;
        System.out.println();
        System.out.println("Cliente: "+cliente.getNome());

        if(alugueis.isEmpty()){
            System.out.println("Não existe nenhum aluguel cadastrado");
        }else{
            for ( Aluguel tempAluguel : alugueis ) {

                if(tempAluguel.getCliente().getNome().equalsIgnoreCase(cliente.getNome())){
                    valorPorCliente= valorPorCliente + tempAluguel.ValorFinalAluguel();
                    System.out.printf("(%d) - R$%.2f\n", i, tempAluguel.ValorFinalAluguel());
                    i++;
                }

            }
        }
        return valorPorCliente;
    }

    @Override
    public void AddAluguel(Aluguel aluguel) {
        this.alugueis.add(aluguel);
    }

}
