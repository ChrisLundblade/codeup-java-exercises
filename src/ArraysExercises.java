import java.util.Arrays;

public class ArraysExercises {
//  Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
    public static Person[] addPerson(Person[] personArray, Person personToAdd){
        Person[] newArray = Arrays.copyOf(personArray, personArray.length+1);

        newArray[newArray.length-1] = personToAdd;
        return newArray;
    }

    public static void printNames (Person[] inputArr){
        for (Person person : inputArr){
            System.out.println(person.name);
        }
    }

    public static void main(String[] args) {
//        What happens when you run the following code? Why is Arrays.toString necessary?
//              it prints the array reference
//
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.

        Person[] personArray = {new Person("Jeff"),new Person("Joni"),new Person("Iosif")};

        ArraysExercises.printNames(personArray);

        ArraysExercises.printNames(addPerson(personArray, new Person("Alyosha")));


    }
}
