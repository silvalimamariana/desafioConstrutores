/* Crie uma classe Produto com atributos como nome, preco, e quantidade.
Em seguida, crie uma lista de objetos Produto utilizando a classe ArrayList.
Adicione alguns produtos, imprima o tamanho da lista e recupere um produto pelo índice. */

/* Implemente o metodo toString() na classe Produto para retornar uma representação em
texto do objeto. Em seguida, imprima a lista de produtos utilizando o metodo System.out.println(). */

/* Modifique a classe Produto para incluir um construtor que aceite parâmetros para inicializar
os atributos. Em seguida, crie objetos Produto utilizando esse novo construtor. */

import java.util.ArrayList;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" +quantidade + "]";
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Abacate", 8.55, 2);
        Produto produto2 = new Produto("Salmão", 9.85, 1);
        Produto produto3 = new Produto("Cajú", 3.49, 5);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Produto na posição 1: " + listaDeProdutos.getFirst().getNome());

        for (Produto produto: listaDeProdutos) {
            System.out.println(produto);
        }
    }
}