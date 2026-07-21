class Solution {
public:
    bool isPalindrome(string s) {
        int i=0, j=s.size()-1;
        while(i<=j){
            if(!checkValidate(s[i])){
                i++;
                continue;
            }
            if(!checkValidate(s[j])){
                j--;
                continue;
            }
            if(tolower(s[i]) != tolower(s[j])) return false;
            i++;
            j--;
        }
        return true;
    }

    bool checkValidate(char c){
        if(0<=c-'A' && c-'A'<26){
            return true;
        }
        if(0<=c-'a' && c-'a'<26){
            return true;
        }
        if(0<=c-'0' && c-'0'<=9){
            return true;
        }
        return false;
    }
};
