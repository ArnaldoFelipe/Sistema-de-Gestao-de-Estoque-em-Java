package SistemaEstoque;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Loja {
    
    private List<Produto> produtos = new ArrayList<>();

    
    public void addProduto(Produto produto){
        produtos.add(produto);
    }

    public Optional<Produto> buscarProdutoPorId(int id){

        for(Produto produto : produtos){

            if(produto.getId() == id){
                return Optional.of(produto);
            }
        }

        return Optional.empty();
    }

    public List<Produto> BuscarProdutosPorCategoria(Categoria categoria){
        return produtos.stream()
                .filter(produto -> produto.getCategoria() == categoria)
                .collect(Collectors.toList());
    }

    public void AtualizarStatus(int id, StatusProduto novoStatus){
        buscarProdutoPorId(id).ifPresent(produto -> produto.setStatus(novoStatus));
    }

    public double calcularValorTotalEmEstoque(){
        return produtos.stream()
                .filter(produto -> produto.getStatus() == StatusProduto.DISPONIVEL)
                .mapToDouble(produto -> produto.getPreco())
                .sum();
    }
}
