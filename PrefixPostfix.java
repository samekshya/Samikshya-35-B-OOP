public class PrefixPostfix {
    public static void main(String[] args){
        int prefixValue = 10;
        System.out.println("Prefix will update here " + ++prefixValue);
        System.out.println("It will remain the same"+ prefixValue);
        /* Prefix is when you put operator in the left side of value/var */

        int postFixValue = 20;
        System.out.println("Postfix value will not update here " + postFixValue++);
        System.out.println("It will update here " + postFixValue);
        /*posstfix is when you put operatoe in the right side  */
        
    }
}
