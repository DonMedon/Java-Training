package Ex2;

public class Conta {

    private String nConta, titular;
    private double saldo, margem, divida;
    private int ano;

    public Conta(String nConta, String titular, double saldo) {
        this.nConta = nConta;
        this.titular = titular;
        this.saldo = saldo;
        this.ano = 2023;
        this.divida = 0;

    }

    public double margemEmprestimo() {

        return this.margem = this.saldo * 0.9;
    }

    public boolean pedirEmprestimo(int valor) {
        if (this.divida > 0) {
            System.out.println("Não pode pedir empréstimo porque tem dívida");
            return false;
        } else if (valor < margemEmprestimo()) {
            this.saldo += valor;
            this.divida += valor;
            System.out.println("Saldo: " + this.saldo);
            System.out.println("Divida: " + this.divida);
            return true;
        } else {
            System.out.println("Não pode pedir empréstimo porque não tem saldo suficiente");
            return false;
        }
    }


}









