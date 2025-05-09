#include <stdio.h>
#include <string.h>

int main(void) {
    char s1[20];
    scanf("%s", s1);
    for (int i=0; s1[i] != '\0' ; i++) {
        if(s1[i] < 95) { //대문자 처리
            s1[i] = s1[i]+32;
        }
        else if(s1[i] > 95) { //소문자 처리
            s1[i] = s1[i]-32;
        }
    }
    for(int i = 0 ; s1[i] != '\0'; i++) {
        printf("%c",s1[i]);
    }
    return 0;
}
