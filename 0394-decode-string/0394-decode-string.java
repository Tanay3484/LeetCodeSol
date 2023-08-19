class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        Stack<String> result = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c != ']') {
                stack.push(c);
            } else {
                StringBuilder substr = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != '[') {
                    substr.insert(0, stack.pop());
                }
                // Pop the '[' character
                stack.pop();
                
                StringBuilder k = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    k.insert(0, stack.pop());
                }
                int digit = Integer.parseInt(k.toString());

                String repeatedSubstring = substr.toString().repeat(digit);
                for (char ch : repeatedSubstring.toCharArray()) {
                    stack.push(ch);
                }
            }
        }
        
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.insert(0, stack.pop());
        }

        return res.toString();
    }
}