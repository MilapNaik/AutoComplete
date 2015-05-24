import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class AutoComplete extends Trie<Object> implements IAutocomplete<Object>{
	
	public static void main(String[] args) throws IOException{
		List<String> AllWords = new ArrayList<String>();/*List of all words*/
		
		/*Store all words in dict.txt into a List*/
		String filepath = "/Users/MilapNaik/Documents/workspace/Auto-Complete/src/dictionary.txt";
		try{
			FileReader reader = new FileReader(filepath);
			BufferedReader textreader = new BufferedReader(reader);
		
			String line;
			int lines = 0;
			while ((line = textreader.readLine()) != null){
				AllWords.add(line);
				System.out.println(AllWords.get(lines));
				lines++;
				if (lines ==25)
					break;
			}
			reader.close();
			textreader.close();
		
		}	
		catch (IOException e) {
			System.out.println(e.getMessage());
		}		
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
