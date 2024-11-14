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
}