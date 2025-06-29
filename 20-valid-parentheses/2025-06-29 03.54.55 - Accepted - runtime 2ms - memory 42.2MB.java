class Solution {
    public boolean isValid(String s) {
        boolean isValid = true;

        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            switch(c){
                
                case '(':
                stack.push('(');
                break;

                case ')':
                if(stack.isEmpty() || !stack.peek().equals('(')){
                    isValid = false;
                    return isValid;
                }
                stack.pop();
                break;

                case '{':
                stack.push('{');
                break;

                case '}':
                if(stack.isEmpty() || !stack.peek().equals('{')){
                    isValid = false;
                    return isValid;
                }
                stack.pop();
                break;

                case '[':
                stack.push('[');
                break;

                case ']':
                if(stack.isEmpty() || !stack.peek().equals('[')){
                    isValid = false;
                    return isValid;
                }
                stack.pop();
                break;
            }
        }
        if(!stack.isEmpty()){
            isValid = false;
        }
        return isValid;
    }
}