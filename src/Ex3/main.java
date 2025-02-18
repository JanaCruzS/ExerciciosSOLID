package Ex3;

import java.time.LocalDate;

// Exercício 3: Gestão de Estoque de Produtos com Categorias
//Variadas
// Uma loja possui um estoque de produtos que inclui eletrônicos,
//roupas e alimentos. Cada categoria tem suas próprias regras:
// ● Eletrônicos: Devem ter uma garantia de fábrica e podem ser
//devolvidos em até 30 dias.
// ● Roupas: Possuem tamanhos e cores diferentes e só podem ser
//devolvidas se não forem usadas.
// ● Alimentos: Possuem uma data de validade e não podem ser
//devolvidos após a compra.
// O sistema deve ser capaz de armazenar diferentes tipos de
//produtos, garantindo que novos tipos possam ser adicionados no
//futuro sem modificar a estrutura do código existente.
// Desafio:
// Crie um gerenciador de estoque que possa lidar com múltiplas
//categorias de produtos, respeitando suas regras específicas e
//permitindo a adição de novas categorias sem impactar as já
//existentes.
public class main {
    public static void main(String[] args) {

 // cria um estoque

 Estoque estoque = new Estoque();

 // criando produtos
        Eletronico ipad = new Eletronico("Ipad mini ",2500.00,30);
        Roupas bermuda = new Roupas("bermuda", 90.00,"M","preta",false);
        Alimento pao = new Alimento("pao", 7.89, LocalDate.of(2024, 3, 1));

        estoque.adicionarProduto(ipad);
        estoque.adicionarProduto(bermuda);
        estoque.adicionarProduto(pao);

        estoque.listarProdutos();
    }
}
