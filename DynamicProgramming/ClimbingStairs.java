public class ClimbingStairs {

    public static int climbStairs(int n) {
        if(n==1) {
            return 1;
        }
        
        int first = 1;
        int second = 2;
        
        for(int i=3; i<=n; i++) { // FIbonacci
            int third = first + second;
            first = second;
            second = third;
        }
        return second; // contains the whole number of options
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2)); // 2
        System.out.println(climbStairs(3)); // 3
    }
}