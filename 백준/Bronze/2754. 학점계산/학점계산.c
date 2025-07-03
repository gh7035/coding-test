#include <stdio.h>
int main () {
    char arr[2] = { 0 };
    scanf("%c%c", &arr[0], &arr[1]);
    switch(arr[0]) {
        case 'A':
            if (arr[1] == '+') printf("4.3");
            else if (arr[1] == '0') printf("4.0");
            else if (arr[1] == '-') printf("3.7");
            break;
        case 'B':
            if (arr[1] == '+') printf("3.3");
            else if (arr[1] == '0') printf("3.0");
            else if (arr[1] == '-') printf("2.7");
            break;
        case 'C':
            if (arr[1] == '+') printf("2.3");
            else if (arr[1] == '0') printf("2.0");
            else if (arr[1] == '-') printf("1.7");
            break;
        case 'D':
            if (arr[1] == '+') printf("1.3");
            else if (arr[1] == '0') printf("1.0");
            else if (arr[1] == '-') printf("0.7");
            break;
        case 'F':
            printf("0.0");
           
    }
}