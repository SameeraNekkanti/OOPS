package hello_world;
class Movie {
    int rank;
    String title;
    String distributor;
    long worldwideGross;
    int rating;
    Movie(int rank, String title, String distributor, long worldwideGross) {
        this.rank = rank;
        this.title = title;
        this.distributor = distributor;
        this.worldwideGross = worldwideGross;
        this.rating=calculateRating();
    }
    private int calculateRating() {
    	if (worldwideGross > 1000000000L) {
            return 3;
        } else if (worldwideGross > 900000000L) {
            return 2;
        } else if (worldwideGross > 600000000L) {
            return 1;
        } else {
            return 0;
        }
    }
    void display() {
    	System.out.println("Rank: " + rank);
        System.out.println("Title: " + title);
        System.out.println("Distributor: " + distributor);
        System.out.println("Worldwide Gross: " + worldwideGross);
        System.out.println("Rating: " + rating);
        System.out.println("-----------------------------------");
    }
    }
public class CinemaAnalyticsDashboard {

	public static void main(String[] args) {
		//array
		Movie[] movies=new Movie[5];
		movies[0]=new Movie(1,"Inside Out 2", "Disney", 1698765616L);
		movies[1]=new Movie(2, "Deadpool & Wolverine", "Disney", 1338073645L);
		 movies[2] = new Movie(3, "Despicable Me 4", "Universal", 969126452L);
	        movies[3] = new Movie(4, "Moana 2", "Disney", 803917125L);
	        movies[4] = new Movie(5, "Dune: Part Two", "Warner Bros.", 714444358L);
	        for(Movie i:movies) {
	        	i.display();
	        
		
	        }
	}

}
