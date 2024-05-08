public class Forloop {
    public static void main(String[] args){
        /*Foor loop takes initialisation
         * condition
         * modify/update  */
        for(int index = 0; index <=5; index ++){
            System.out.println("For index" + index);

        } 
        /*can use different update logic like
         * for(int index = 0; index <=5 ; index +=3) */
         
         /*usinf decrement */
        for(int index = 10; index>=0 ; index --){
                System.out.println("For index decrement " + index);
        }

        /*make a index table for decrement  */

        /*task
         * make a multiplication table of 2
         * for eg;
         * 2 x 1 +2
         * 2 x 2 =4
         * ..
         * 2 x 10 = 20
         * note: loop from 1 to 10 and multip;y the index 
         */

         for(int index = 1; index <= 10; index ++){
            System.out.println("2 x " + index + "=" + 2*index);
        }

        /*nested for loop
         * using for loop inside the scope for loop */
        for(int outer = 0; outer <2; outer++){
            for(int inner = 3; inner>0; inner --){
                System.out.println("Inner Index" + inner);
            }
            System.out.println("Outer Index "+ outer);

        }

        /*task
         * make a multiplication table like the folloeing
         * multiplication table of 10
         * 10 x 1 = 10
         * 10 x 2 = 20
         * ...
         * 10 x 10 = 100
         * multiplication table of 1
         * 1 x 1 = 1
         * 1 x 2 = 2
         * ..
         * 1 x 10 = 10
         */
        for(int outer =10; outer<=1; outer--){
            System.out.println("Multiplication of " +outer);
            for(int inner = 1; inner <= 10; inner++){
                System.out.println(outer);
                System.out.println("x");
                System.out.println(inner);
                System.out.println(" = ");
                System.out.println(inner * outer);
            }
        }
          
    }
}
