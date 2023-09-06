public class IfElse {
    public static void main(String[] args) {
        int x=6;
        int y=8;

        if(x<y){
            System.out.println("x="+x +" is smaller");
        }
        else if(x==y){
            System.out.println("x and y are equal");
        }
        else{
            System.out.println("y is "+y+" smaller");
        }
    }
}
