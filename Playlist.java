package lab3;
import java.util.Scanner;

public class Playlist {
    private String name;
    private double rating;
    private int Numberofsongs;
    
    public String playlist_name() {
    	System.out.println("Please enter the name of the playlist:");
    	Scanner scan = new Scanner(System.in);
    	name = scan.next();
    	return name;
    }
    
    

    public int removeSong(int num) {
    	System.out.println("How many song do you want to remove?");
    	Scanner scan = new Scanner(System.in);
    	num = scan.nextInt();
    	num = Numberofsongs - num;
    	return num;
    }
    
    public int addSong(int num) {
    	System.out.println("How many song do you want to add?");
        Scanner scan = new Scanner(System.in);
        Numberofsongs = scan.nextInt();
        num = Numberofsongs;
        return num;
    }

    public String toString() {
        return "Playlist " + name + " has " + Numberofsongs + " songs and the playlist rating is " + this.rating;
    }

    public double changeRating(double rating) {
        System.out.println("Enter new rating:");
        Scanner scan = new Scanner(System.in);
        this.rating = scan.nextDouble();
        rating = this.rating;
        return rating;
    }


}
