#include <stdio.h>
#include <math.h>

int main() {
    double a, b, c;

    while (1) {
        scanf("%lf %lf %lf", &a, &b, &c);
        if (a == 0 && b == 0 && c == 0) break;

        // 가장 큰 수를 빗변으로 가정
        double max = a, side1 = b, side2 = c;

        // max가 가장 큰 값이 되도록 설정
        if (b > max) {
            max = b;
            side1 = a;
            side2 = c;
        }
        if (c > max) {
            max = c;
            side1 = a;
            side2 = b;
        }

        // 피타고라스 정리 확인 (부동소수점 오차 고려)
        if (fabs(max * max - (side1 * side1 + side2 * side2)) < 1e-6)
            printf("right\n");
        else
            printf("wrong\n");
    }

    return 0;
}
