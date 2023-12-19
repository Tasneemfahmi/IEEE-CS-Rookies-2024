def threeNPlusOne(n):
    if n == 1:
        return 1
    elif n==2 :
        return 2
    elif n%2 != 0 :
        return 1+threeNPlusOne(3*n+1)
    else :
        return 1+threeNPlusOne(n//2)
N = int(input())
print(threeNPlusOne(N))
