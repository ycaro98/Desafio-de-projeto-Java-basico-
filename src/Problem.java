import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Problem {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);

        int cod1 = leitor.nextInt();
        int n1 = leitor.nextInt();
        double valor1 = leitor.nextDouble();

        int cod2 = leitor.nextInt();
        int n2 = leitor.nextInt();
        double valor2 = leitor.nextDouble();


// TODO: Implemente um Cálculo Simples.
// Levando em consideração a sua precedência de operadores e a definição de suas casas decimais:

        double total = n1 * valor1 + n2 * valor2;
                System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));

                leitor.close();
    }

}
       /*
        Set<Produtos1> compraProduto1 = new LinkedHashSet<>(){{
            add(new Produtos1(12, 1, 5.30));
        }};

        Set<Produtos2> compraProduto2 = new LinkedHashSet<>(){{
            add(new Produtos2(16, 2, 10.2));
        }};

        Iterator<Produtos1> iterator = compraProduto1.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next().getValor1();
            soma += next;
        }

        Iterator<Produtos2> iterator1 = compraProduto2.iterator();
        Double soma2 = 0.0;
        while(iterator1.hasNext()){
            Double next = iterator1.next().getValor2();
            soma2 += next;
        }


        System.out.println("O valor total a pagar é de R$ " + (soma+soma2));

    }
}
class Produtos1 {
    private int cod1;
    private int n1;
    private double valor1;

    public Produtos1(int cod1, int n1, double valor1) {
        this.cod1 = cod1;
        this.n1 = n1;
        this.valor1 = valor1;
    }

    public int getCod1() {
        return cod1;
    }

    public void setCod1(int cod1) {
        this.cod1 = cod1;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }
}

class Produtos2 {
    private int cod2;
    private int n2;
    private double valor2;

    public Produtos2(int cod2, int n2, double valor2) {
        this.cod2 = cod2;
        this.n2 = n2;
        this.valor2 = valor2;
    }

    public int getCod2() {
        return cod2;
    }

    public void setCod2(int cod2) {
        this.cod2 = cod2;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    */