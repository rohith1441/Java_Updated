package abdul_bari_java;

public class student_clas {
    String roll;
    String name;
    String course;
    double m1,m2,m3;
    public double total(){
        return m1+m2+m3;
    }
    public double average(){
        return (m1+m2+m3)/3;
    }
    public String grade(){
        System.out.println("Name is: " + name);
        System.out.println("Roll: "+ roll);
        System.out.println("Course: "+course);
        String grade_1;
        if(total()>70.0){
            grade_1 = "A";
        } else if (total()<70.0 && total()>60) {
            grade_1="B";

        }
        else{
            grade_1="F";
        }
        return grade_1;
    }

    public static void main(String[] args) {
        student_clas student = new student_clas();
        student.name = "Rohith";
        student.roll ="5B8";
        student.m1 = 0.3;
        student.m2 = 34;
        student.m3=34;
        student.course="CSE";
        System.out.println("Total is: "+student.total());
        System.out.println("Average is: "+student.average());
        System.out.println("Grade is: "+student.grade());
    }
}
