public class Aplicacao {
    public static void main(String[] args) {
        Calculadora modelo = new Calculadora();
        VisaoCalculadora visao = new VisaoCalculadora();
        ControladorCalculadora controlador = new ControladorCalculadora(modelo, visao);

        controlador.executar();
    }
}