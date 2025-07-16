#include <stdio.h>
int main () {
    int S, G = 0;
    scanf("%d %d", &S, &G);
    if(S < 4) {
        printf("%d", G - S);
        return 0;
    }
    S = 24 - S;
    printf("%d", S + G);
}