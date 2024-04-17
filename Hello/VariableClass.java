public class VariableClass {
    /*Instance variable
     * Access with object
     * Is not shared with other object
     */
    int instanceVariable = 120;
    /*Static variable
     * Access with class
     * Is shared with other objects
     */
    static int staticVariable = 2000;

    public static void main(String[] args) {
        /*Non primitive data type  */
        /*Declaration */
        byte bytevalue;
        /*Initialization  */
        bytevalue = 10;
        /*Declartion and initialization  */
        short shortValue = 100;
        /*Multiple Declartion  */
        int intValue1, intValue2;
        /*Multiple Initialization */
        intValue1 = -99; intValue2 = 99;
        /*Mu;tiple Declaration and Initilaization  */
        long longValue1 = -99, longValue2 = 999;
        float floatValue = 1.90f; // the letter 'f' is required 
        double doubleValue = 28.88d; //the letter 'd' is required
        char charValue = 'C' ; // single letter in single quote
        boolean boolValue = false; // true/false lowercase
        
        /*Non primitive Data type  */
        /*String */
        String stringInfo1 = "This is a variable ";
        /*Using Class */
        String StringInfo2 = new String("Class");
        /*Object use the same class as written above  */
        VariableClass variableObj = new VariableClass();
        
        
        /*Illegal actions following */
        /* byte byteValue = 10;// you cannot redeclare */
        /*byteValue = 20: //instead reassign */
        /* boolean voolVal3 = 'false';// wrong data type
        *short shortVal = 10000000;// cannot exceed min/max
        */ 
        /*We need to use objects to access instance variable*/ 
         System.out.println(variableObj.instanceVariable);
        /* We can access the static variable with class */
        System.out.println(VariableClass.staticVariable);
        /* Type casting */
        /* Implicit type casting (automatic)
         * From smaller type to larger type */
         int intValueConveter = 10;
         double intValueConvertedToDouble = intValueConveter;
         /*Explicit type casting (manuual)
          * From larger type to smaller type*/
          double doubleValueConvert = 19.23d;
          int doubleValueConvertedToInt = (int) doubleValueConvert;
          
    }
}
