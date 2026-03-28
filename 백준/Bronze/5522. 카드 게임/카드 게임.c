#include <stdio.h>
int main(){
    int a[5];
    int add=0;
    for(int i=0; i<5; i++) {
        scanf("%d", &a[i]);
        add += a[i];
    }
    printf("%d", add);
    
}