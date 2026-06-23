class Solution {
    public boolean isPalindrome(String s) {
        
        String ss = cleanString(s).toLowerCase();
        int i=0;
        int j=ss.length()-1;
        while(i<j){
            if(ss.charAt(i)!=ss.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }

    public String cleanString(String s){
        if(s==null) return null;

        return s.replaceAll("[^a-zA-Z0-9]","");
    }
}
