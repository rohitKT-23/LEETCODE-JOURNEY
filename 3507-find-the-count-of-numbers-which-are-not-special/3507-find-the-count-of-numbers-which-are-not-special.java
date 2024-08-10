class Solution {
    public int nonSpecialCount(int l, int r) {
         int lmt = (int) Math.sqrt(r);
        List<Integer> primes = sieve(lmt);

        int spcl_cnrt = 0;

        for (int prime : primes) {
            int square = prime * prime;
            if (square >= l && square <= r) {
                spcl_cnrt++;
            }
        }

        int t_cnt = r - l + 1;
        return t_cnt - spcl_cnrt;
    }
    public static List<Integer> sieve(int lmt) {
        boolean[] valid_prime = new boolean[lmt + 1];
        Arrays.fill(valid_prime, true);
        valid_prime[0] = false;
        valid_prime[1] = false;

        for (int i = 2; i * i <= lmt; i++) {
            if (valid_prime[i]) {
                for (int j = i * i; j <= lmt; j += i) {
                    valid_prime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= lmt; i++) {
            if (valid_prime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }
}