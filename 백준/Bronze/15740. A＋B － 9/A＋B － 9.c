#include <stdio.h>
#include <string.h>

#define MAX 1010002  // 최대 자리 수 + 여유분

int main() {
    char A[MAX], B[MAX];
    int result[MAX] = {0};

    scanf("%s %s", A, B);

    int lenA = strlen(A);
    int lenB = strlen(B);

    int i = lenA - 1;
    int j = lenB - 1;
    int k = 0; // result 인덱스
    int carry = 0;

    while (i >= 0 || j >= 0 || carry > 0) {
        int sum = carry;
        if (i >= 0) sum += A[i--] - '0';
        if (j >= 0) sum += B[j--] - '0';

        result[k++] = sum % 10;
        carry = sum / 10;
    }

    // 출력 (역순)
    for (int l = k - 1; l >= 0; l--)
        printf("%d", result[l]);
    printf("\n");

    return 0;
}
