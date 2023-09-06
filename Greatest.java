public class Greatest {
    public static void main(String[] args) {
        int x=8;
        int y=7;
        int z=9;

        if(x>y && x>z){
            System.out.println(x+ " is bigger");
        }

        else if(y>z){
            System.out.println(y+ " is bigger");
        }

        else
            System.out.println(z+ " is bigger");
    }
}
