#include <stdio.h>
#include <string.h>
#include <stdlib.h>

void copyUserInput() {
    char buffer[10];
    char userInput[50];
    printf("Enter your input: ");
    scanf("%49s", userInput);

    // Buffer overflow vulnerability
    strcpy(buffer, userInput);
    printf("You entered: %s\n", buffer);
}

void allocateMemory() {
    int *arr = malloc(5 * sizeof(int));
    if (arr == NULL) {
        printf("Memory allocation failed\n");
        return;
    }

    // Memory leak: forgetting to free allocated memory
    printf("Memory allocated but not freed\n");
}

int main() {
    copyUserInput();
    allocateMemory();
    return 0;
}
