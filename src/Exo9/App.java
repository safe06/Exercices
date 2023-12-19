package Exo9 ;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in) ;

        //Exercice 9 :Écrivez un programme Java qui itère les entiers de 1 à 100 :
        //‐ Pour les multiples de trois, imprimez "Fizz" au lieu du nombre et pour les multiples de cinq
        //imprimez "Buzz".
        //‐ Pour les nombres qui sont des multiples de trois et cinq, imprimez "FizzBuzz".

       
      
        

        System.out.println("saisir un nombre");
        int j = scanner.nextInt() ;
        System.out.println(j);

      
       
             if (j %3 == 0 && j %5 == 0 && j < 100) {
                System.out.println("FizzBuzz");
            }
             else if (j %5 == 0 && j < 100) {
                System.out.println("Bizz");
            }
            else if (j %3 == 0 && j < 100) {
                System.out.println("Fizz");
            }
            else {
                System.out.println("erreur");
            }

            scanner.close();

        
    

            
    }
}
