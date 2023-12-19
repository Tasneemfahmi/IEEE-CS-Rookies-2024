A, B, Q = map(int, input().split())

def calculateF(A, B, Q):
    if Q == 1:
        return A
    elif Q == 2:
        return B
    else:
        if Q % 3 == 0:
            return A ^ B
        elif (Q + 1) % 3 == 0:
            return B
        else:
            return A

result = calculateF(A, B, Q)
print(result)
