import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CarrinhoCompras {

    // criando a lista de objetos
    private List<Item> itemList;

    // criando o array
    public CarrinhoCompras(){

        this.itemList = new ArrayList<>();

    }

    // metodo para criar um objeto
    public void addItem(String nome, double preco, int quantidade){

        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);

    }

    // metodo para excluir um objeto
    public void removerItem(String nome) {

        // percorrendo a lista em busca de um objeto com o nome pesquisado e adicionando-os a uma lista "paraRemover"
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
          for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
              itensParaRemover.add(i);
            }
          }
          itemList.removeAll(itensParaRemover);
        } else {
          System.out.println("A lista está vazia!");
        }
      }

      public double calcularValorTotal() {

        double valorTotal = 0;
        if (!itemList.isEmpty()) {
            for (Item item : itemList){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal = valorItem + valorTotal;
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
      }

      public void exibirItens() {

        if (!itemList.isEmpty()) {
          System.out.println(this.itemList);
        } else {
          System.out.println("A lista está vazia!");
        }
      }

      public List<Item> pesquisarItem(String nome){
        // criando uma lista para retorno dentro do metodo
        List<Item> ItemPorNome = new ArrayList<>();
        // checando se a lsita não esta vazia
        if(!itemList.isEmpty()) {
            // percorrendo a lista
            for(Item i : itemList) {
                if(i.getNome().equalsIgnoreCase(nome)) {
                    ItemPorNome.add(i);
                }
            }
            return ItemPorNome;
        }else{
            throw new RuntimeException("Item não encontrado");
        }
      }

      public List<Item> pesquisarIntervaloValor(double precoInicial, double precoFinal) {
        // criando uma lista para retorno dentro do metodo
        List<Item> ItemIntervaloValor = new ArrayList<>();
        // checando se a lsita não esta vazia
        if(!itemList.isEmpty()) {
            // percorrendo a lista
            for(Item i : itemList) {
                if(i.getPreco() >= precoInicial && i.getPreco() <= precoFinal ) {
                    ItemIntervaloValor.add(i);
                }
            }
            return ItemIntervaloValor;
        }else{
            throw new RuntimeException("Item não encontrado");
        }
      } 
    
      // retornando apenas o primeiro item da pesquisa por um parâmetro, parando no primeiro item
      public Item pesquisarPreco(double preco){
        Item itemPorPreco = null;
        if(!itemList.isEmpty()){
            for(Item i : itemList) {
                if(i.getPreco() == preco){
                    itemPorPreco = i;
                    break;
                }
            }
            return itemPorPreco;
        }else{
            throw new RuntimeException("Nenhum item deste valor foi encontrado");
        }
      }

      @Override
      public String toString() {
        return "CarrinhoDeCompras itens= " + itemList;
      }

     public List<Item> ordenarPorQuantidade(){
      List<Item> itemPorQuandidade = new ArrayList<>(itemList);
      if(!itemList.isEmpty()) {
        Collections.sort(itemPorQuandidade);
        return itemPorQuandidade;

      }else{
        throw new RuntimeException("A lista está vazia");
      }
      
     }

}
