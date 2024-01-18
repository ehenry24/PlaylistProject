import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist;

     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist(){
        playlist = new ArrayList<Song>();
    }

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
    public void addSong(Song newSong){
        playlist.add(newSong);
    }

    public void likeSong(int position){
        playlist.get(position).like();
    }

    public void removeSong(int position) {
        playlist.remove(position);
    }

    public ArrayList<Song> likedSongs(){
        ArrayList<Song> liked = new ArrayList<Song>();
        for(int i = 0; i<playlist.size();i++){
            if(playlist.get(i).likeStatus.equals("-- liked")){
                Song n = playlist.get(i);
                liked.add(n);
            }
        }
        return liked;
    }

    public String totalDuration(){
        int totalmin = 0;
        int totalsec = 0;
        for(int i = 0; i < playlist.size(); i++){
            totalmin += playlist.get(i).getMinutes();
            totalsec += playlist.get(i).getSeconds();
        }
        totalmin += totalsec/60;
        totalsec = totalsec % 60;
        return totalmin +":"+ totalsec;
    }

    public void removeUnlikedSongs(){
        for(int i=0; i<playlist.size(); i++){
            if(playlist.get(i).likeStatus.equals(" ")){
                playlist.remove(i);
                i--;
            }
        }
    }

    public String toString(){
        return playlist.toString();
    }

}
