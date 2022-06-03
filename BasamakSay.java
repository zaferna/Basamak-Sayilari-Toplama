import java.util.Scanner;

public class BasamakSay {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int a,b,c,d,i;
        b=0;
        d=0;

        System.out.print(" Sayi Gir: ");
        a= inp.nextInt();

        while(a!=0){
           b= a%10;

           d+=b;
            a/=10;


        }
        System.out.print(d);

    }
}
