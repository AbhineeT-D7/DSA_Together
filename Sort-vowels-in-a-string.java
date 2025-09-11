// Problem : https://leetcode.com/problems/sort-vowels-in-a-string/?envType=daily-question&envId=2025-09-11

class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vol = new ArrayList<>();

        String allVowels = "aeiouAEIOU";
        
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            if(allVowels.indexOf(ch) != -1){ // it search the given character in allVowels and returns the index of that character 
                vol.add(ch); // Adding vowels in array
            }
        }

        Collections.sort(vol); // Sorting Vowels

        StringBuilder newString = new StringBuilder();

        int j = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(allVowels.indexOf(ch) != -1){
                newString.append(vol.get(j));
                j++;
            }else{
                newString.append(ch);
            }
        }
        
        return newString.toString(); // returning them after making "String"
    }
}
