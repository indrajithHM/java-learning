public class Newswitch{
    public static void main(String[] args) {
        String day="Monday";
        String result="";
        String result1="";

        result=switch(day){
            case "Sunday","Saturday"->"8am";
            case "Monday"->"7am";
            default->"6am";
        };
        System.out.println(result);

        //same using other syntax

        result1=switch(day){
            case "Sunday","Saturday":yield "8am";  //instead of using break we can use yield
            case "Monday":yield "7am";
            default:yield "6am";
        };
        System.out.println(result1);
    }
}