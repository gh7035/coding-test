#include<stdio.h>
#include<string.h>
int main() {
    int T;
    scanf("%d", &T);
    for(int i=0; i<T; i++) {
        char a[1000];
        scanf("%s", a);
        printf("%c%c\n", a[0], a[strlen(a) - 1]);
        
    }
}