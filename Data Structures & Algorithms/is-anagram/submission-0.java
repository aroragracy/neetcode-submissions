class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        int chars[]= new int[26];
        for ( int i =0 ;i <s.length();i++)
        {
            char c=s.charAt(i);
            chars[c-'a']++;
        }

        for( int i=0;i<t.length();i++)
        {
            char d=t.charAt(i);
            if(chars[d-'a']!=0){
                chars[d-'a']--;
            }
            else
            {
                return false;
            }
        }
        return true;

    }
}
