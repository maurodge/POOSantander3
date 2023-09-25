
public class Item implements Comparable <Item>{

    // atributos
    private String nome;
    private double preco;
    private int quantidade;
    
    // construtor ===> atalho botao direito + Source action + metodo
    // NÃO FOI CRIADO UM CONSTRUTOR VAZIO, PORTANTO TODOS OS OBJETOS CRIADOS TERÃO QUE TER ESSES ATRIBUTOS
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    // getters and setter ===> atalho botao direito + Source action + metodo
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

    // Override toString ===> atalho botao direito + Source action + metodo
    @Override
    public String toString() {
        return "Item: " + "nome = " + nome + ", preco = " + preco + ", quantidade = " + quantidade;
    }

    @Override
    public int compareTo(Item o) {
        return Integer.compare(quantidade, o.getQuantidade());
        
    }
 
}
