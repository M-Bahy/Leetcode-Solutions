class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String [] ss = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = ss.length-1;i>-1;i--){
            if(! ss[i].equals("")){
            sb.append(ss[i]);
            if(i != 0)
                sb.append(" ");
            }
                
        }
        return sb.toString();
    }
}