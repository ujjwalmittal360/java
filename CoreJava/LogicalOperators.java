public class LogicalOperators {

    public static void main(String argg[]){

        int a=5;
        int b=7;

        // Logical operators are used to combine multiple conditions

        boolean c= a>3 && b<10; // true && true = true
        boolean d= a>3 || b<5; // true || false = true
        boolean e= !(a>3); // !(true) = false

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        System.out.println( a>3 && b<10);

    }
    
}
