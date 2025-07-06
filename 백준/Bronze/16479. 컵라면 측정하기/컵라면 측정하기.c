#include <stdio.h>
#include <math.h>

int main() {
    double K, D1, D2;
    scanf("%lf", &K);
    scanf("%lf %lf", &D1, &D2);

    double diff = (D2 - D1) / 2.0;
    double height_squared = K * K - diff * diff;

    printf("%.6f\n", height_squared);

    return 0;
}
