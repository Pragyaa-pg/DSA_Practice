import java.util.*;
class Q217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
       
        for(int i=1;i<nums.length;i++){
            
                if(nums[i]==nums[i-1]){
                    return true;
                }
        }
        return false;
    }
    public static void main(String[] args) {
        Q217 obj = new Q217();  // object creation
        int[] nums = new int[]{1, 2, 3, 1};

        boolean result = obj.containsDuplicate(nums);
        System.out.println(result);
    }
}
