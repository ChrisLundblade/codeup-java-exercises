package animal;

public abstract class Mammal {
    public String name;
    public int age;
    public int weight;
    public String species;

    public void rest(int noOfHours) {
        for (int i = 0; i <= noOfHours; i += 1) {
            System.out.println("Zzzzzzz....");
        }
    }
    protected Mammal(String name, String species, int weight, int age){
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.age = age;
    }
    abstract void responseToCommand(String command);

}
