public class LogicalOperator {
    public static void main(String[] args) {
        int x=4;
        int y=6;
        
        int a=7;
        int b=6;

        boolean z1= a<b && x<y; //and operator returns true when both the conditions are true
        boolean z2= a<b || x<y; // or operator returns true when either of the condition is true
        boolean z3= !(a<b); //not operator returns reverse of the result
        
        System.out.println("z1 is "+z1);
        System.out.println("z2 is "+z2);
        System.out.println("z3 is "+z3);
    }
}
