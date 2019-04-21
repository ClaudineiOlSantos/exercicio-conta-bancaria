package contabancaria;

/**
 *
 * @author claudinei
 */
public class Conta implements ContaInterface {

    private String nome;
    private String conta;
    private double saldo;
    private String strato = "";

    public Conta(String nome, String conta, double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void deposito(double valor, boolean transferencia) {
        if (valor > 0) {
            this.saldo += valor;
            this.saldo -= Juros.calculaTaxa(valor);
            this.strato += "\n\n" + (transferencia ? "Transferência" : "Deposito") + ": R$" + valor
                    + "\nDesconto Taxa -R$" + Juros.calculaTaxa(valor)
                    + "\n-------------------------------------";
        }
    }

    @Override
    public void saque(double valor, boolean transferencia) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            this.saldo -= Juros.calculaTaxa(valor);
            this.strato += "\n\n" + (transferencia ? "Transferência" : "Saque") + ": -R$" + valor
                    + "\nDesconto Taxa -R$" + Juros.calculaTaxa(valor)
                    + "\n-------------------------------------";
        }
    }

    @Override
    public void transferencia(Conta conta, double valor) {
        if (valor <= this.saldo) {
            this.saque(valor, true);
            conta.deposito(valor, true);
        }
    }

    @Override
    public String toString() {
        return "\n\n\nConta{" + "nome =" + nome
                + ", conta =" + conta
                + ", saldo =" + saldo
                + " Redimento do mês R$ " + Juros.calculaJuros(this.saldo, Juros.fatorRendimento, 1)            
                + this.strato
                + "\nSaldo total: R$" + (this.saldo + Juros.calculaJuros(this.saldo, Juros.fatorRendimento, 1))
                + "\n-------------------------------------";
    }

}
