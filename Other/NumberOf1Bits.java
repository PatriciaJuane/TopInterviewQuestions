public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask <<= 1;
        }
        return bits;
    }
    
}
/* LOOP AND FLIP
The solution is straight-forward. 
We check each of the 32 bits of the number. 
If the bit is 11, we add one to the number of 11-bits.
We can check the i^{th}ith bit of a number using a bit mask. 
We start with a mask m=1m=1, because the binary representation of 11 is,
00000000000000000000000000000001
Clearly, a logical AND between any number and the mask 11 gives us 
the least significant bit of this number. 
To check the next bit, we shift the mask to the left by one.
00000000000000000000000000000010
And so on.*/
