package lab3;

import jdk.nashorn.internal.parser.Scanner;

public class Ex_3 {
    public  static  void  main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Score");
        double score = scanner.nextDouble()

        // display menu
        System.out.println("What is your favorite foot? ");
        System.out.println("1.KFC");
        System.out.println("2.Shabu");
        System.out.println("3.pizza:");
        System.out.println("Select:");
        int s = scanner.nextInt(); //input integer from user


         if (s == 1) {//int or char
             System.out.println("Wow, I like berger at KFC.");
         }else if (s == 2){
             System.out.println("You have to spend 300 THB per person.");
         }else if (s==3) {
             System.out.println("I do not like pizza.");
         }else
            System.out.println("Please, select 1-3. thank.");

        }





    }



}
