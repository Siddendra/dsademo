import java.io.*;
import java.util.*;

/**
 * Input: Path of text file, list of words to search.
 * Output: The number of instances of each word in the list in the text file.
 *
 * Given a path to a text file and a list of words, return the count of each word in the list in the text file.
 *
 *
 * func countOccurences(filePath string, []string wordsToSearch) map[string] int {
 * }
 */

public class FindingWordCount {

    public static void main(String[] args) {


        String filepath = "./path.txt";
        List<String> wordsToSearch = Arrays.asList("pen", "pencile", "light");
        //Set<String> wordsSet = new HashSet<>();
        Map<String, Integer> wordsToCount = new HashMap<>();

        for(String word: wordsToSearch) {
            wordsToCount.put(word.toLowerCase(), 0);
        }


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
            String line;
            while((line = bufferedReader.readLine()) != null) {

                String[] words = line.split("[^a-zA-Z]+");

                for(String word: words) {
                    String lowerWord= word.toLowerCase();
                    if(wordsToSearch.contains(lowerWord)) {
                        int count = wordsToCount.get(lowerWord);
                        wordsToCount.put(lowerWord,  count++);
                    }

                }



            }


        }catch (FileNotFoundException ex) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
