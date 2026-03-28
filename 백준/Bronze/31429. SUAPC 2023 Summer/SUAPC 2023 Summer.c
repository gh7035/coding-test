#include <stdio.h>

int main(void) {
    int N;
    scanf("%d", &N);

    int problems[] = {12, 11, 11, 10, 9, 9, 9, 8, 7, 6, 6};

    int penalties[] = {1600, 894, 1327, 1311, 1004, 1178, 1357, 837, 1055, 556, 773};

    if (1 <= N && N <= 11) {
        printf("%d %d\n", problems[N-1], penalties[N-1]);
    }
    return 0;
}
