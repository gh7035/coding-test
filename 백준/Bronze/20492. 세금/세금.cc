#include <stdio.h>
int main () {
    int all = 0;
    int a, b;
    scanf("%d", &all);
    a = all * 0.78;
    b = all - (all * 0.2) * 0.22;
    printf("%d %d",a,b);
}