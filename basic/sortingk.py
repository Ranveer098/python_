num = [5, 2, 8, 1, 6]
def sort_list(x):
    for i in range(len(x)):
        for j in range(i, len(x)):
            if x[j] < x[i]:
                x[i], x[j] = x[j], x[i]



sort_list(num)
print(num)
