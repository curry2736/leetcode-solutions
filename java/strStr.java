class Solution {
    public int strStr(String haystack, String needle) {
        String subbstring = "";
        int firstOccurence = 0;
        if ((needle.length() > haystack.length()) == true)  {
                firstOccurence = -1;
            System.out.println("a");
        }
        
        for (int i = 0; i < haystack.length(); i++) {
            if (needle.length() == 0 | needle == haystack) {
                firstOccurence = 0;
                break;
            } 

                        

            

            
            if ((needle.length() > haystack.length()) == true | haystack.length() == 0)  {
                firstOccurence = -1;
                break;
            }
            subbstring = haystack.substring(i, i+needle.length());
            if (i == 9) {
                System.out.println(subbstring);
            }
            if (subbstring.equals(needle)) {
                firstOccurence = i;
                break;
            }

            if (i+needle.length() == haystack.length()) {
                firstOccurence = -1;
                break;
            }
 
            

        }
        return firstOccurence;
    }
   
}