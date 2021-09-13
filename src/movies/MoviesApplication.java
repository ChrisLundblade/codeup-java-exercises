package movies;
import util.Input;
public class MoviesApplication {

    public static void main(String[] args) {
        Input input = new Input();
        boolean quit = false;
        while (!quit){
            System.out.println("What would you like to do?\n");
            System.out.println("1 - exit\n2 - view all movies\n3 - view movies in the animated category\n" +
                    "4 - view movies in the drama category\n" +
                    "5 - view movies in the horror category\n" +
                    "6 - view movies in the scifi category\n");
            switch(input.getInt(0,7)){
                case (1):
                    quit = true;
                    System.out.println("Thanks for using the Movies Application.\nShutting down, now.");
                    break;
                case (2):
                    for (Movie movie : MoviesArray.findAll()){
                        System.out.println(movie.getName() + " - " + movie.getCategory());
                    }
                    System.out.println("----END LIST----\n");
                    break;
                case (3):
                    for (Movie movie : MoviesArray.findAll()){
                        if(movie.getCategory().equals("animated")){
                            System.out.println(movie.getName() + " - " + movie.getCategory());
                        }
                    }
                    System.out.println("----END LIST----\n");
                    break;
                case (4):
                    for (Movie movie : MoviesArray.findAll()){
                        if(movie.getCategory().equals("drama")){
                            System.out.println(movie.getName() + " - " + movie.getCategory());
                        }
                    }
                    System.out.println("----END LIST----\n");
                    break;
                case (5):
                    for (Movie movie : MoviesArray.findAll()){
                        if(movie.getCategory().equals("horror")){
                            System.out.println(movie.getName() + " - " + movie.getCategory());
                        }
                    }
                    System.out.println("----END LIST----\n");
                    break;
                case (6):
                    for (Movie movie : MoviesArray.findAll()){
                        if(movie.getCategory().equals("scifi")){
                            System.out.println(movie.getName() + " - " + movie.getCategory());
                        }
                    }
                    System.out.println("----END LIST----\n");
                    break;
            }
        }


    }
}
