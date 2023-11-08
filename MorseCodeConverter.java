import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Talia
 *
 */
public class MorseCodeConverter {
	static MorseCodeTree mcodetree = new MorseCodeTree();
	
	/**
	 * constructor
	 */
	public MorseCodeConverter() {
		
	}
	/**
	 * returns a string with all the data in the tree in LNR order with an space in between them. Uses the toArrayList method in MorseCodeTree
	 * @return
	 */
	public static String printTree(){
		
		String x = "";
		ArrayList<String> arra = mcodetree.toArrayList();
		for(String s:arra) {
			x += s+" ";
		}
		return x.trim();
		} 
	

	/**
	 * Converts Morse code into English.
	 * @param code
	 * @return
	 */
	
	public static String convertToEnglish(String code) {
	    String[] word = code.split(" / ");
	    String Converts = "";
	    for(String s : word) {
	        String[] str = s.split(" ");
	        for(String d : str) {
	            Converts += mcodetree.fetch(d);
	        }
	        Converts += " ";
	    }
	    return Converts.trim();
	}
	
	/**
	 * Converts a file of Morse code into English
	 * @param codeFile
	 * @return
	 * @throws FileNotFoundException
	 */
	public static String convertToEnglish (File codeFile) throws FileNotFoundException {
		Scanner s = new Scanner(codeFile);
		String st ="";
		
		while(s.hasNextLine()) {
			st += s.nextLine() + "\n";
		}
		s.close();
		return convertToEnglish(st.trim());
	}

}