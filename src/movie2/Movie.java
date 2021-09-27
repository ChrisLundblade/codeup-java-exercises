package movie2;

public class Movie implements Entertains{
    private String name;
    private String director;

    //implementation
    public String audienceReaction(){
        return ("oooohhh, " + this.name + " was so awesome!");
    }

    public Movie(String name, String director)throws IllegalArgumentException{
        if(name ==null || name.isBlank() || director == null || director.isBlank()){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}