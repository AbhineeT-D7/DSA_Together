//Problem : https://leetcode.com/problems/minimum-index-sum-of-two-lists/submissions/1787020604/?envType=problem-list-v2&envId=array
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String , Integer> map = new HashMap<>();
        for(int i = 0 ; i < list1.length ; i++){
            int index = Arrays.asList(list2).indexOf(list1[i]);
            if( index != -1 ){
                map.put(list1[i] , i+index);
            }
        }

        int min = Collections.min(map.values());

        for(int i =  0 ; i < map.size() ; i++){
            map.values().removeIf(v -> v != min);
        }

        String[] res = new String[map.size()];
        int i = 0;
        for( String key : map.keySet()){
            res[i++] = key;
        }

        return res;
        
    }
}
