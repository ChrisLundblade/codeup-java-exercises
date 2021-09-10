public class Fighter {
    public String name;
    public int hitPoints;
    public int maxDamage;

    public void printStats(){
        System.out.println(name + " has " + hitPoints + " and can do " + maxDamage + " damage.");
    }
}
