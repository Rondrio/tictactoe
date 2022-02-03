#include <stdio.h>
#include <wchar.h>
#include <windows.h>


int main()
{
    // Set output mode to handle virtual terminal sequences
    HANDLE hOut = GetStdHandle(STD_OUTPUT_HANDLE);
    if (hOut == INVALID_HANDLE_VALUE)
    {
        return GetLastError();
    }

    DWORD dwMode = 0;
    if (!GetConsoleMode(hOut, &dwMode))
    {
        return GetLastError();
    }

    dwMode |= 0x0004;
    if (!SetConsoleMode(hOut, dwMode))
    {
        return GetLastError();
    }

    system("java TestTicTacToe");

    return 0;
}