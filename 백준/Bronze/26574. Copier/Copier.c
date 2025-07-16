#include <stdio.h>
int main () {
    int sum;
    scanf("%d", &sum);
    int arr[sum];
    for (int i = 0 ; i<sum; i++) {
        scanf("%d", &arr[i]);
    }
    for (int i = 0 ; i<sum; i++) {
        printf("%d %d\n", arr[i], arr[i]);
    }
}