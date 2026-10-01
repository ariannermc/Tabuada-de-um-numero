import java.util.Scanner;

public class Tabuada{
    public static void tabuada(int num) {
        for(int i = 1; i <= 10; i++){
            System.out.println(i + "x" + num + "=" + (i*num));
        }
    }

    public static void main(String[] args){
        Scanner td = new Scanner(System.in);     
        int N;

        System.out.print("Digite um número para imprimir a tabuada: ");
        N = td.nextInt();

        tabuada(N);
        td.close();
    }
}