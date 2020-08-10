class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for(int i=2; i<n; i++) {
            isPrime[i] = true;
        }
        
        // sieve of eratosthenes
        for(int i=2; i*i<n; i++) {
            if(!isPrime[i]) continue;
            for(int j=i*i; j<n; j+=i) { // check all multiples and put them to false
                isPrime[j] = false;
            }
        }
        
        int count = 0; // output variable
        for(int i=2; i <n; i++) {
            if(isPrime[i]) count++;
        }                          
        
        return count;                   
    }
}