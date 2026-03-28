#include <stdio.h>
int main () {
    int a,b,c;
    scanf("%d %d %d", &a,&b,&c);
    int result;
    result = (a+1)*(b+1)/(c+1);
    printf("%d", result-1);
}