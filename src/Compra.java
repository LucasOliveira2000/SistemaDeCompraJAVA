
 public class Compra{

    private String produto;
    private int quantidade;
    private double valor;

     // Chamo o construtor para inicializar os atributos


     public Compra(String produto, int quantidade, double valor) {
         this.produto = produto;
         this.quantidade = quantidade;
         this.valor = valor;
     }

     public double calcularTotal(){
         double totalProduto = quantidade * valor;
         return  totalProduto;
     }


     public void exibirResumo() {
         System.out.println("\n#Resumo da compra:");
         System.out.println("Produto(s): " + produto);
         System.out.println("Quantidade: " + quantidade);
         System.out.println("Valor do Produto: " + valor);
         System.out.println("Total da compra: " + calcularTotal() + " reais");
     }

 }
