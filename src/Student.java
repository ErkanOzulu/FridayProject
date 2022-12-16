public class Student extends Person{
  public  String school;

    public Student(String name, int age, int id, char gender, String school) {
        super(name, age, id, gender);
        this.school = school;
    }

    @Override
    public void working() {
        System.out.println(name+" is making homework");
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                ", name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }
}
