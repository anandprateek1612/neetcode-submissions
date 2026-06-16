class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[256];

        if(s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++){
            //char ch = text.charAt(i);
            count[s.charAt(i)]++;
        }

        for(int j=0;j<t.length();j++){
            //System.out.println("'" + t.charAt(j) + "' : " + count[t.charAt(j)]);
            count[t.charAt(j)]--;
        }

        for(int i=0;i<count.length;i++){

            //System.out.println("'" + (char)i + "' : " + count[i]);
            if(count[i]!=0) return false;
        }

        return true;
    }
}
