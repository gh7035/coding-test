#include <stdio.h>

int main() {
    int t;
    scanf("%d", &t);
    while (t--) {
        unsigned long long a, b, c, d;
        scanf("%llu %llu %llu %llu", &a, &b, &c, &d);

        unsigned long long area1 = a * b;
        unsigned long long area2 = c * d;

        if (area1 > area2) {
            printf("TelecomParisTech\n");
        } else if (area1 < area2) {
            printf("Eurecom\n");
        } else {
            printf("Tie\n");
        }
    }
    return 0;
}
