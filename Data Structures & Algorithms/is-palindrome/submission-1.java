class Solution {
    public boolean isPalindrome(String s) {
        
        int i=0 , j=s.length()-1;

        while(i<=j){
            if(!charValidate(s.charAt(i))){
                i++;
                continue;
            }
            if(!charValidate(s.charAt(j))){
                j--;
                continue;
            }

            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
            {
               return false;
            }
            i++;
            j--;
        }
        return true;
    }
    boolean charValidate(char c)
        {
            if (c>='A' && c<='Z')return true;
            if (c>='a' && c<='z')return true;
            if (c>='0' && c<='9')return true;
            return false;
        }
}
