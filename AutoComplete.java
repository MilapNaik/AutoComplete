import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class AutoComplete extends Trie<Object> implements IAutocomplete<Object>{
	
	public List<String> AllWords;/*List of all words*/
	public static String path;
	
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		
		/*Store all words in dict.txt into a List*/
		path = "/Users/MilapNaik/Documents/workspace/Auto-Complete/src/dictionary.txt";
		try{
		FileReader reader = new FileReader(path);
		BufferedReader textreader = new BufferedReader(reader);
		
		//String line;
		int lines = 0;
		while (textreader.readLine() != null){
			lines++;
			System.out.println("lines");
			if (lines ==25)
				break;
		}
		reader.close();
		textreader.close();
		
		}	
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		/*Close files*/
		input.close();
		
	}

	
	public static void getCandidates(){
		
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List getCandidates(String prefix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pickCandidate(String prefix, String candidate) {
		// TODO Auto-generated method stub
		
	}
}
