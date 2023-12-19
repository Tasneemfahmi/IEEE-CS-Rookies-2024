def averageOfArray(arr,n):
    if n==1 :
        sum = arr[0]
        return sum
    else :
        sum = arr[n-1] + (n-1)*averageOfArray(arr,n-1)
    return sum/n
N = int(input())
arr = list(map(int,input().split()))
print("%1.6f" % (averageOfArray(arr,N)))
