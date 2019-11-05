import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class DuplicateCounter {

	private int wordCounter;
	private Map<String, Integer> countWords;
	
	public DuplicateCounter() {
		
		this.countWords = new HashMap<String, Integer>();
	
	} //end of duplicateCounter
	
	public void count(String dataFile) throws FileNotFoundException {
		
		Scanner input = new Scanner(new File(dataFile));
		
		while (input.hasNext()) {
			
			String word = input.next();
			Integer count = countWords.get(word);
			wordCounter++;
			
			if (count != NULL) {
				count = count + 1; 
			}
			else {
				count = 1;
			}
			countWords.put(word,  count);
		} //end of while
		
	} //end of count
	
	public void write(String outputFile) throws IOException {
	
		FileWriter fw = new FileWriter(new File(outputFile));
		
		for (Entry<String, Integer> entry : countWords.entrySet());
		fw.write(entry.getKey() + "" + entry.getValue() + "\n");
		
	} //end of write

} //end of class 


