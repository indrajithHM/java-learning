class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name="phone";
    }

    public Mobile(){
        brand="";
        price=200;
    }

    void show(){
        System.out.println("brand :"+brand+" price :"+price+" name :"+name);

    }

    public static void show1(){
        System.out.println("static is called");
    }

    public static void show2(Mobile obj){
        System.out.println("brand :"+obj.brand+" price :"+obj.price+" name :"+name);
    }
}

public class Static{
    public static void main(String a[]){

        Mobile obj=new Mobile();
        obj.brand="Apple";
        obj.price=1500;

        Mobile.name="smartphone"; //static variable called

        obj.show();
        Mobile.show1();
        Mobile.show2(obj);
    }
}