#include <stdio.h>
int main () {
    int kids, medal;
    scanf("%d %d", &kids, &medal);
    if(kids % medal == 0) printf("Yes");
    else printf("No");
}