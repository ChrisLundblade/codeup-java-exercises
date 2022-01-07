package CodeWarsKatas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class directionsReduction {
    public static void main(String[] args) {
        String[] reducedArray = directionsReduction.reduce(new String[]{"NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"});
        for(int i = 0; i < reducedArray.length; i++){
            System.out.println(reducedArray[i]);
        }
    }

    public static String[] reduce(String[] arr){
        List<String> reductionList = new ArrayList<String>(Arrays.asList(arr));
        for(int i = 0; i < reductionList.size()-1; i++){
            if((reductionList.get(i) == "EAST" && reductionList.get(i+1)=="WEST")||(reductionList.get(i) == "WEST" && reductionList.get(i+1)=="EAST") ||(reductionList.get(i) == "SOUTH" && reductionList.get(i+1)=="NORTH")||(reductionList.get(i) == "NORTH" && reductionList.get(i+1)=="SOUTH")){
                reductionList.remove(i);
                reductionList.remove(i);
                i=-1;
            }else{

            }
        }
        String[] returnArray = new String[reductionList.size()];
        returnArray = reductionList.toArray(returnArray);
        return returnArray;
    }
}
