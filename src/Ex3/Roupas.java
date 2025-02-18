package Ex3;

public class Roupas extends Produto implements devolucao{
    private String tamanho;
    private String cor;
    private boolean usada;

//construtor
    public Roupas(String nome, double preco, String tamanho, String cor, boolean usada) {
        super(nome, preco);
        this.tamanho = tamanho;
        this.cor = cor;
        this.usada = usada;
    }

    //metodod implementado pela interface
    @Override
    public boolean podeSerDevolvido() {
        if(usada == true){
            System.out.println("A roupa não pode ser devolvida");
            return false;
        }else {
            System.out.println("Roupa pode ser devolvida");
            return true;
        }
    }
}
