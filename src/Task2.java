import java.util.Arrays;
import java.util.Random;

class Trekning{
    int vinnertall = 0;
    int vinnertallene [] = new int[7];

    public int [] leggInnTallene(){
        Random r = new Random();
        for (int i = 0; i <= vinnertallene.length; i++){
            vinnertall = r.nextInt(1,34);
            vinnertallene [i] = vinnertall;
        }
        return vinnertallene;
    }

    public void sorterPrint (){
        Arrays.sort(vinnertallene);
        for (int i : vinnertallene){
            System.out.print(i + " ");
        }
    }
}

public class Task2 {
    public static void main(String[] args) {

    }
}
