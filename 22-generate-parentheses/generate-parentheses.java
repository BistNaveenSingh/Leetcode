class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if(n-- == 1) return List.of("()");
        dfs(n,n,"(");

        return ans;
        
    }

    private void dfs(int openP,int closeP, String s){
        if(openP == 0 && closeP == 0){
             ans.add(s + ")");
            return;
        }

        if( openP > 0){
            dfs(openP - 1,closeP,s + "(");
        }

        if( closeP>= openP){
            dfs(openP,closeP-1,s+")");
        }
    }
}