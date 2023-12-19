def ReachValue(N):
    if N == 1:
        return True
    elif N == 10:
        return True
    elif N == 20:
        return True
    elif N % 20 == 0 or N % 10 == 0:
        return ReachValue(N // 20) or ReachValue(N // 10)
    else:
        return False


T = int(input())
for i in range(T):
    N = int(input())
    if ReachValue(N):
        print("YES")
    else: print("NO")