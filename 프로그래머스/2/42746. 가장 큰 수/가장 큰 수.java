class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        for (int i = 1; i < numbers.length; i++) {
            int pivot = numbers[i];
            int j = i-1;

            while (j >= 0) {
                int n = numbers[j];

                int a = 10;
                while (a <= n) a *= 10;

                int b = 10;
                while (b <= pivot) b *= 10;

                if (n*b + pivot < pivot*a + n) {
                    numbers[j+1] = numbers[j];
                    j--;
                }
                else break;
            }

            numbers[j+1] = pivot;
        }

        for (int n : numbers) {
            answer += n;
        }

        if (answer.startsWith("0")) answer = "0";

        return answer;
    }
}