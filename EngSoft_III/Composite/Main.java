import java.util.ArrayList;

class Composite {
    public static void main (String[] args){
        Gerente g1 = new Gerente("Alberto");
        Gerente g2 = new Gerente("Bruna");
        Gerente g3 = new Gerente("Charles");

        Empregado e1 = new Empregado("Dennis");
        Empregado e2 = new Empregado("Elaine");
        Empregado e3 = new Empregado("Francisco");
        Empregado e4 = new Empregado("Gabriela");
        Empregado e5 = new Empregado("Helenna");
        Empregado e6 = new Empregado("Igor");
        m3.AddSubordinado(e1);
        m3.AddSubordinado(e2);
        m3.AddSubordinado(e3);

        m2.AddSubordinado(e4);
        m2.AddSubordinado(e5);
        m2.AddSubordinado(g3);

        m1.AddSubordinado(e6);
        m1.AddSubordinado(g2);

        System.out.println(g1.name+" tem "+g1.count()+" Funcionarios em seu time");
    }
}