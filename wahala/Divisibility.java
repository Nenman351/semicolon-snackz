package wahala;

public class Divisibility {
    public static void main(String[] args) {
        int total = 0;
        int counter;
        for (counter = 1; counter <=30; counter++){
            if (counter % 3 == 0){
                total += counter;
            }
        }
        System.out.println(total);
    }
}
