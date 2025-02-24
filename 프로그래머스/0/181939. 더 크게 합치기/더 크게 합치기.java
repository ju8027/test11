class Solution {
    public int solution(int a, int b) {
        String ab = a+""+b;
        String ba = b+""+a;
        return Integer.parseInt(ab.compareTo(ba) > 0 ? ab : ba);
    }
}