public class Teacher extends Employee {

    public Teacher(String name, int age, int id, char gender) {
        super(name, age, id, gender);
    }

    public void teach(){
        System.out.println(" is teaching.");
    }

}
