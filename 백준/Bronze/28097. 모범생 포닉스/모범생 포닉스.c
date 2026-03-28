#include <stdio.h>
int main(void) {
    int T;
    int arr[120];
    int result = 0;
    scanf("%d", &T);
    for(int i=0; i<T; i++) {
        scanf("%d ", &arr[i]);
        result += arr[i];
    }
    result += (T-1)*8;
    printf("%d %d", result/24, result%24);
}