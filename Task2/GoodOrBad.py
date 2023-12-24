T = int(input())
array = ["Bad"] * T
for x in range(T):
    S = str(input())
    if "101" in S or "010" in S:
        array[x] = "Good"
for x in array :
    print(x)