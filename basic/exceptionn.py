try:
  age=int(input("enter ur age:"))
  income=int(input())
  t=income/age
  print(t)
except ValueError:
  print("Inavlid input")
except ZeroDivisionError:
  print("age cant be zero")
except CallTime

