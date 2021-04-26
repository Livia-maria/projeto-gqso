package projetogqso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TesteC {
     Conta conta;

     @BeforeEach
     public void setUp() {
         conta = new Conta();
       
     }

     @Test
     public void DepositoTeste()
    {
        assertEquals(100, conta.deposito(130));
    }
     
    
}
