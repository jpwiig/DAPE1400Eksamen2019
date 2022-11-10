public class Task1 {
    public static void main(String[] args) {
        //a)
        //iterer gjennom med en før - løkke
        for (int i = 0; i <= 100; i += 3) {
            System.out.print(i + " ");
        }

        //b)

        System.out.println("b) ");
        int i = 0;
        int sum = 0;
        int count = 0;
        //iterer gjennom med en while løkke, i, sum og count blir bestemt på utsiden.
        while (i <= 100) {
            System.out.print(i + " ");
            i += 2;
            sum += i;
            count++;
        }
        double avg = (double) sum / count;
        System.out.println("AVG: " + avg);

    }
}
