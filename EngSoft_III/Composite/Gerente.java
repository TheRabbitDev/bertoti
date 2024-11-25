import java.util.ArrayList;
import java.util.List;

public class Gerente implements MembroCompania {
    public String name;
    private List<MembroCompania> subordinados;
    public Gerente(String name) {
        this.name = name;
        subordinados = new ArrayList<MembroCompania>();
    }
    public void AddSubordinado (MembroCompania subordinado){
        subordinados.add(subordinado);
    }
    public int count(){
        int count = 0;
        for (MembroCompania f: subordinados) {
            count += f.count();
        }
        return count;
    }

}
