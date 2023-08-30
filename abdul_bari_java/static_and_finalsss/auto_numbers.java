package abdul_bari_java.static_and_finalsss;

import java.util.Date;

class student{
    private String rollNo;
    private static int count=1;
    public student(){
        rollNo = getrollNumbers();
    }
    private String getrollNumbers(){
        Date date = new Date();
        String roll;
        roll = "Univ-"+(date.getYear()+1900)+"-"+count;
        count++;
        return roll;
    }
    public String getRollNo(){
        return rollNo;
    }
}
public class auto_numbers {
    public static void main(String[] args) {
        int i =0;
        while(i<5){
        student student1 = new student();
        System.out.println(student1.getRollNo());
        i++;
    }
    }
}
