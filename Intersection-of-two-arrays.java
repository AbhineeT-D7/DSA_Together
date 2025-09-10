Problem : https://leetcode.com/problems/intersection-of-two-arrays/?envType=problem-list-v2&envId=sorting
// 1st approach (OPTIMUM)
class Solution{
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }
}

// 2nd approach(BRUTE - FORCE)

class Solution {
    private boolean searchElement(int n , int[] arr){
        Arrays.sort(arr);
        int len = arr.length;
        int i = 0;
        if(n == arr[len / 2]) return true;
        else if(n < arr[len / 2]) len/=2;
        else i = len/2 + 1; 
        
        for( ; i < len ; i++){
            if(arr[i] == n) return true;
        }

        return false;

    }
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0 ; i < nums1.length-1 ; i++){
            if(nums1[i] != nums1[i+1]){
                arr.add(nums1[i]);
            }
        }
        if(arr.isEmpty() || arr.get(arr.size()-1) != nums1[nums1.length -1]) {
            arr.add(nums1[nums1.length -1]);
        }

        for(int i = arr.size()-1 ; i >= 0  ; i--){
            boolean isAvail = searchElement(arr.get(i) , nums2);

            if(!isAvail){
                arr.remove(i);
            }

        }

        int newArr[] = new int[arr.size()];

        for(int i = 0 ; i < arr.size() ; i++){
            newArr[i] = arr.get(i);
        }

        return newArr;   
    }
}
