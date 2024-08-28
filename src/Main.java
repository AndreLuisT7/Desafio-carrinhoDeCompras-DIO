
import carrinhoDeCompras.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       CarrinhoDeCompras cc = new CarrinhoDeCompras();

       cc.adicionarItem("batata", 5.0, 5);
       cc.adicionarItem("pera", 3.0, 5);
       cc.exibirItens();
       //cc.removerItem("pera");
       cc.exibirItens();
       cc.calcularValorTotal();

    }
}