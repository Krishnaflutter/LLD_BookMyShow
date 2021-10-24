public class Movie {
    private String name;
    private double rating;
    private Genre genre;
    private Language language;

    public Movie(String name , double rating , Genre genre , Language language){
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.language = language;
    }

    // Adding getter Methods to the class
    public String getName(){
        return this.name;
    }

    public double getRating(){
        return this.rating;
    }

    public Language getLanguage(){
        return this.language;
    }

    public Genre getGenre(){
        return this.genre;
    }

    // Rating is something that can change during with time so we can have a setter for rating
    public void setRating(double rating) {
        this.rating = rating;
    }
}
