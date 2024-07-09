class Solution {
    public long minimumPerimeter(long neededApples) {
        long sum = 0;
        long i = 0;

        while (sum < neededApples) {
            i++;
            sum += 12 * i * i;
        }
        
        return 8 * i;
    }
}