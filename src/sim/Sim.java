package sim;
import java.util.ArrayList;
public class Sim {

    private final String name;
    private static int poblacion = 0;

    public Sim(String name) {
        this.name = name;
        poblacion++;
    }

    public static int getPoblacion() {
        return poblacion;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        ArrayList <Sim> listaSim = new ArrayList();
        Sim a = new Sim("alex");
        Sim b = new Sim("luis");
        listaSim.add(a);
        listaSim.add(b);
        for (int i = 0; i < listaSim.size(); i++) {
            System.out.println(listaSim.get(i).getName());
        }
        for(Sim e: listaSim){
            System.out.println(e.getName());
        }
        System.out.println(Sim.getPoblacion());

    }

}
