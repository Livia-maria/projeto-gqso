package projetogqso;

public class Conta {
    private double saldo =0;



    public double deposito(double valor) {
        
        setSaldo(getSaldo() + valor);

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
