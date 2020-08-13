public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int aux = 0;
        for(int i=0; i<32; i++) {
            aux <<= 1; 
            aux = aux | (n & 1); 
             n >>= 1; 
        }
        return aux;
    }
}