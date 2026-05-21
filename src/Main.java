import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean validandoApp = true;
        int opcao;
        Scanner sc = new Scanner(System.in);
        Cartao cartao = new Cartao(2000);

        while (validandoApp){
            System.out.println("Escolha: 1. Adiocionar Compra | 2. Listar Compras | 3. Mostrar saldo disponível | 0 para sair ");
            opcao = sc.nextInt();
            sc.nextLine();
            if(opcao == 1){
                System.out.println("Nome da compra:");
                String nomeDaCompra = sc.nextLine();

                System.out.println("Valor da compra:");
                double precoDaCompra = sc.nextDouble();

                Compra compra = new Compra(nomeDaCompra,precoDaCompra);
                fazerCompras(cartao, compra);
            } else if (opcao == 2) {
                cartao.getCompras().forEach(System.out::println);
            } else if (opcao == 3) {
                System.out.println("Saldo disponível: R$"+cartao.getSaldo());
            } else if (opcao == 0) {
                validandoApp = false;
            }
        }
    }
    private static void fazerCompras(Cartao cartao, Compra compra){
        if(cartao.lancaCompra(compra)){
            System.out.println("Compra de " + compra.getDescricao() + " APROVADA!");
        }else {
            System.out.println("Compra de " + compra.getDescricao() + " REPROVADA! Saldo dispinivel: R$" + cartao.getSaldo());
        }
    }
}