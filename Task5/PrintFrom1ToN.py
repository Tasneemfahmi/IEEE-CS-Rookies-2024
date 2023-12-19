def printN(n):
  if n > 0:
    printN(n - 1)
    print(n)

N = int(input())
printN(N)