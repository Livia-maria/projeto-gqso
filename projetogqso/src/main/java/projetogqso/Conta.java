package projetogqso;

public class Conta {
    private double saldo =0;


    public class SaldoInsuficiente extends Exception{
        private static final long serialVersionUID = 1L;
    }

    
    public double saldo()
{
    return this.saldo;
}

    public double deposito(double valor) {
        
        setSaldo(saldo() + valor);

        return saldo();
    }

    

    public double saque(double valor) throws SaldoInsuficiente {
        
        if(saldo() < valor) {
            throw new SaldoInsuficiente();
        }

        setSaldo(saldo() - valor);

        return saldo();
    }



public void setSaldo(double valor)
{
    this.saldo=valor;
}
    
}
