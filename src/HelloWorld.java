public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");
//        Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//        Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//        Change your code to assign a character value to myString. What do you notice?
//
//        Change your code to assign the value 3.14159 to myString. What happens?
//
//        Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//
//        Change your code to assign the value 3.14 to myNumber. What do you notice?
//
//        Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//
//        Change your code to assign the value 123 to myNumber.
//
//        Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
//
//                Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        int myFavoriteNumber = 210;

        //String myString = "It smells like updog in here";
        String myString = "F"; //if I use single quotes here it shows an error

        System.out.println(myString);

        myString = "3.14159"; //quotes necessary or else it won't compile
        System.out.println(myString);

        System.out.println(myFavoriteNumber);
        //myString = 'F';
        System.out.println(myFavoriteNumber);

        //long myNumber = 3.14; //3.14 is type double so this doesn't work. long doesn't handle decimals
        long myNumber = 123L; //What the heck, that's wild that the output ignores the "L". I've done some Java before and didn't know about this.
        System.out.println(myNumber);
        System.out.println(++myNumber);

        //float myNumber = 3.14; //it doesn't like the variable re-declaration

        //Copy and paste the following code blocks one at a time and execute them
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        //What is the difference between the above code blocks? Explain why the code outputs what it does.
        //++x increments before printing and x++ increments after printing

//        Try to create a variable named class. What happens?
        //String class = "Jeff"; //This no work bc class is a SPECIAL word
//        Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o; //java.lang.String cannot be cast to class java.lang.Integer

        System.out.println("String " + theNumberThree);
        System.out.println("Object " + o);
//        System.out.println("int " + three);
        //Copy and paste the code above and then run it. Does the result match with your expectation?

                //How is the above example different from the code block below?

//        int three = (int) "three"; //Inconvertible type

//        What are the two different types of errors we are observing? Casting objects to int is evidently allowed but the string inside it still can't be type int
//          The former error was a class cast exception. The latter
//
//                Rewrite the following expressions using the relevant shorthand assignment operators:
//
        int x = 4;
        x += 5;
        System.out.println(x);
        x = 3;
        int y = 4;
        y *= x;

        System.out.println("X: " + x);
        System.out.println("Y: " + y);

        x = 10;
        y = 2;
        x /= y;
        y -= x;

        System.out.println("X: " + x);
        System.out.println("Y: " + y);

//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//        short notSmallNumber = 236649; //integer number too large
//        short notSmallNumber = (int) 236649; //still to beeeg
//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.


    }
}
