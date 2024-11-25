class Singleton {
    public static void main (String[] args){
        System.out.println("Instancing a singleton with value 10, and incrementing 5:");
        ClasseSingleton singleton1 = ClasseSingleton.getInstancia(10);
        sing1.mostrarValor();
        sing1.incrementValue(5);
        sing1.mostrarValor();

        System.out.println("\nTrying to instance another singleton with value 2000, and incrementing 5:");
        ClasseSingleton singleton2 = ClasseSingleton.getInstancia(2000);
        sing2.mostrarValor();
        sing2.incrementValue(5);
        sing2.mostrarValor();
    }
}