package devandroid.borba.appgaseta.apoio;

public class UtilGasEta {

    public void metodoEstatico() {


    }

    public static void metodoNaoEstatico() {

    }

    public static String mensagem() {
        return "Qualquer mensagem...";
    }

    public static double preco() {
        return 9.99;
    }

    public static String calcularMelhorOpcao(double gasolina, double etanol) {

        double precoideal = gasolina * 0.70;

        String mensagemDeRetorno;

        if (etanol <= precoideal) {
            mensagemDeRetorno = "Abastecer com Etanol";
        } else {
            mensagemDeRetorno = "Abastecer com Gasolina";
        }
        return mensagemDeRetorno;
    }
}
