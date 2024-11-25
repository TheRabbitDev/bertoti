public class Usuario implements Inscrito{
    public String nome;
    public Usuario(String nome){
        this.nome = nome;
    }
    @Override
    public void receberEmail(String topic) {
        System.out.println(nome+": I have received an Email about "+topic+"!");
    }
}
