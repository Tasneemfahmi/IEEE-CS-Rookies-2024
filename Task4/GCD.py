A,B = map(int, input().split())
def calculateGCD(A, B):
    while B != 0:
        temp = B
        B = A % B
        A = temp
    return A
def calculateLCM(A, B):
    return (A * B) // calculateGCD(A, B)

print(calculateGCD(A, B), calculateLCM(A, B))
