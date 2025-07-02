#include <stdio.h>
int main () {
    int a, b, max;
    scanf("%d", &max);
    for(int i=0; i<max; i++) {
        scanf("%d %d", &a, &b);
        printf("%d\n", a+b);
    }
}