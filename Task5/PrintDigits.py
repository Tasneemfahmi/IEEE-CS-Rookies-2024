def printDigit(n):
    if (n == 0):
        return
    printDigit(n // 10)
    print(n % 10,end=" ")
T = int(input())
for i in range(T):
    N = int(input())
    printDigit(N)
    print()

