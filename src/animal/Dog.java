package animal;

public class Dog extends Mammal{
    public Dog(String name, String species, int age, int weight){
        super(name, species,weight,age);
    }

    public void responseToCommand(String command) {
        System.out.println(this.name + "Obeys " + command + " dutifully...");
    }

}
