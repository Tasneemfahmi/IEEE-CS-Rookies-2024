N = int(input())
A = list(map(int, input().split()))
B = list(map(int, input().split()))
for i in range(N):
    print(B[i],end=" ")
for i in range(N-1):
    print(A[i],end=" ")
print(A[N-1])