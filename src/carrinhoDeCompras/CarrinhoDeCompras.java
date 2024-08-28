package carrinhoDeCompras;

import java.util.*;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, int quantidade){
        itemList.add(new Item( nome,  preco, quantidade));
    }
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }
    public void calcularValorTotal(){
        double valorTotal = 0;
        for(Item i: itemList){
            valorTotal += i.getPreco();
        }
        System.out.println(valorTotal);
    }
    public void exibirItens(){
        System.out.println(itemList);
    }


}
