class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;
        int Alpha[] = new int[26];

        for(int m=0; m<s.length(); m++)
        {
            Alpha[s.charAt(m)-'a']++; Alpha[t.charAt(m)-'a']--;
        }

        for(int m=0; m<26; m++)
        {
            if(Alpha[m]!=0) return false;
            
        }
        return true;
                

    }
}
