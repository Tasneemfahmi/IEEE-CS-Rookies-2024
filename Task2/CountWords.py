S = str(input())
words = S.split()
filteredWords = [word for word in words if any(c.isalpha() for c in word)]
print(len(filteredWords))