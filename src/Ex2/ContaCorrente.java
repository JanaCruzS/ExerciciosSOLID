package Ex2;
public class ContaCorrente implements ContaBancaria{
    //atributo
    protected double saldo;

    //construtor
    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    //metodos
    public void sacar(double valor) {
        saldo -= valor;
    }

    //metodo implementado da interface
    @Override
    public double getSaldo() {
        return 0;
    }
}
