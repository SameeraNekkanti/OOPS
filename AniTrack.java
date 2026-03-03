package hello_world;
import java.util.Scanner;
class Anime {
    String title;
    String studio;
    int episodesWatched;
    double rating;
    
    Anime(String title, String studio, int episodesWatched, double rating) {
        this.title = title;
        this.studio = studio;
        this.episodesWatched = episodesWatched;
        this.rating = rating;
    }
    

    }
public class AniTrack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("How many anime entries? ");
        int n = sc.nextInt();
        
        
        Anime[] watchlist=new Anime[n];
        for(int i=0;i<n;i++) {
        	 System.out.println("\nEntering details for Anime #" + (i + 1));
        	 System.out.print("Title: ");
             String title = sc.nextLine();

             System.out.print("Studio: ");
             String studio = sc.nextLine();

             System.out.print("Episodes Watched: ");
             int episodes = sc.nextInt();

             System.out.print("Your Rating (1.0 - 10.0): ");
             double rating = sc.nextDouble();
             sc.nextLine();
             
        	watchlist[i]=new Anime(title, studio, episodes, rating);
        }
        System.out.println("TITLE                | STUDIO           | EPISODES | RATING");
        
        Anime max=watchlist[0];
        Anime min=watchlist[0];
        for(int i=0;i<n;i++) {
        	System.out.println(watchlist[i].title);
        	System.out.println(watchlist[i].studio);
        	System.out.println(watchlist[i].episodesWatched);
        	
        	
        	if(watchlist[i].episodesWatched>max.episodesWatched) {
        		max=watchlist[i];
        		
        	}
        	if(watchlist[i].episodesWatched<min.episodesWatched) {
        		min=watchlist[i];
        		
        	}
        }
        System.out.println("Maximum number of episodes watched is for " + max.title);
        System.out.println("Minimum number of episodes watched is for " + min.title);
        sc.close();
        

	}

}
