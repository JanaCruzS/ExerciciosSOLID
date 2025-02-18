package Ex3;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    //cria uma lista de produtos
    private List<Produto> produtos = new ArrayList<>();

    // metodo para adicionar produto
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    //metodo para listar produtos disponiveis
   public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - Preço: R$ " + produto.getPreco() +
                    " - Pode ser devolvido? " + (produto.podeSerDevolvido() ? "Sim" : "Não"));
        }

   }

}
