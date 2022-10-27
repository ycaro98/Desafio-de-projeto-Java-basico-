import java.util.Scanner;

public class VetorII {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();

// TODO: Implemente uma condição onde possamos preencher o vetor de N.

// Lembre-se a sequência de valores é de 0 até T-1:
        int[] n = new int[1000];

        for(int i = 0; i < n.length; i++){
            n[i] = i%t;
            for(int j = 0 ;j < 1000 ;j++){
                if(i == j%t){
                    System.out.println("N[" + i  + "] = " + n[i] );
                }
            }
        }
       /* for(int i = 0; i < n.length; i++){
            n[i] = i%t;
                }
        for(int i = 0; i < n.length; i++)
            System.out.printf("n[%d] = %d\n", i, n[i]);
            }*/

    }
}
