import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FibonacciMetode {

    public static void main(String[] args) {


        //Metode til at lægge talrække sammen
        //Ex. beregn (5) ;  //..betyder at 0+1+2+3+4+5 = 15
        //Med begrænsninger, ex kan der ikke regnes med decimaltal.

        Scanner input = new Scanner(System.in);

        //Prompt user.
        System.out.println("Indtast værdi, og få alle tal derop til lagt sammen.");
        int inputVaerdi = input.nextInt();  // den værdi brugeren indsætter
        System.out.println(fibonacciBeregning(inputVaerdi));  //ved at sætte en metode med return, printes resultatet med det samme når det sættes i sout!


    }

    //Metode til at udregne
    public static int fibonacciBeregning(int inputVaerdi){      //husk retrun!

        int resultat = 0;

        //værdien 'i' repræsenterer alle de tal, som der skal lægges sammen op til den indputtede værdi

        if (inputVaerdi >= 0) {
            for (int i = 0; i < inputVaerdi + 1; i++) {
                resultat += i;
            }
        }
        else{
            for (int i = 0; i > inputVaerdi - 1; i--) {
                resultat += i;
            }
        }

        return resultat;

    }


}