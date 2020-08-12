class Solution {
  
    // 1-Calculate the XOR of two numbers.
    // 2-Count the number of set bits.

    public int hammingDistance(int x, int y) {
        int xor = x^y;
        int count = 0; // number of differences
        while(xor > 0) {
            count += (xor & 1);
            xor >>= 1; //right shift operation
        }
        return count;
    }
    
}