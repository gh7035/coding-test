#include <stdio.h>
int main () {
    long long int a;
    scanf("%lld", &a);
    long long int sum=1;
    for(int i=1; i<=a; i++) {
        sum *= i;
    }
    printf("%lld",sum);
}