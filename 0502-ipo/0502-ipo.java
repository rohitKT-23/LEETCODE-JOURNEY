class pjt {
    int profit;
    int capital;

    public pjt(int profit, int capital) {
        this.profit = profit;
        this.capital = capital;
    }
}
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int t_profit = profits.length;
        pjt[] pjts = new pjt[t_profit];
        
        for (int i = 0; i < t_profit; i++) {
            pjts[i] = new pjt(profits[i], capital[i]);
        }

        Arrays.sort(pjts, (a, b) -> a.capital - b.capital);

        PriorityQueue<Integer> max_profit_hp = new PriorityQueue<>((a, b) -> b - a);
        int pjt_IDX = 0;

        for (int i = 0; i < k; i++) {
            while (pjt_IDX < t_profit && pjts[pjt_IDX].capital <= w) {
                max_profit_hp.add(pjts[pjt_IDX].profit);
                pjt_IDX++;
            }

            if (max_profit_hp.isEmpty()) {
                break;
            }

            w += max_profit_hp.poll();
        }

        return w;
    }
}