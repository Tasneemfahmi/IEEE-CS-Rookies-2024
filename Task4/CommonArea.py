def findCommonArea(rectangles):
    commonArea = rectangles[0]

    for rect in rectangles[1:]:
        commonArea = (
            max(commonArea[0], rect[0]),
            max(commonArea[1], rect[1]),
            min(commonArea[2], rect[2]),
            min(commonArea[3], rect[3])
        )

        if commonArea[0] >= commonArea[2] or commonArea[1] >= commonArea[3]:
            return 0

    area = (commonArea[2] - commonArea[0]) * (commonArea[3] - commonArea[1])
    return area


def processCase(N, inputLines):
    rectangles = [tuple(map(int, inputLines[i].split())) for i in range(N)]

    return findCommonArea(rectangles)


T = int(input())
result = []

for case in range(1, T + 1):
    N = int(input())
    inputLines = [input() for _ in range(N)]
    result.append(processCase(N, inputLines))

for i, printedResult in enumerate(result, start=1):
    print(f"Case #{i}: {printedResult}")
