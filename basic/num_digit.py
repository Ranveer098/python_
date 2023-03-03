def find_length(number):
    if number < 10:
        return 1
    else:
        return 1 + find_length(number // 10)


number = 12345
length = find_length(number)
print(length)  # output: 5
