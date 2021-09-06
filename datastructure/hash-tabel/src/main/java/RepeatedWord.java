import java.util.HashMap;
import java.util.Map;

public class RepeatedWord {
    public String repeatWord(String word){
        String result="";
        String [] words = word.toLowerCase().replace(",","").split(" ");
        Map<String,Integer> wordCount=new HashMap<String,Integer>();
        for (String wordDuplicate:words){
            if (wordCount.containsKey(wordDuplicate)) {
                result=wordDuplicate;
                break;
            }else {
                wordCount.put(wordDuplicate,1);
            }
        }
        return result;
    }
}
