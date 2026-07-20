/* Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade
e um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos
herdados. Crie um objeto ProdutoPerecivel e imprima seus valores. */

public class ProdutoPerecivel extends Produto {

    String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome,preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public static void main(String[] args) {
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Leite", 4.50, 2, "22/02/2022");
        System.out.println(produtoPerecivel);
    }

}
