#include <stdio.h>
#include <string.h>

int main() {
    int a;
    char b[10];
    int score = 0;

    scanf("%d %s", &a, b);

    if (strcmp(b, "miss") == 0) {
        score = 0;
    } else if (strcmp(b, "bad") == 0) {
        score = 200;
    } else if (strcmp(b, "cool") == 0) {
        score = 400;
    } else if (strcmp(b, "great") == 0) {
        score = 600;
    } else if (strcmp(b, "perfect") == 0) {
        score = 1000;
    }

    printf("%d\n", a * score);
    return 0;
}
