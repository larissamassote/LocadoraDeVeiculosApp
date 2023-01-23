package org.example;

import org.example.Interfaces.Cliente;
import org.example.Interfaces.Veiculo;

public interface AluguelRepo {

    double ValorPorCliente(Cliente cliente);
    void AddAluguel(Aluguel aluguel);
}
