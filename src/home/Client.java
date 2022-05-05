package home;

import java.util.List;
import java.util.ArrayList;
public class Client {
    public static void main(String[] args){

        //initialization

        MovieDao movie_dao=new MovieDaoImp();
        
        
        //GETTING ALL MOVIES 

        List<Movie> movies = movie_dao.getAllMovies();
        MyUtils.log("MOVIES LOADING EVENT", "movies are being loaded....");
        for(Movie movie:movies){
            System.out.println(movie);
        }

        //ADDING NEW MOVIE

        movie_dao.addNewMovie(new Movie(10, "moon knight", 25));

        //CHECKING MOVIE

        MyUtils.log(" UPDATED MOVIES LOADING EVENT", "movies are being loaded....");
        for(Movie movie:movies){
            System.out.println(movie);
        }


        //DELETING MOVIE
        movie_dao.deleteMovie(movies.get(0));


        MyUtils.log("AFTER DELETION MOVIES LOADING EVENT", "movies are being loaded....");
        for(Movie movie:movies){
            System.out.println(movie);
        }

    }
    
    
}
