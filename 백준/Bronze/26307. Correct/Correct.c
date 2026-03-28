#include <stdio.h>
int main () {
    long long int a,b;
    scanf("%lld %lld", &a, &b);
    long long int ya = a-9;
    long long int ho = b;
    long long int result=0;
    result += ya*60;
    result += ho;
    printf("%lld", result);

}