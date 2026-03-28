#include <stdio.h>

int main() {
    long long width, height;
    scanf("%lld %lld", &width, &height);

    long long area = width * height;
    long long coverage = 5 * 4840;

    long long bags = (area + coverage - 1) / coverage;
    printf("%lld\n", bags);

    return 0;
}
