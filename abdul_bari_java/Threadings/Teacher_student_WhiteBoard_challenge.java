package abdul_bari_java.Threadings;

import sun.security.acl.WorldGroupImpl;

class WhiteBorad{
    String text;
    int students=0;
    int count=0;
    public void attendance(){
        students++;
    }
    synchronized public void write(String msg){
        System.out.println("Teacher is writing: "+msg);
        while(count!=0){
            try{wait();}catch (Exception e){}
        }
        text = msg;
        count = students;
        notifyAll();
    }
    synchronized public String read(){
        while (count==0){
            try{wait();}catch (Exception e){}
        }
        String t = text;
        count--;
        if(count==0)
            notify();
        return t;
    }
}

class Teacher extends Thread{
    WhiteBorad whiteBorad;
    String[] notes ={"It supports every OOP concept", "such as Abstraction", "Encapsulation", "Inheritance", "and Polymorphism","end"};
    public Teacher(WhiteBorad w){
        whiteBorad=w;
    }

    @Override
    public void run() {
        for(int i=0;i<notes.length;i++){
            whiteBorad.write(notes[i]);
        }
    }
}
class Student extends Thread{
    String name;
    WhiteBorad whiteBorad;
    public Student(String n,WhiteBorad w){
        name=n;
        whiteBorad=w;
    }

    @Override
    public void run() {
        String text;
        whiteBorad.attendance();
        do{
            text=whiteBorad.read();
            System.out.println(name + "Reading "+text);
            System.out.flush();
    }while(!"end".equals(text));
    }
}
public class Teacher_student_WhiteBoard_challenge {
    public static void main(String[] args) {
        WhiteBorad wb = new WhiteBorad();
        Teacher t = new Teacher(wb);
        Student s1 = new Student("1. John",wb);
        Student s2 = new Student("2. Johny",wb);
        Student s3 = new Student("3. Johnny",wb);
        Student s4 = new Student("4. Johnnny",wb);
        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
