package movie2;

public class Comedy extends Movie {
    protected boolean funny;

    public Comedy(String name, String director, Boolean funny) throws IllegalArgumentException{
            super(name, director);
            this.funny = funny;
    }

    //override Implementation
    public String audienceReaction(){
        return ("oooohhh, " + this.getName() + " was so funny!");
    }

    public boolean isFunny() {
        return funny;
    }

    public void setFunny(boolean funny) {
        this.funny = funny;
    }
}
