class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1.isEmpty()){
            return word2;
        }
        if(word2.isEmpty()){
            return word1;
        }

        int i = 0;
        StringBuilder sb = new StringBuilder();
        for(i=0;i<word1.length() && i<word2.length();i++){
            if(i <    word1.length()      ){
                sb.append(word1.charAt(i));
            }
                 if(i <    word2.length()      ){
                sb.append(word2.charAt(i));
            }
        }
        if(i < word1.length()){
            for (int j = i ;j<word1.length();j++){
                sb.append(word1.charAt(j));
            }
        }

         if(i < word2.length()){
            for (int j = i ;j<word2.length();j++){
                sb.append(word2.charAt(j));
            }
        }

        return sb.toString();
        
    }
}