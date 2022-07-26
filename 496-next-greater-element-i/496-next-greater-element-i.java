class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
          Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++){
            for(int j = i + 1; j <= nums2.length; j++){
                if(j == nums2.length){
                    map.put(nums2[i], -1);
                    break;
                }
                if(nums2[i] < nums2[j]){
                    map.put(nums2[i], nums2[j]);
                    break;
                }
            }
        }
        for(int i = 0; i < nums1.length; i++){
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }
}