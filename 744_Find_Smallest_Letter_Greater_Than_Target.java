class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
    
        int [] array = new int[26];
        for(int letter:letters){
            array[letter-'a'] = 1;
        }
        
        int i = target-'a'+ 1;
        boolean isFound = false;
        while(i<26){
            if(array[i]==1){
                isFound = true;
                break;
            }
            i++;
        }
        
        if(isFound == false){
            i=0;
            while(i<26){
                if(array[i]==1){
                    isFound = true;
                    break;
                }
                i++;
            }   
        }
        
        return (char)('a'+ (char)i);
    }
}