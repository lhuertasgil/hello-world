import java.util.Scanner;
import java.util.HashSet;
import java.util.Set; 
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

public class DuplicateRemover {
	
	private Set<String> uniqueWords;
	
	public DuplicateRemover() {
		
		uniqueWords = new HashSet<>();
		
	} //end of duplicateRemover

	public void remove(String dataFile) {
		
		try { //Try|Catch w3schools.com
			Scanner scan = new Scanner(new File(dataFile));
			
			while (scan.hasNext()) {
				
				uniqueWords.add(scan.next());
				
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
			
		}
		
	} //end of remove
	
	public void write(String outputFile) {
		
		try { //Try|Catch w3schools.com 
			PrintWrite pt = new PrintWriter(new File(outputFile));
			
			for (String string : uniqueWords) {
				pt.println(string);
			}
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
		}
		
	} //end of write
	
} //end of duplicateRemover
