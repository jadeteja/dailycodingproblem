class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] population = new int[101];

        // Calculate population changes
        for (int[] log : logs) {
            population[log[0] - 1950]++;
            population[log[1] - 1950]--;
        }

        int maxPopulation = 0;
        int currentPopulation = 0;
        int answer = 1950;

        // Calculate prefix sum
        for (int i = 0; i < 101; i++) {

            currentPopulation += population[i];

            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                answer = 1950 + i;
            }
        }

        return answer;
    }
}