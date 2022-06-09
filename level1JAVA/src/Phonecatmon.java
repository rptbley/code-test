import java.util.HashSet;

class Phonecatmon {
    public int solution(int[] nums) {
        HashSet<Integer> pickList = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            pickList.add(nums[i]);
        }
        int pickCount = pickList.size();
        int length = nums.length / 2;
        return length > pickCount ? pickCount : length;
    }

    public static void main(String[] args) {
        Phonecatmon phonecatmon = new Phonecatmon();
        int[] nums = {3,3,3,2,2,4};
        int result = phonecatmon.solution(nums);
        System.out.println("result = " + result);
    }
}
