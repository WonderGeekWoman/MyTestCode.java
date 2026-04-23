import java.util.Scanner;

public class Song {
    /* Instance variables  */

    private String artist;
    private String album;
    private String title;
    private int duration;

    /* Constructor */
    public Song(String artist, String album, String title, int duration) {
        this.artist = artist;
        this.album = album;
        this.title = title;
        this.duration = duration;
    }

    /**
     * This constructor takes a single line of CSV formatted song date,
     *   extracts those individual values, and assigns those values to the
     *   internal instance variables;
     */
    public Song(String line) {
        /* 5. Print out each word on its own line */
        Scanner lineScanner = new Scanner (line);
        lineScanner.useDelimiter(",");

        /* 6. Extract the individual fields from each line */
        this.artist = lineScanner.next();
        this.album = lineScanner.next();
        this.title = lineScanner.next();
        this.duration = lineScanner.nextInt();

        lineScanner.close();
    }


    /* Other methods */

    public String toString() {
        String output = "";

        output += "**************************\n";
		output += "Artist:" + artist + "\n";
		output += "Album:" + album + "\n";
		output += "Title: " + title + "\n";
		output += "Duration: " + duration + "\n";
		output += "**************************" + "\n";

        return output;
    }
}
