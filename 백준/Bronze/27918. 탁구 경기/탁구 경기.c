#include<stdio.h>
int main () {
    int many;
    scanf("%d", &many);
    int d=0;
    int p=0;
    while(many) {
        if(d+2 == p || p+2 == d) break;
        char a;
        scanf(" %c", &a);
        if(a == 'D') d++;
        if(a == 'P') p++;
        many--;
        
    }
    printf("%d:%d", d,p);
}