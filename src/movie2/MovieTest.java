package movie2;



public class MovieTest {
    public static void main(String[] args) {
        Comedy comedy = new Comedy("Paul Blart: Mall Cop", "BadDirectorProbably", false);
        System.out.println(comedy.getName() + " by " + comedy.getDirector() + " isFunny: " + comedy.isFunny());

        //Movie nuMovie = new Movie(null,null);
        System.out.println(comedy.audienceReaction());

        Movie genericMovie = new Movie("Generic Movie", "Jeff");
        System.out.println(genericMovie.audienceReaction());
    }


}
