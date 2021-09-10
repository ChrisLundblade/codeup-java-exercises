public class Person {
    public String name;

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + this.name + ".");
    }

    public Person(String name){
        this.setName(name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("jeff");
        System.out.println(person1.name);
        person1.setName("notJeff");
        System.out.println(person1.name);
    }
}
