package vehicle;

public class Truck extends Vehicle{
    public void makeNoise(){
        System.out.println("VRROOOOOooom");
    }

    public void breakingDownNoise(){
        super.makeNoise();
        System.out.println("CRRCHCK KA-CHCK");
    }
    public void alarm(){
        System.out.println("BEEEEEEEEEP... BEEEEEEEEEEEP");
    }
}
