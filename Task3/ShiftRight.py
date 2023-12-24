N,X = [int(x) for x in input().split()]
list = list(map(int, input().split()))
for i in range(X) :
    Num = list[N-1]
    list.pop(N-1)
    list.insert(0,Num)
for i in range(N) :
    print(list[i],end=" ")