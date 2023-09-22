package Collections.List.Desafio.OperacoesBasicasDesafio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;


    public CarrinhoDeCompras(){
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itens.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList();
        for(Item item : itens){
            if(item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }
        }
        itens.removeAll(itensParaRemover);
    }
    public void calcularValorTotal() {
        double valorTotal = 0.0;
        for (Item item : itens) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        System.out.println("Valor Total: " + valorTotal);
    }

    public void exibirItens(){
        System.out.println(itens); 
    }
    
}
