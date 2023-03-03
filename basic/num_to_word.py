num = input("enter your number:")
num1 = {
    "1": "one",
    "2": "two",
    "3": "three",
    "4": "four"

}
out = ""
for ch in num:
    out += num1.get(ch, "!",)+" "
print(out)
