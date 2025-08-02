package SistemaEstoque;

public enum Categoria {
    
    SMARTPHONE("Smartphones"),
    NOTEBOOK("Notebooks"),
    TV("Tvs"),
    ACESSORIO("Acessorios");

    private final String nomeExibir;

    Categoria(String nome){
        this.nomeExibir = nome;
    }

    public String getNomeExibir(){
        return nomeExibir;
    }

    
}
