class TextEditor {
    Stack<Character> left,right;

    public TextEditor() {
        left = new Stack<>();    
        right = new Stack<>();    
    }
    
    public void addText(String text) {
        for(char ch : text.toCharArray()){
            left.push(ch);
        }
    }
    
    public int deleteText(int k) {
        int i = 0;
        while(!left.isEmpty() && i<k){
            left.pop();
            i++;
        }
        return i;
    }
    
    public String cursorLeft(int k) {
        while (!left.isEmpty() && k-- > 0) {
            right.push(left.pop());
        }
        String res = "";
        int minE = Math.min(10, left.size());
        while (!left.isEmpty() && minE-- > 0) {
            res = left.pop() + res;
        }
        for (char ch : res.toCharArray()) {
            left.push(ch);
        }
        return res;
    }
    
    public String cursorRight(int k) {
        while (!right.isEmpty() && k-- > 0) {
            left.push(right.pop());
        }
        String res = "";
        int minE = Math.min(10, left.size());
        while (!left.isEmpty() && minE-- > 0) {
            res = left.pop() + res;
        }
        for (char ch : res.toCharArray()) {
            left.push(ch);
        }
        return res;
    }
}

/**
 * Your TextEditor object will be instantiated and called as such:
 * TextEditor obj = new TextEditor();
 * obj.addText(text);
 * int param_2 = obj.deleteText(k);
 * String param_3 = obj.cursorLeft(k);
 * String param_4 = obj.cursorRight(k);
 */