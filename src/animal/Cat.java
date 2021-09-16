package animal;

public class Cat extends Mammal{

    public Cat(String name, String species, int age, int weight){
        super(name, species,weight,age);
    }

    public void responseToCommand(String command) {
        System.out.println(this.name + "Meow... coughs up hairball...");
    }

}
