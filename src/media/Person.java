package media;

public abstract class Person {
    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello, " + this.name + ".");
    }

    public Person(String name){
        this.setName(name);
    }


}
