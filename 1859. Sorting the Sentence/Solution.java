class Solution {
    public String sortSentence(String s) {
        // int count = 1;
        // int whiteSpaces = 1;
        // String result;

        // for (char c : s.toCharArray()) {
        //     if (c == ' ') {
        //         whiteSpaces++;
        //     }
        // }

        // while(count <= whiteSpaces){
        //     String word;
        //     for(int i = 0; i < s.length(); i++){
        //         if(s[i] - '0' == count){
        //             result += word;
        //             if(count < whiteSpaces){
        //                 result += ' ';
        //                 count++;
        //             }else{
        //                 word += s[i];   
        //             }
        //             if(s[i] == ' '){
        //                 word = "";
        //             }
        //         }
        //     }
        // }
        // return result;

        int whiteSpaces = 0;
        String[] words = s.split("\\s+");
        String[] resultArray = new String[words.length];

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                whiteSpaces++;
            }
        }

        for (String word : words) {
            int position = word.charAt(word.length() - 1) - '0';
            resultArray[position - 1] = word.substring(0, word.length() - 1);
        }

        return String.join(" ", resultArray);

        //Approach
        //Initially, we count the number of whitespace characters in the string s to determine the number of words in the sentence.
        // We split the input sentence s into individual words using split("\\s+"). 
        //This creates an array of words.
        //For each word, we extract the position number from the end of the word. 
        //This is achieved by int position = word.charAt(word.length() - 1) - '0';. The position number represents the order of the word in the original sentence.
        //We then create a result array where each word is placed in its correct position based on the position number. 
        //For example, if a word has position 2, it will be placed at index 1 in the result array (since indexing starts from 0).
        //we join the words in the result array into a single string using
        // String.join(" ", resultArray) with whitespace as the separator.
    }
}