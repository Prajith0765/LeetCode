class Solution {
    public String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();

        // Array to store the result
        int[] result = new int[n + m];

        // Multiply each digit of num1 with each digit of num2
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                int product = digit1 * digit2;
                int sum = product + result[i + j + 1];

                // Store the carry and current digit in the result array
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        // Convert the result array to string
        StringBuilder sb = new StringBuilder();

        for (int num : result) {
            // Skip leading zeros
            if (sb.length() != 0 || num != 0) {
                sb.append(num);
            }
        }

        // If the result is empty, return "0"
        return sb.length() == 0 ? "0" : sb.toString();
    }
}

