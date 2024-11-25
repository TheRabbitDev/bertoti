public class Divisao implements Operacao {
    public double executar(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
    }
}