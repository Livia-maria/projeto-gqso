package projetogqso;

public class Conta {
    private double saldo =0;


    public class SaldoInsuficiente extends Exception{
        private static final long serialVersionUID = 1L;
    }

    public double deposito(double valor) {
        
        setSaldo(getSaldo() + valor);

        return getSaldo();
    }

    

    public double saque(double valor) throws SaldoInsuficiente {
        
        if(getSaldo() < valor) {
            throw new SaldoInsuficiente();
        }

        setSaldo(getSaldo() - valor);

        return getSaldo();
    }

public double getSaldo()
{
    return this.saldo;
}

public void setSaldo(double valor)
{
    this.saldo=valor;
}
    
}
