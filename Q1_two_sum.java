import java.util.HashMap;
class Q1_two_sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int needed = target -nums[i];
            if(map.containsKey(needed)){
                return new int[] {map.get(needed),i};
             }
             
            map.put(nums[i],i);
        }
       return new int[] {}; 
    }
    public static void main(String[] args) {
        Q1_two_sum obj =new Q1_two_sum();
        int[] nums ={7,3,5,2,4};
        int target = 8;
        int[] result = obj.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);


    }
}

