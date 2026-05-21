import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



    }

    private static void fazerCompras(Cartao cartao, Compra compra){
        if(cartao.lancaCompra(compra)){
            System.out.println("Compra de " + compra.getDescricao() + " APROVADA!");
        }else {
            System.out.println("Compra de " + compra.getDescricao() + " REPROVADA!");
        }
    }
}