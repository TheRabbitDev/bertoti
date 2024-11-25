import java.util.ArrayList;
import java.util.List;

public class TopicoEmail {
    public String nomeTopico;
    private List<Inscrito> inscritos;
    public TopicoEmail(String topico){
        this.nomeTopico = topico;
        this.inscritos = new ArrayList<Inscrito>();
    }
    public void subscribe(Usuario usuario){
        inscritos.add(usuario);
    }
    public void unsubscribe(Usuario usuario){
        inscritos.remove(usuario);
    }
    public void sendEmail(){
        for (Inscrito sub: inscritos) {
            sub.receiveEmail(nomeTopico);
        }
    }
}
