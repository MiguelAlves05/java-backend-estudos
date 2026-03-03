import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Produto p = new Produto();

        p.nome = "Teclado";
        p.quantidade = 100;
        p.preco = 5;

        System.out.println(p.ValorDoEstoque());

        p.adicionarEstoque(3);

        System.out.println(p.quantidade);

    }
}
