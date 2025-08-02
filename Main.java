package SistemaEstoque;

import java.util.List;
import java.util.Optional;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("--- Criando Loja e Produtos ---");
        Loja minhaLoja = new Loja();
        
        Produto p1 = new Produto(1, "iPhone 15", 7500.00, Categoria.SMARTPHONE, StatusProduto.DISPONIVEL);
        Produto p2 = new Produto(2, "Notebook Dell G15", 8500.00, Categoria.NOTEBOOK, StatusProduto.DISPONIVEL);
        Produto p3 = new Produto(3, "Smart TV Samsung 50'", 3200.00, Categoria.TV, StatusProduto.INDISPONIVEL);
        Produto p4 = new Produto(4, "Mouse Gamer", 250.00, Categoria.ACESSORIO, StatusProduto.DISPONIVEL);
        
        minhaLoja.addProduto(p1);
        minhaLoja.addProduto(p2);
        minhaLoja.addProduto(p3);
        minhaLoja.addProduto(p4);

        System.out.println("Produtos adicionados ao estoque.");
        
        System.out.println("\n--- Testando metodos ---");

        System.out.println("\nBuscando produtos da categoria SMARTPHONE:");
        List<Produto> smartphones = minhaLoja.BuscarProdutosPorCategoria(Categoria.SMARTPHONE);
        for(Produto p : smartphones){
            System.out.println("Smartphones encontrados " + p.getNome());
        }

        System.out.println("\nBuscando produto com ID 99:");
        Optional<Produto> ProdutoNaoEncontrado = minhaLoja.buscarProdutoPorId(99);
        ProdutoNaoEncontrado.ifPresentOrElse(
            p -> System.out.println("-> Encontrado: " + p.getNome()),
            () -> System.out.println("-> Produto não encontrado.")
        );

        System.out.println("\nBuscando produto com ID 2:");
        Optional<Produto> ProdutoEncontrado = minhaLoja.buscarProdutoPorId(2);
        ProdutoEncontrado.ifPresentOrElse(
            p -> System.out.println("-> Encontrado: " + p.getNome()),
            () -> System.out.println("-> Produto não encontrado.")
        );

        System.out.println("\nAtualizando status do produto com ID 3...");
        minhaLoja.AtualizarStatus(3, StatusProduto.DISPONIVEL);
        Optional<Produto> tvAtualizada = minhaLoja.buscarProdutoPorId(3);
        tvAtualizada.ifPresent(p -> System.out.println("-> Novo status da " + p.getNome() + ": " + p.getStatus()));

        System.out.println("\nCalculando valor total em estoque...");
        double valorTotal = minhaLoja.calcularValorTotalEmEstoque();
        System.out.printf("-> Valor total dos produtos disponiveis: R$ %.2f\n", valorTotal);
    }
}
