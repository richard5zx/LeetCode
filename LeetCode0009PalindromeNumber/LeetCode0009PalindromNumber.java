package folder1;
class Solution {
    public boolean isPalindrome(int x) {
        
        /* Solution 1
        if (x == 0) {  // Base case 0 is always palindrome
            return true;
        } if (x < 0 || x % 10 == 0) { // Negative numbers are not palindrome
            return false;
        }
        
        int reversed_int = 0;
        while (x > reversed_int) {
            int pop = x % 10;
            x /= 10;
            
            reversed_int = (reversed_int * 10) + pop;
        }
            
        if (x == reversed_int || x == reversed_int / 10) {
            return true;
        } else {
            return false;
        }
        */ 

        /* Solution 2
        String s = String.valueOf(x);
        char ch[] = s.toCharArray();  
        String rev = "";  
        for(int i = ch.length-1 ; i>=0 ; i--){  
            rev += ch[i];  
        } 
        if (s.equals(rev)) {
            return true;
        } else {
            return false;
        }
        */

        // Solution 3
        String s = String.valueOf(x);
        
        StringBuilder input1 = new StringBuilder();
        input1.append(s);
        input1.reverse();

        if (s.equals(input1.toString())) {
            return true;
        } else {
            return false;
        }
        //sss
    }

    public static void main(String[] args) {
        int x = 121;
    
        Solution mySolution = new Solution();
    
        System.out.println(mySolution.isPalindrome(x));
    }
}