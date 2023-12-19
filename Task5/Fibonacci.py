def fibonacci(n):
    if n <= 2:
        return n-1
    else:
        return fibonacci(n-1)+fibonacci(n-2)
N = int(input())
print(fibonacci(N))