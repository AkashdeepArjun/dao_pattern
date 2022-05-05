package home;
import java.util.List;
public interface MovieDao {

    List<Movie> getAllMovies();
    Movie getMovieById(int id);
    Movie getMovieByTitle(String title);
    void deleteMovie(Movie movie);
    void addNewMovie(Movie newMovie);
    
}
