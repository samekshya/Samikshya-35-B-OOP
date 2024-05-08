public class operatorsclass {
    public static void main(String[] args) {
       /*Arithematic operatords */
       int aNum1 = 10, aNum2 = 20;
       int sum = aNum1 + aNum2; //"+" is an arithematic operator 
       System.out.println("Addition is " + sum);
       System.out.println("Substraction is " + (aNum1 - aNum2));
       System.out.println("Multiplication is" + (aNum1 * aNum2));
       System.out.println("Division is "+ (aNum1/aNum2));
       System.out.println("Modulo is " + (aNum1 % aNum2));
       /*Assignment operator */
       int asNum1 = 20; // = is used to asign a value to variable 
       asNum1+=1; // same as aNum1 = asNum1 + 1 ;
       System.out.println("+= value is " + asNum1);
       System.out.println("-= value is " + (asNum1-=10));
       System.out.println("*= value is " + (asNum1 *=10));
       System.out.println("/= value is " + (aNum1/=2));
       System.out.println("%= value is " + (asNum1%=3));
       /*relational operators */
       int rNum1 = 20, rNum2 = 21;
       boolean rExpression = rNum1 == rNum2; // returns true//false
       System.out.println("Equals to " + rExpression);
       System.out.println("Greater than " + (rNum1 > rNum2));
       System.out.println("Less than " + (rNum1 < rNum2));
       System.out.println("Not equals to " +(rNum1!=rNum2) );
       System.out.println("Greater than equals to " + (rNum1>=rNum2));
       /* Logical Operator */
       int lNum1 = 20 , lNum2 = 20;
       boolean lExpression1 = lNum1 == lNum2;
       boolean lExpression2 = lNum1 > lNum2;
       System.out.println("&& is used for AND" + (lExpression1 && lExpression2));
       System.out.println("|| is used for OR" + (lExpression1 || lExpression2) );
       System.out.println("! is used for NOT" + (!lExpression1));
       /*Unary operators */
       int uNum1 = 10;
       uNum1++; // uNum1 = uNUM1 + 1; // changes value in next line 
       ++uNum1; // changes value in this same line 
       System.out.println("--uNum1 unary is " + --uNum1);
       System.out.println("uNum1-- unary is " + uNum1--);
       /*Ternary operators */
       int tNum1 = 20, tNum2= 10;
       String output;
       /*take following if else as examples
        * if(tNum1 > tNum2){
        * }else{
        *output = "False Statement";
        *}
        */
        output =  tNum1 > tNum2 ? "True Statement" :"False Stataement";
        /*Here terenary operator contains expresssion
        *if expression is true it returns after the "?"
        *if the expression is false it returns after the ":"
        */
        int intOutput = tNum1 == tNum2 ? -10 :10;
        System.out.println(output);
        System.out.println(intOutput);
       /* Task 1
       *Write a program to print wheather a variable is greater or equal to 18
       */
      int age = 20;      System.out.println("Equals to " + rExpression);

      if (age >= 18)  {
          System.out.println("The variable is greater than or equal to 18");
      } else {    
      System.out.println("The variable is less than 18.");
      }
       
       /*Task 2
        * Write a program to print simple intrest from variables
        *Make 3 variable for amount, time and rate and save the calculation into
        *Formula: si = amount * time* rate/100; // use float/double 
        */
          


        
        /*Task 3
        *WAP to print thea area and perimeter of rectangle 
        *area = length * breadth 
        * perimeter = 2 (length + breadth) 
        */
        
        /*Task 4
         * Complete the task 1 using terenary 
         */
        
    }


}
