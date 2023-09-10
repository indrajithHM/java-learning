class Student{
    int rollno;
    String name;
}

public class Arrayobjects {

    public static void main(String[] args) {
         Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();

        s1.rollno=123;
        s1.name="Ram";

        s2.rollno=124;
        s2.name="Raj";

        s3.rollno=125;
        s3.name="Taj";

        Student students[]=new Student[3];

        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].rollno+":" +students[i].name);

        }

        //enhanced for loop

        for(Student stud : students){
            System.out.println(stud.name+ ": "+stud.rollno);
        }
        
    }
   
    
}
