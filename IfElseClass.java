public class IfElseClass {
    public static void main(String[] args){
        /*If statement */
        if(true){
            System.out.println("True Statement");

        }
        /*If takes boolean expressions inside() */
        int num1 = 10, num2 = 20;
        if(num1 == num2){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }    
        /*Note that else is optional */    
        /*If else if  */
        if(num1 == num2){
            System.out.println("Equal");
        }else if (num1< num2){
            System.out.println("Lesser");

        }else{
            System.out.println("Greater");
        }
        /*Note that else should be ata the last */
        /*If else if ladder */
        if(num1 > num2){
            System.out.println("Greater");
        }else if (num1 != num2){
            System.out.println(" Not Equal");
        }else if (num1== num2){
            System.out.println("Equal");
        }else{
            System.out.println("Default Statement");
        }
        /*Nested if statement */
        if(num1 < 0){
            if(num1> num2){
                System.out.println("Negative and greater");
            }else{
                System.out.println("Neagtive and lesser");
            }    
        }else{
            if(num1 > num2){
                System.out.println("Positive and greater");
            }else{
                System.out.println("Positive and lesser");
            }
        }
               
        

    }
   
/*Task 
 * Consider the total avg in following marking
 * calculate the total and avg in a variable
 * if any of the marking is less than 35, print fail
 * if avg is less than 60, print third div
 * if avg is less than 70,, print second division
 * if avg is less than 80, print first division
 * if avg is equal or greater than 80, print distinction
 * if avg is less than 0 or more than 100, print invalid
 */
int science = 35, english = 55, math = 89;
int total = science +english + math ;
int avg = total/3;
if (science < 35) && 







}