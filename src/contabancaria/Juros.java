package contabancaria;

/**
 *
 * @author claudinei
 */
public class Juros {

    public static double fatorRendimento = 0.5;

    /**
     * Calcula o jusros do mês
     *
     * @param capital
     * @return (capital * taxa *tempo)
     */
    public static double calculaJuros(double capital, double taxa, double tempo) {
        return (capital * (taxa / 100) * tempo);
    }

    /**
     * Calcula qual a taxa deverá ser cobrada por transação
     *
     * @param valor
     * @return
     *
     * Para valores até R$100,00 = 1% de taxa Para valores até R$500,00 = 2% de
     * taxa Para valores acima de R$500,00 = 3% de taxa
     */
    public static double calculaTaxa(double valor) {
        double taxa;
        if (valor <= 100) {
            return (valor * (1.0 / 100.0) * 1);
        } else if (valor <= 500) {
            return (valor * (2.0 / 100.0) * 1);
        } else {
            return (valor * (3.0 / 100) * 1);
        }
    }
}
