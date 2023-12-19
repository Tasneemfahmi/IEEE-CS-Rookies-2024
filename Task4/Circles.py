import math

x1,y1,x2,y2 = map(int,input().split())
x3,y3,x4,y4 = map(int,input().split())
def areIntersecting(x1, y1, x2, y2, x3, y3, x4, y4):
    center1 = ((x1 + x2) / 2, (y1 + y2) / 2)
    center2 = ((x3 + x4) / 2, (y3 + y4) / 2)
    distance = math.sqrt((center2[0] - center1[0])**2 + (center2[1] - center1[1])**2)
    radiusCircle1 = math.sqrt((x2 - x1)**2 + (y2 - y1)**2) / 2
    radiusCircle2 = math.sqrt((x4 - x3)**2 + (y4 - y3)**2) / 2
    return distance <= radiusCircle1 + radiusCircle2

result = areIntersecting(x1, y1, x2, y2, x3, y3, x4, y4)
if result :
    print("YES")
else :
    print("NO")