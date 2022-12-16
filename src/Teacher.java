public class Teacher extends Employee {

    public Teacher(String name, int age, int id, char gender) {
        super(name, age, id, gender);
    }

    public void teach(){
        System.out.println(name+" is teaching.");
    }

    @Override
    public void working() {
        System.out.println(name+" is working.");
    }
}
