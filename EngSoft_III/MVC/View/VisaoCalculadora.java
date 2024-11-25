import java.util.Scanner;

public class VisaoCalculadora {
    private final Scanner entrada;

    public VisaoCalculadora() {
        this.entrada = new Scanner(System.in);
    }

    public double lerNumero(String mensagem) {
        System.out.print(mensagem);
        return entrada.nextDouble();
    }

    public void exibirResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public String lerOperacao() {
        System.out.print("Escolha a operação (+, -, *, /): ");
        return entrada.next();
    }
}
