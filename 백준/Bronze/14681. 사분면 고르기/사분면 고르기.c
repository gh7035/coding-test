#include <stdio.h>
int main () {
    int a,b = 0;
    scanf("%d",&a);
    scanf("%d",&b);
    if (a >= 0 && b >=0) printf("1");
    else if (a <= 0 && b >=0) printf("2");
    else if (a <= 0 && b <= 0) printf("3");
    else printf("4");
}