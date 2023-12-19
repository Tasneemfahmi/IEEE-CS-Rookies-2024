def knapsack(weights, values, W, N):
    if N == 0 or W == 0:
        return 0

    if weights[N - 1] > W:
        return knapsack(weights, values, W, N - 1)

    included = values[N - 1] + knapsack(weights, values, W - weights[N - 1], N - 1)
    excluded = knapsack(weights, values, W, N - 1)

    return max(included, excluded)

N, W = map(int, input().split())
weights = []
values = []

for i in range(N):
    weight, value = map(int, input().split())
    weights.append(weight)
    values.append(value)

result = knapsack(weights, values, W, N)
print(result)
