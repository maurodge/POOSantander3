public class Application {
    public static void main(String[] args) {
       // instanciando a lista 
        CarrinhoCompras car = new CarrinhoCompras();

        // testando os metodos
        car.addItem("Caneta", 3.00, 5);
        car.addItem("Borracha", 3.00, 1);
        car.addItem("Papel", 4.00, 2);
        car.addItem("Fita adesiva", 8.00, 3);
        car.addItem("Estojo", 16.00, 4);
        car.addItem("Caneta", 3.00, 5);

        System.out.println("Exibindo a lista");
        car.exibirItens();
        System.out.println("Removendo dois itens");
        //car.removerItem("Caneta");
        System.out.println("Nova lista");
        car.exibirItens();
        System.out.println("Valor total do carrinho = " +  car.calcularValorTotal());
       
        System.out.println("Pesquisando item fita " + car.pesquisarItem("Fita"));
        System.out.println("Pesquisando item fita adesiva " + car.pesquisarItem("fita adesiva"));
        System.out.println("Pesquisando item intervalo de valor " + car.pesquisarIntervaloValor(4, 15));
        System.out.println("Pesquisando item e parando quando aparece o primeiro " + car.pesquisarPreco(3) );
        System.out.println("A lista em ordem de quantidade é: " + car.ordenarPorQuantidade());
    }
}
