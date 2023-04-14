package wahala;

public class Ventures {
    public static void main(String[] args) {
        String word = "Ventures";
        for (int i = 0; i <word.length(); i +=2) {
            char letter = word.charAt(i);
            char letter2 = word.charAt(i + 1);
            System.out.println(letter + " " + letter2);
        }
    }
}
