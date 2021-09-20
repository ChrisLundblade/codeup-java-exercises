import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CollectionsTest {
    /*
    Create a class called CollectionsTest and include the following...
    TODO: create a static method, omit2s, that takes in an array list of integers.
      The method should return an arraylist of integers with the same values as the
      input arraylist but without 2s.
 */
    public static ArrayList<Integer> omit2s(ArrayList<Integer> inputArr){
        ArrayList<Integer> newArray = new ArrayList<>();
        for(Integer integer : inputArr){
            if (integer!=2){
                newArray.add(integer);
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>(Arrays.asList(2,1,2,3,2,2,5,2,6,7,2,9));
        System.out.println(omit2s(myArray));

        ArrayList<String> keys = new ArrayList<>(Arrays.asList(
                "first key",
                "second key",
                "third key",
                "fourth key"
        ));

        ArrayList<String> values = new ArrayList<>(Arrays.asList(
                "first value",
                "second value",
                "third value",
                "fourth value"
        ));
        System.out.println(createMap(keys, values));
    }
/*
    TODO: create a static method, createMap, that takes in two arraylists. The method should
      return a hashmap where the keys are the elements of the first passed arraylist and are
      connected to values of the second arraylist. Assume both input arraylists are lists of
      strings. Assume the lengths of both input arraylists are the same

      EXAMPLE:

        List<String> keys = new ArrayList<>(Arrays.asList(
            "first key",
            "second key",
            "third key",
            "fourth key"
        ));

        List<String> values = new ArrayList<>(Arrays.asList(
            "first value",
            "second value",
            "third value",
            "fourth value"
        ));

        {"first key": "first value", "second key": "second value"}

 */
    public static HashMap<String, String> createMap(ArrayList<String> keyList,ArrayList<String> valueList){
        HashMap<String, String> newMap = new HashMap<>();
        for(int i = 0; i < keyList.size(); i++){
            newMap.put(keyList.get(i),valueList.get(i));
        }
        return newMap;
    }
}
