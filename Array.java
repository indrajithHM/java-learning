public class Array {
    public static void main(String[] args) {
        
        int num[]={1,2,3,4};

        int num1[]=new int[4];

        num1[0]=1;
        num1[1]=2;
        num1[2]=3;
        num1[3]=4;

        for(int i=0;i<4;i++){

            System.out.println("num["+i+"] = "+num[i]);
            System.out.println("num1["+i+"] = "+num1[i]);

        }
    }
}
