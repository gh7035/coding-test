#include <stdio.h>
int main () {
    int h, m, plus;
    scanf("%d %d", &h, &m);
    scanf("%d", &plus);

    m += plus;
    h += m / 60;
    m %= 60;
    h %= 24;

    printf("%d %d\n", h, m);
    return 0;
}
