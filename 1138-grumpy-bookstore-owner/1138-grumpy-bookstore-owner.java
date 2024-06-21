class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int santushtii = 0;
        for (int pepole = 0; pepole < customers.length; pepole++) {
            if (grumpy[pepole] == 0) {
                santushtii += customers[pepole];
            }
        }
        int jada_se_jada = 0;
        for (int pepole = 0; pepole < minutes; pepole++) {
            if (grumpy[pepole] == 1) {
                santushtii += customers[pepole];
            }
        }
        jada_se_jada = santushtii;
        for (int pepole = minutes; pepole < customers.length; pepole++) {
            if (grumpy[pepole] == 1) {
                santushtii += customers[pepole];
            }
            if (grumpy[pepole - minutes] == 1) {
                santushtii -= customers[pepole - minutes];
            }
            jada_se_jada = Math.max(jada_se_jada, santushtii);
        }
        return jada_se_jada;
    }
}