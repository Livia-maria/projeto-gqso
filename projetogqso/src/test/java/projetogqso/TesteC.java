package projetogqso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import projetogqso.Conta.SaldoInsuficiente;

public class TesteC {
     Conta conta;

     @BeforeEach
     public void setUp() {
         conta = new Conta();
         conta.deposito(130);
     }

     @Test
     public void DepositoTeste()
    {
        assertEquals(conta.getSaldo()+130, conta.deposito(130));
    }

    @Test
    public void SaqueTeste() throws SaldoInsuficiente {
        assertEquals(conta.getSaldo() -30, conta.saque(30));
        assertThrows(Conta.SaldoInsuficiente.class, () -> conta.saque(150));
    }
     
    
}
