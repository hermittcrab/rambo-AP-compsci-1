package pkg;

public class Movie{
    String movieName;
    double rating;
    int numRating;
    int revenue;

public Movie(){
    movieName = "Avengers";
    rating = 8.0;
    numRating = 33;
    revenue = 623357910;
}

public Movie(String movieName, double rating, int numRating, int revenue){
    this.movieName = movieName;
    this.rating = rating;
    this.numRating = numRating;
    this.revenue = revenue;
}

public String getMovieName(){
    return movieName;
}
public double getRating(){
    return rating;
}
public int getNumRat(){
    return numRating;
}
public int getRevenue(){
    return revenue;
}

public double addRating(double add){
    numRating = numRating + 1;
    rating = numRating * rating;
    rating = rating + add;
    rating = rating/numRating;
    return rating;
    
}


public void movieToString(){
    System.out.println("Movie: " + movieName);
    System.out.println("Rating: " + rating);
    System.out.println("Number of Ratings: " + numRating);
    System.out.println("Revenue: " + revenue);
}

public boolean compareRatings(Movie a){
   return this.rating > a.getRating();
    }
    
    
    
public String revenueToString(){
    int a = (int)(revenue/1000000000);
    int b = revenue - (a*1000000000);
    int c = int(b/1000);
    int d = 
}
    
}





