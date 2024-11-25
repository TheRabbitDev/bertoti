import java.util.HashMap;
import java.util.Map;

public class ControladorCalculadora {
    private final Calculadora modelo;
    private final VisaoCalculadora visao;
    private final Map<String, Operacao> operacoes;

    public ControladorCalculadora(Calculadora modelo, VisaoCalculadora visao) {
        this.modelo = modelo;
        this.visao = visao;
        this.operacoes = new HashMap<>();

        // Adicionando operações ao "Composite"
        operacoes.put("+", new Soma());
        operacoes.put("-", new Subtracao());
        operacoes.put("*", new Multiplicacao());
        operacoes.put("/", new Divisao());
    }

    public void executar() {
        double valor1 = visao.lerNumero("Digite o primeiro número: ");
        double valor2 = visao.lerNumero("Digite o segundo número: ");
        String simboloOperacao = visao.lerOperacao();

        Operacao operacao = operacoes.get(simboloOperacao);
        if (operacao != null) {
            modelo.definirOperacao(operacao);
            double resultado = modelo.calcular(valor1, valor2);
            visao.exibirResultado(resultado);
        } else {
            System.out.println("Operação inválida.");
        }
    }
}