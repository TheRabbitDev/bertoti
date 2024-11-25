public class Empregado implements CompanyMember{
    private String name;
    public Empregado(String name){
        this.name = name;
    }
    public int count(){
        return 1;
    }
}
