#include <stdio.h>
#include <stdlib.h>

// Function to compute factorial
int factorial(int num) {
    int fact = 1;
    for (int i = 2; i <= num; i++) {
        fact *= i;
    }
    return fact;
}

// Function to get the k-th permutation
char* getPermutation(int n, int k) {
    char* result = (char*)malloc((n + 1) * sizeof(char)); // Allocate memory for result string
    int available[10]; // Array to store available numbers 1 to n

    // Initialize available numbers
    for (int i = 0; i < n; i++) {
        available[i] = i + 1;
    }

    k--; // Convert k to 0-based index
    int fact = factorial(n - 1); // Compute (n-1)!

    for (int i = 0; i < n; i++) {
        int index = k / fact; // Determine the index of the next digit
        result[i] = '0' + available[index]; // Select digit

        // Shift elements to remove used digit
        for (int j = index; j < n - 1; j++) {
            available[j] = available[j + 1];
        }

        k %= fact; // Update k
        if (i < n - 1) fact /= (n - 1 - i); // Compute next factorial
    }

    result[n] = '\0'; // Null-terminate the string
    return result;
}

