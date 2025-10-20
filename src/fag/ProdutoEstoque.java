package fag;

public class ProdutoEstoque {
    private String nome;
    private int quantidade;

    public ProdutoEstoque(String nome, int quantidade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa");
        }
        this.nome = nome;
        this.quantidade = quantidade;
    }

   
    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
        }
    }

  
    public void removerEstoque(int qtd) {
        if (qtd > 0 && this.quantidade - qtd >= 0) {
            this.quantidade -= qtd;
        }
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public String getNome() {
        return this.nome;
    }
}
