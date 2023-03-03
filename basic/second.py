
def SecondLowest(arr):
    arr.sort()

    return arr[1]


def SecondHighest(arr):

    arr.sort()

    return arr[-2]


arr = [12, 45, 2, 41, 31, 10, 8, 6, 4]
print("Second Highest element is:", SecondHighest(arr))
print("Second Lowest element is:", SecondLowest(arr))
