public class Tester extends Employee{


    public Tester(String name, int age, int id, char gender) {
        super(name, age, id, gender);
    }

    public void createTicket(){
        System.out.println(jobTitle+" "+name+" is creating ticket");
    }

}
