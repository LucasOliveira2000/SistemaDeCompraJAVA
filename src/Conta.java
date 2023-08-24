public class Conta {

    private double pagamento;

    // Chamo o construtor para inicializar os atributos
    public Conta(double pagamento) {
        this.pagamento = pagamento;
    }

    // Chamo o construtor
    public boolean verificarPagamento(double total){
        return pagamento >= total; // se o pagamento for maior ou igual ao total ele vai retornar True
    }

}













