#include <stdio.h>
int main() {
    int a,b;
    int isTrue = 1;
    while(isTrue) {
        scanf("%d %d", &a, &b);
        if(a == 0 || b == 0) {
            isTrue = 0;
            break;
        }
        printf("%d\n", a+b);
    }
}