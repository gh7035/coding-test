#include <stdio.h>
int main () {
    int a,b = 0;
    scanf("%d %d",&a, &b);
    double c = 0;
    c = (double)a/(double)b;
    printf("%.91f", c);
}