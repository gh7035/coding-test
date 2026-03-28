#include <stdio.h>
#include <string.h>

int main() {
    char input[20];
    fgets(input, sizeof(input), stdin);

    if (strcmp(input, "1 2 3 4 5 6 7 8\n") == 0)
        printf("ascending");
    else if (strcmp(input, "8 7 6 5 4 3 2 1\n") == 0)
        printf("descending");
    else
        printf("mixed");

    return 0;
}
