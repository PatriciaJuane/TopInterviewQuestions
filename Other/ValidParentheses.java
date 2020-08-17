class Solution {

    public boolean isValid(String s) {
        if(s==null || s.isEmpty()) {
            return true;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) { // it is an opening bracket
                stack.push(c);
            } else { // if it is a closing bracket
                if(stack.isEmpty() || map.get(stack.pop()) != c)  // stack.pop -> last opening bracket
                    return false;
            }
        }
        return stack.isEmpty();
    }

    // TEST Cases:
    // ()
    // {}()
    //{[]}
    // ([)]
}