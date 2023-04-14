package wahala;

public class ProductList {
    public static void products(int[] list){

        int[] number = new int[list.length];


        for(int i = 0;i < list.length;i++){
            int temp = 1;
            for(int j = 0;j < list.length;j++){
                if(i == j){
                    continue;
                }
                temp *= list[j];
            }
            number[i] = temp;
            System.out.println(number[i]);
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        products(arr);

    }
}
