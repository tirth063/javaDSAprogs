package OOPS.Basic;

import java.util.Arrays;

public class advance {
    public static void main(String[] args) {
        Holiday[] holidays = new Holiday[3];
        holidays[0] = new Holiday("New Year", 1, "January");
        holidays[1] = new Holiday("Independence Day", 4, "July");
        holidays[2] = new Holiday("Christmas", 25, "December");


       boolean isSame= Holiday.inSameMonth(holidays[0],holidays[2]);
        System.out.println("IS SAME IS:"+isSame);
       double avg = Holiday.avgDate(holidays);
        System.out.println("AVG HOLIDAYS" + avg);


        Movie[] movies = new Movie[10];
        movies[0] = new Movie("The Shawshank Redemption", "Castle Rock Entertainment", "1 star");
        movies[1] = new Movie("Inception", "Warner Bros. Pictures", "2 star");
        movies[2] = new Movie("The Godfather", "Paramount Pictures", "3 star");
        movies[3] =new Movie("DUNE","Hollywood");
        movies[5] = new Movie("The Matrix", "Warner Bros. Pictures", "4 star");
        movies[6] = new Movie("The Dark Knight", "Warner Bros. Pictures", "5 star");
        movies[7] = new Movie("Interstellar", "Paramount Pictures", "5 star");
        movies[8] = new Movie("The Godfather: Part II", "Paramount Pictures", "5 star");
        movies[9] = new Movie("The Lord of the Rings: The Return of the King", "Warner Bros. Pictures", "5 star");
        movies[4] = new Movie("SHOLE","BOLLYWOOD");


        Movie[] m = Movie.get5StarMovies(movies);

        for (int i = 0; i < m.length; i++) {
           m[i].printData();
        }

    }
}

   class Holiday{
    String name ,month;
    int day;
    Holiday(String name ,int day,String month){
        this.name = name;
        this.day =day;
        this.month = month;
    }

    public static boolean inSameMonth(Holiday h1 ,Holiday h2){
        return h1.month.equals(h2.month);
    }

       public static double avgDate(Holiday[] h1){
        int total=0;
           for (Holiday holiday : h1) {
               total += holiday.day;
           }
        return ((double) total / h1.length);
    }
}

class Movie {
    private final String title;
    private final String studio;
    private final String rating;

    Movie(String title,
    String studio,
    String rating){

        this.title =title;
        this.studio = studio;
        this.rating = rating;

    }

    Movie(String title,
          String studio){

        this.title =title;
        this.studio = studio;
        this.rating ="5 star";

    }

    void printData(){
        System.out.println(title);
        System.out.println(studio);
        System.out.println(rating);
        System.out.println();
        System.out.println();
    }
    public static Movie[] get5StarMovies(Movie[] m){
        Movie[] m3 = new Movie[m.length];
        int j=0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] != null && "5 star".equals(m[i].rating)) {
                m3[j++] = m[i];
            }
        }
        return Arrays.copyOf(m3, j);
    }
}
