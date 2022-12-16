public class Object {
    public static void main(String[] args) {

        developer developer=new developer("Yakup",38,1238,'M');
        developer.working();
        Tester tester=new Tester("Halit",38,12321,'M');
        Student student=new Student("Ahmet",23,234,'M',"Cydeo");
        student.working();
        Teacher teacher=new Teacher("Alp",38,234234,'M');

        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(student);




    }
}
