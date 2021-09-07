public class ComputePI {
    public static void main(String[] args) {
        //try the Nilikantha series: π = 3 + 4/(2*3*4) - 4/(4*5*6) + 4/(6*7*8) - 4/(8*9*10) + 4/(10*11*12) - 4/(12*13*14) ...
        //For this formula, take three and start alternating between adding and subtracting fractions with numerators of 4 and denominators that are the product of three consecutive integers which increase with every new iteration. Each subsequent fraction begins its set of integers with the highest one used in the previous fraction. Carry this out even a few times and the results get fairly close to pi.

        float numberThatApprochesPI = 3;
        float closestToPIYet = 3;
        for (float i = 2; i < 28; i+=4){
            //first add
            numberThatApprochesPI = numberThatApprochesPI + (4/(i * i+1 * i+2));
            //System.out.println(numberThatApprochesPI);
            if(Math.abs(Math.PI - numberThatApprochesPI) < Math.abs(Math.PI-closestToPIYet)){
                closestToPIYet = numberThatApprochesPI;
                System.out.println(closestToPIYet);
            }


            //then subtract
            numberThatApprochesPI = numberThatApprochesPI - (4/(i+2 * i+3 * i+4));
            //System.out.println(numberThatApprochesPI);
            if(Math.abs(Math.PI - numberThatApprochesPI) < Math.abs(Math.PI-closestToPIYet)){
                closestToPIYet = numberThatApprochesPI;
                System.out.println(closestToPIYet);
            }

        }
    }
}
