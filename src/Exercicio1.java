class Produto {
    String nome;
    double preco;
    int quantidade;

    double ValorDoEstoque(){
        return preco * quantidade;
    }

    void adicionarEstoque(int qtd){
        quantidade = quantidade + qtd;
    }

    void RemoverEstoque(int qtd){
        quantidade = quantidade - qtd;
    }
}
