#include <stdio.h>

int main(void) {
    long long h1, m1, s1;
    long long h2, m2, s2;

    scanf("%lld : %lld : %lld", &h1, &m1, &s1);
    scanf("%lld : %lld : %lld", &h2, &m2, &s2);

    long long t1 = h1 * 3600 + m1 * 60 + s1;
    long long t2 = h2 * 3600 + m2 * 60 + s2;

    long long result = t2 - t1;
    if (result < 0) result += 24 * 3600; // 자정을 넘긴 경우

    printf("%lld\n", result);
    return 0;
}
