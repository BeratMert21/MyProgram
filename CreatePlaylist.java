package lab3;


import java.util.Scanner;
public class CreatePlaylist {
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of playlists:");
	int playlists = scan.nextInt();
	
	
	int number = 1;
	Playlist playlist1 = new Playlist();
	playlist1.playlist_name();
	int x = (int)playlist1.addSong(number) - 50;
    double rating1 =  playlist1.changeRating(1);
    rating1 = (rating1 + 0.7);
    System.out.println(playlist1.toString());
    System.out.println("");
    
    int number2 = 1;
	Playlist playlist2 = new Playlist();
	playlist2.playlist_name();
	int y = (int)playlist1.addSong(number2);
    double rating2 =  playlist2.changeRating(1);
    y = y - 100;
    System.out.println(playlist2.toString());
    System.out.println("");
    
    int number3 = 1;
	Playlist playlist3 = new Playlist();
	playlist3.playlist_name();
	int z = (int)playlist3.addSong(number);
    double rating3 =  playlist3.changeRating(1);
    rating3 = (rating3 - 0.3);
    System.out.println(playlist3.toString());
    System.out.println("");
    
    
    System.out.println("Playlist rock has "+x+" songs and "+rating1+" rating");
    System.out.println("Playlist pop has "+y+" songs and "+rating2+" rating");
    System.out.println("Playlist rap has "+z+" songs and "+rating3+" rating");
    
   
  
  
    
    
  
    
    
}
}
