#include <stdio.h>
#include <time.h>

int main() {
    time_t t = time(NULL);
    struct tm *tm_info;

    // UTC+9인 KST 기준으로 보정
    tm_info = gmtime(&t); // UTC 기준 시간
    tm_info->tm_hour += 9; // UTC+9 보정
    mktime(tm_info); // 보정 반영

    printf("%04d-%02d-%02d\n", 
        tm_info->tm_year + 1900, 
        tm_info->tm_mon + 1, 
        tm_info->tm_mday);
    
    return 0;
}
