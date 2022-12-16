public class Person {

    public String name, jobTitle;
    public int age, id;
    public char gender;

    public Person(String name, int age, int id, char gender) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = gender;

    }

    public void eat(){
        System.out.println(jobTitle+" "+name+" is eating hamburger.");
    }
    public void working () {
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }
}


