import math
T = int(input())
if T==1 :
    N, X = input().split()
elif T==2 :
    N, X = map(int, input().split())
def convertBase(T, N, X):
    def convertLetterToDigit(digit):
        if '0' <= digit <= '9':
            return int(digit)
        elif 'A' <= digit <= 'Z':
            return ord(digit) - ord('A') + 10
    def convertDigitToLetter(digit):
        if 0 <= digit <= 9:
            return int(digit)
        elif digit >= 10:
            return chr(digit - 10 + ord('A'))
    if T == 1:
        converted = 0
        toBeConverted = str(N)
        for i,digit in enumerate(toBeConverted):
            converted = converted + convertLetterToDigit(digit) * int(math.pow(int(X), len(toBeConverted) - i - 1))
        return converted
    elif T == 2:
        length = math.ceil(math.log(N, X))
        converted = ""
        for i in range(length):
            remainder = N % X
            N = N // X
            converted = str(convertDigitToLetter(remainder)) + converted
        return converted

print(convertBase(T,N,X))
