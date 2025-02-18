package Ex3;

public class Eletronico extends Produto implements devolucao{
    private int diasDeGarantia;

//construtor
    public Eletronico(String nome, double preco, int diasDeGarantia) {
        super(nome, preco);
        this.diasDeGarantia = 0;
    }

    // metodo implementado pela interface
    @Override
    public boolean podeSerDevolvido() {
        return diasDeGarantia > 0;
    }
}
