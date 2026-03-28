#include <stdio.h>
int main() {
    int a,b,x;
    int times = 0;
    scanf("%d", &times);
    while(times--) {
        scanf("%d %d %d", &a,&b,&x);
        printf("%d\n",a*(x-1)+b);
    }
}