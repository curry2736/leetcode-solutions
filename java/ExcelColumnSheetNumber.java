class Solution {
    public int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        double value2 = 0;
        for (int i = 0; i < s.length(); i++) {
                value2 = value2 + (Character.getNumericValue(chars[i]) - 9) * Math.pow(26, s.length() - i-1);          
        }
        
        return (int) value2;
    }
}