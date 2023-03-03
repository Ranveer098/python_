def sep(num):
    odd=[]
    even=[]
    for num in numbers:
        if num%2==0:
            even.append(num)
        else:
            odd.append(num)
    return even,odd



numbers=[2,1,5,8,10,14,19]
odd,even=sep(numbers)
print(even)
print(odd)


