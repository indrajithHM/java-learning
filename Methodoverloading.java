class Calculator{

    public int add(int n1,int n2){
        return(n1+n2);
    }

    public int add(int n1,int n2,int n3){
        return(n1+n2+n3);
    }

    public double add(double n1,int n2){
        return(n1+n2);
    }
}

public class Methodoverloading{
    public static void main(String[] args) {

        Calculator obj=new Calculator();
       int r1= obj.add(4, 5);
        int r2=obj.add(4,5,6);
        double r3=obj.add(4.5,6);

        System.out.println("r1 is "+r1+ " r2 is "+r2+ " r3 is "+r3);
        
    }
}