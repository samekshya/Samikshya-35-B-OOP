import java.util.Scanner;
/*
 * or use
 * import java.util.*;// imports all utils
 */

public class InputOutput {
    public static void main(String[] args) {
        /*User output 
         * System.out.println("Print next line");
         * "sout" for shortcut
         */
       System.out.println("This string breaks line ");
       /*System.out.print */
       System.out.print("This will not break line ");
       System.out.print("This will continue");
       /*Sytem.out.printf
        * String formatter
        *%s String, %d Integra, %F floating point, %b boolean
        */
        System.out.printf("Hello %s, Nice", "world");
        System.out.printf("This is num %d", 10);
        /*You can use multiple formatter */
        System.out.printf("Num %f and bool %b", 10.3f, false);
        
        /*User Imput */
        Scanner scan = new Scanner(System.in);
        System.out.println("The following takes the whole sentence");
        String wholeWString = scan.nextLine();
        System.out.println("The input is "+ wholeWString);
        System.out.println("The following takes the whole integer");
        int intInput =  scan.nextInt();
        System.out.println("The input is " + intInput );
        System.out.println("The following takes double");
        double doubleInput =  scan.nextDouble();
        System.out.println("The input is"+ doubleInput);
        System.out.println("The following takes boolean");
        boolean booleanInput = scan.nextBoolean();
        System.out.println("The input is"+ booleanInput);
        scan.close(); // close after taking all the input

       /*task
       *Make a new scanner object/variable scan1
       *Promt the folowing
       *What is your name? -> save as string, name
       *Are you over 18? -> save as boolean,string
       *How many sibllings? -> save as int, sibling
       *Print the following
       * Hello, name
       * Over 18? status
       * You hvae sibling num of sibling
       * // cooment the previous scanner for ease of use
       */

       Scanner scan1 = new Scanner(System.in);
       System.out.println("What is your name");
       String name = scan1.nextLine();
       System.out.println("Are you over 18?");
       boolean status = scan1.nextBoolean();
       System.out.println("How many sibling? ");
       int sibling = scan1.nextInt();
       System.out.println("Hello "+ name);
       System.out.println("Over 18? " + status );
       System.out.println("You have" + sibling + "no siblings");
       scan1.close();

    }
}
 








 
