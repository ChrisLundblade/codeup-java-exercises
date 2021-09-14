package movies;

public class Movie {
    private String name;
    private String category;

    Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static void soutMoviesByGenre(String category){
        for (Movie movie : MoviesArray.findAll()){
            if(movie.getCategory().equals(category)){
                System.out.println(movie.getName() + " - " + movie.getCategory());
            }
        }
        System.out.println("----END LIST----\n");
    }
}
