#include <stdio.h>
int main() {
    int a[6];
    int result = 0;
    for(int i=0; i<6; i++) {
        scanf("%d", &a[i]);
        result += a[i];
    }
    printf("%d", result*5);
    
}