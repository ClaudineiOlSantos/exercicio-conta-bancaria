package contabancaria;

/**
 *
 * @author claudinei
 */
public interface ContaInterface {

    public void deposito(double valor,boolean transferencia);

    public void saque(double valor,boolean transferencia);

    public void transferencia(Conta conta, double valor);

}
