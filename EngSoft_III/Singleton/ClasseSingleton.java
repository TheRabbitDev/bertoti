public class ClasseSingleton {
    private static ClasseSingleton instancia;
    public int value;
    private ClasseSingleton(int val){
        this.value = val;
    }
    public static ClasseSingleton getInstancia(int val){
        if (instancia == null) {
            instancia = new ClasseSingleton(val);
        }
        return instancia;
    }
    public void incrementrValor(int val){
        value += val;
    }
    public void mostrarValor(){
        System.out.println("Singleton value: "+value);
    }

}
