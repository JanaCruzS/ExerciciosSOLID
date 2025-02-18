package Ex2;

public class ContaPoupanca implements ContaBancaria {
    //atributos
    private double saldo;

    //construtor
    public ContaPoupanca(double saldoInicial) {
        this.saldo = saldoInicial;
    }

//metodo implementado da interface
    @Override
    public void sacar(double valor) {

    }

    @Override
    public double getSaldo() {
        return 0;
    }
}


