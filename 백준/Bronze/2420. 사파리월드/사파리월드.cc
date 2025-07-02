#include <stdio.h>

int main() {
    long long a, b, diff;
    scanf("%lld %lld", &a, &b);
    diff = a - b;
    if (diff < 0) diff = -diff;
    printf("%lld\n", diff);
    return 0;
}
