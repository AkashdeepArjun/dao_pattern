package home;
public class Movie{
    
    private int movie_id;
    private String title;
    private int rating;

    public Movie(int movie_id,String title,int rating){
        this.movie_id=movie_id;
        this.title=title;
        this.rating=rating;
    }


    public String getTitle(){return this.title;}
    public int getRating(){return this.rating;}
    public int getId(){return this.movie_id;}

   
    @Override
    public String toString() {
        
        return "MOVIE:"+this.title+" RATING: "+String.valueOf(this.rating);
    }
}