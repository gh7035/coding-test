#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);

    for(int i = 0; i < n; i++) {
        long long p, t;
        scanf("%lld %lld", &p, &t);

        long long born = t / 4;
        long long died = t / 7;
        long long population = p + born - died;

        printf("%lld\n", population);
    }

    return 0;
}
