package home;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MovieDaoImp  implements MovieDao{

    private List<Movie> movies;
    public MovieDaoImp(){
        this.movies= new ArrayList<Movie>();
        loadMovies();
    }

    @Override
    public void deleteMovie(Movie movie) {
       
        this.movies.remove(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        
        return this.movies;
    }


    @Override
    public Movie getMovieById(int id) {
        Movie required_movie=null;
        Iterator<Movie> iterator = this.movies.iterator();
        while(iterator.hasNext()){
            Movie movie= iterator.next();
            if(movie.getId()==id){
                required_movie=movie;
                break;
            }
        }
        return required_movie;
        
    }

    @Override
    public Movie getMovieByTitle(String title) {
       
        Movie required_movie=null;
        Iterator<Movie> iterator = this.movies.iterator();
        while(iterator.hasNext()){
            Movie movie= iterator.next();
            if(movie.getTitle().equalsIgnoreCase(title)){
                required_movie=movie;
                break;
            }
        }
        return required_movie;
    }

    @Override
    public void addNewMovie(Movie newMovie) {
        this.movies.add(newMovie);
        
    }

    public void loadMovies(){
        this.movies.add(new Movie(1,"DR STRANGE", 2));
        this.movies.add(new Movie(2,"SPIDERMAN NO WAY HOME", 4));
        this.movies.add(new Movie(3,"ALIEN 1979", 8));
        this.movies.add(new Movie(4,"ALIENS 1986", 10));
        this.movies.add(new Movie(5,"PREDATOR 1987", 10));
        this.movies.add(new Movie(6,"PREDATOR 2", 9));
        this.movies.add(new Movie(7,"PREDATORS 2010", 12));
        this.movies.add(new Movie(8,"AVP 2010", 14));
        this.movies.add(new Movie(9,"AVPR", 4));
        


        



    }
}
