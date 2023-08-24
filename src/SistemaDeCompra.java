import java.util.Scanner;

public class SistemaDeCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a nossa loja");

        System.out.print("\nQual o nome do produto que você quer comprar:");
        String produto = scanner.next();

        System.out.print("\nQual a quantidade: ");
        int quantidade = scanner.nextInt();

        System.out.print("\nQual o valor do produto: ");
        double valor = scanner.nextDouble();
        
        Compra compra = new Compra(produto,quantidade,valor);
        compra.exibirResumo();

        System.out.print("\nDigite o valor pago: ");
        double pagamento = scanner.nextDouble();

        Conta conta = new Conta(pagamento);

        if (conta.verificarPagamento(compra.calcularTotal())) {
            System.out.println("Pagamento efetuado com sucesso!");

        } else {
            System.out.println("Valor insuficiente. Pagamento não foi efetuado.");
        }

        scanner.close();

















    }


}