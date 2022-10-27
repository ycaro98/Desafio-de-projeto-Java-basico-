public class arrayPares {
    public static void main(String[] args) {
        int[] num = {2, 3, 5, 7, 11, 13, 18, 34};
        ;

        for (int i = 0; i < num.length; i++){
        if (num[i] % 2 ==0) {
            System.out.println(num[i]);
        }
        }
    }
}