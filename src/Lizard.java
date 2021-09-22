public class Lizard {
    private String name;
    public Lizard(String name) throws IllegalArgumentException{
        if(name == null || name == "\n" || name.isBlank()){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public static void main(String[] args) {
        try{
            Lizard lizard = new Lizard(null);
            System.out.println(lizard.getName());
        } catch (IllegalArgumentException iae){
            System.out.println(iae);
            System.out.println("You actually need to enter something for the name, dude.");
            iae.getMessage();

        }
    }
}
