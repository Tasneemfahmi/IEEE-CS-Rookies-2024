def maxPathSum(A, i, j):
    if i == len(A) - 1 and j == len(A[0]) - 1:
        return A[i][j]

    if i + 1 < len(A) and j + 1 < len(A[0]):
        down = maxPathSum(A, i + 1, j)
        right = maxPathSum(A, i, j + 1)
        return A[i][j] + max(down, right)

    if i + 1 < len(A):
        return A[i][j] + maxPathSum(A, i + 1, j)

    if j + 1 < len(A[0]):
        return A[i][j] + maxPathSum(A, i, j + 1)

    return A[i][j]

N, M = map(int, input().split())
A = [list(map(int, input().split())) for _ in range(N)]
result = maxPathSum(A, 0, 0)
print(result)
