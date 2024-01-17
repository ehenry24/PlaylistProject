/**
 * File for a Song class to be used in the Playlist Project
 * @author LH, CP, and CK
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String name;
    private String artist;
    private double duration;



    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String myName, String myArtist, double myDuration){
        name = myName;
        artist = myArtist;
        duration = myDuration;
    }

     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
    public String getName(){
        return name;
    }

    public String getArtist(){
        return artist;
    }

    public double getDuration(){
        return duration;
    }

    public String toString(){
        return "Song name: "+name+", Artist name: "+artist+", Duration: "+duration;
    }
}
