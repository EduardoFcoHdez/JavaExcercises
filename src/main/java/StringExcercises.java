import java.util.HashMap;
import java.util.Map;

public class StringExcercises{

    public static String reverseString(String word){
      char[] wordArray = word.toCharArray();
      int j = (wordArray.length -1);
      
      for(int i = 0; i < wordArray.length; i++){
        if (i < j) {
            char swap = wordArray[i];
            wordArray[i] = wordArray[j];
            wordArray[j] = swap;
        }        
        j--;
      }

    return new String (wordArray);
    }

    public static String reverseString2(String word){
        char[] wordChars = word.toCharArray();

        for(int i=0, j= (wordChars.length - 1); i < (wordChars.length / 2); i++, j--){
            var temp = wordChars[i];
            wordChars[i] = wordChars[j];
            wordChars[j] = temp;
        }
        return new String(wordChars);
    }

    public static String removeWhiteSpaces(String str){
        char [] strChars = str.toCharArray();
        StringBuilder newsStr = new StringBuilder();

        for(int i = 0; i < strChars.length; i++){
            if(strChars[i] != ' '){
                newsStr.append(strChars[i]);
            }
        }
        return newsStr.toString();
    }

    public static String removeWhiteSpaces2(String str){
        //char [] strChars = str.toCharArray();
        StringBuilder cleanedStr = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                cleanedStr.append(str.charAt(i));
            }
        }
        return cleanedStr.toString();
    }

    public static String removeWhiteSpaces3(String str){
        return str.replaceAll(" " ,"");
    }

    public static Map<Character, Integer> countOccurrences(String str){

        HashMap<Character, Integer> letterCount = new HashMap<>();

        for(int i = 0; i < str.length(); i++ ){
            if(letterCount.containsKey(str.charAt(i)))
                continue;

            for (int j = i; j < str.length(); j++){
                if(str.charAt(i)  == str.charAt(j) ){
                    Integer accumulator = letterCount.getOrDefault(str.charAt(i),0) + 1;
                    letterCount.put(str.charAt(i), accumulator);
                }
            }
        }
        return letterCount;
    }

}