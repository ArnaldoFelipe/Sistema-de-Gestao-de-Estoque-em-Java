package SistemaEstoque;

public class Produto {
    
    private int id;
    private String nome;
    private double preco;
    private Categoria categoria;
    private StatusProduto status;

    Produto(int id, String nome, double preco, Categoria categoria, StatusProduto status){

        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.status = status;
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public void setStatus(StatusProduto status){
        this.status = status;
    }

    public StatusProduto getStatus(){
        return status;
    }

   

}
