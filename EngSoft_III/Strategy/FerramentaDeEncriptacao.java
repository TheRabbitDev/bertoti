public class FerramentaDeEncriptacao {
    private MetodoEncriptacao metodo;
    public MetodoEncriptacao(MetodoEncriptacao met){
        metodo = met;
    }
    public void setmMtodo(MetodoEncriptacao met) {
        metodo = met;
    }
    public void encrypt(String str) {
        System.out.println(metodo.encrypt(str));
    }

}
