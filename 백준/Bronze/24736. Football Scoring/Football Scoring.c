#include <stdio.h>
int main () {
    int a[5];
    int b[5];
    scanf("%d %d %d %d %d", &a[0], &a[1], &a[2], &a[3], &a[4]);
    scanf("%d %d %d %d %d", &b[0], &b[1], &b[2], &b[3], &b[4]);
    
    int are = (a[0]*6)+(a[1]*3)+(a[2]*2)+(a[3]*1)+(a[4]*2);
    int bre = (b[0]*6)+(b[1]*3)+(b[2]*2)+(b[3]*1)+(b[4]*2);
    printf("%d %d", are, bre);
    
    
    
}