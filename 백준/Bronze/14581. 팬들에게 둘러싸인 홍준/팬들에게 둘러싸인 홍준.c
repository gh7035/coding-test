#include <stdio.h>
int main () {
    char str[20];
    scanf("%s", str);
        for (int j=0; j<3; j++) {
            printf(":fan:");
        }
        printf("\n:fan::%s::fan:\n",str);
        for (int j=0; j<3; j++) {
            printf(":fan:");
        }
}