#include<stdio.h>
int main(){
    int a[4];
    scanf("%d %d %d %d", &a[0], &a[1], &a[2], &a[3]);
    printf("%d", (a[0]*56) + (a[1]*24) + (a[2]*14)+ (a[3]*6));
}
