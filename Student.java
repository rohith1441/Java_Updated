public class Student {
    private String name;
    private int age;
    private String Address;

    public Student(String name, int age, String Address) {
        this.name = name;
        this.age = age;
        this.Address = Address;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Student student1 = new Student("rohith",25, "5232 Laurelwood");
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getAddress());

    }
}