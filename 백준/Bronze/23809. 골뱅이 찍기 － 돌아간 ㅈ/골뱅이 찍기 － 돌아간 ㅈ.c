#include <stdio.h>

int main(void) {
    int N;
    scanf("%d", &N);

    int i, j;

    for (i = 0; i < N; i++) {
        for (j = 0; j < N; j++) putchar('@');
        for (j = 0; j < 3 * N; j++) putchar(' ');
        for (j = 0; j < N; j++) putchar('@');
        putchar('\n');
    }

    for (i = 0; i < N; i++) {
        for (j = 0; j < N; j++) putchar('@');
        for (j = 0; j < 2 * N; j++) putchar(' ');
        for (j = 0; j < N; j++) putchar('@');
        putchar('\n');
    }

    for (i = 0; i < N; i++) {
        for (j = 0; j < 3 * N; j++) putchar('@');
        putchar('\n');
    }

    for (i = 0; i < N; i++) {
        for (j = 0; j < N; j++) putchar('@');
        for (j = 0; j < 2 * N; j++) putchar(' ');
        for (j = 0; j < N; j++) putchar('@');
        putchar('\n');
    }

    for (i = 0; i < N; i++) {
        for (j = 0; j < N; j++) putchar('@');
        for (j = 0; j < 3 * N; j++) putchar(' ');
        for (j = 0; j < N; j++) putchar('@');
        putchar('\n');
    }

    return 0;
}
