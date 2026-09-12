import java.util.HashMap;
import java.util.Arrays;
class TwoSum {
   public static void main(String[] args) {
    TwoSum obj = new TwoSum();

    System.out.println(
        Arrays.toString(obj.twoSum(new int[] {2, 7, 11, 15}, 9))
    );
    System.out.println(
        Arrays.toString(obj.twoSum(new int[] {3, 2, 4}, 6))
    );
    System.out.println(
        Arrays.toString(obj.twoSum(new int[] {3, 3}, 6))
    );
    System.out.println(
        Arrays.toString(obj.twoSum(new int[] {-8, -9, -3, -6, -5}, -8))
    );
}
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
         for(int i = 0; i < nums.length; i++) {
              hashMap.put(nums[i], i);
    }
        int x;
        for(int i = 0; i < nums.length; i++) {
        
        x = target - nums[i];
        if(hashMap.containsKey(x) && hashMap.get(x) != i) {
          return new int[] {i , hashMap.get(x)};
        }
      
        }
    return new int[0];
    }
   
}