/* 0.5 Import File class */
import java.io.File;
import java.io.FileNotFoundException;
/* 0.75 Import Scanner class */
import java.util.Scanner;

import java.util.ArrayList;

/**
 * Driver class to demonstrate CSV File Parsing
 * @author Luke Hindman
 */
public class CSVParser {

	public static void main(String[] args) {

		ArrayList<Song> myPlaylist = new ArrayList<Song>();

		/* 1. Create a new File object */
		File bobsFile = new File("jimmy_buffett-collection.csv");

		/* 1.5 Check if file exists */
		if (bobsFile.exists() && bobsFile.isFile()) {

			/* 2. Create a Scanner to read the file */
			try {
				Scanner fileScanner = new Scanner(bobsFile);

				/* 3. Create a loop to read each line from the Scanner */
				while(fileScanner.hasNextLine()) {
					String line = fileScanner.nextLine();
					Song currentSong = new Song(line);
					myPlaylist.add(currentSong);
				}

				/* Done Processing the file, so close the file Scanner to release the resources */
				fileScanner.close();

			} catch (FileNotFoundException e) {
				System.out.println("Unable to open file: " + bobsFile);
				System.exit(1);
			}

		} else {
			System.out.println("Unable to open file: " + bobsFile);
			System.exit(1);
		}


		/* Done loading data, now print the playlist */
		for (Song s: myPlaylist) {
			System.out.println(s);
		}

		System.out.println("The total number of songs is: " + myPlaylist.size());


	}

}
