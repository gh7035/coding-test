#include <stdio.h>
int main () {
    int money;
    scanf("%d", &money);
    int T;
    scanf("%d", &T);
    
    int result = 0;
    for(int i=0; i<T; i++) {
        int price, count;
        scanf("%d %d", &price, &count);
        result += price * count;
    }
    
    if(result == money) printf("Yes");
    else printf("No");
    
    return 0;
}
