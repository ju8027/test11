class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        boolean mode = false;
        
        for (int i = 0; i < code.length(); i++){
            char a = code.charAt(i);
            if (a == '1'){
                mode = !mode;
            }else if ((i % 2 == 0) != mode){
                ret.append(a);
            }
        }
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}