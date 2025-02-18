package Ex3;

import java.time.LocalDate;

public class Alimento extends Produto implements devolucao {

    //atributo proprio
private LocalDate validade;


    //construtor
    public Alimento(String nome, double preco, LocalDate validade) {
        super(nome, preco);
        this.validade = validade;
    }



// metodo devolucao implementado
    @Override
    public boolean podeSerDevolvido() {
        return false;
    }
}
