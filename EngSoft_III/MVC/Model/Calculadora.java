public class Calculadora {
    private Operacao operacaoAtual;

    public void definirOperacao(Operacao operacao) {
        this.operacaoAtual = operacao;
    }

    public double calcular(double valor1, double valor2) {
        if (operacaoAtual == null) {
            throw new IllegalStateException("Operação não definida.");
        }
        return operacaoAtual.executar(valor1, valor2);
    }
}