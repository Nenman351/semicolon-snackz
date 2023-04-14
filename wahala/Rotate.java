package wahala;

public class Rotate {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i <= arr.length-2; i++){
            arr[i] = arr[i+1];
            System.out.println(arr.toString());
        }
    }
}
