/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist CCLplaylist = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        CCLplaylist.addSong(new Song("Boyfriend", "Justin Bieber", 51, 2));
        CCLplaylist.addSong(new Song("Nikes", "Frank Ocean", 14, 5));
        CCLplaylist.addSong(new Song("NASA", "Ariana Grande", 3, 3));
        CCLplaylist.addSong(new Song("FTCU", "Nicki Minaj", 52, 2));
        CCLplaylist.addSong(new Song("Deli", "Ice Spice", 7,2));
        CCLplaylist.addSong(new Song("Garden (Say It Like Dat)", "SZA", 28, 3));
        CCLplaylist.addSong(new Song("MAMMAMIA","Maneskin", 18, 3));


        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        System.out.println(CCLplaylist.toString());

        System.out.println("\nLiking the songs in position 3, 4, 5, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        CCLplaylist.likeSong(3);
        CCLplaylist.likeSong(4);
        CCLplaylist.likeSong(5);

        System.out.println("Printing the songs...\n");
        System.out.println(CCLplaylist.toString());

        System.out.println("\nRemoving the song in position 0, 1, 2, etc...\n");
        CCLplaylist.removeSong(0);
        CCLplaylist.removeSong(1);
        CCLplaylist.removeSong(2);

        System.out.println("Printing the songs...\n");
        System.out.println(CCLplaylist.toString());

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        CCLplaylist.removeUnlikedSongs();
        System.out.println(CCLplaylist.toString());

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        System.out.println(CCLplaylist.totalDuration());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        CCLplaylist.removeUnlikedSongs();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        System.out.println(CCLplaylist.toString());
    }
}
