class Mammals:
  def warm(self):
    print("they are warm blooded animal")


class Cat(Mammals):
  pass
class Dog(Mammals):
  pass

d1=Dog()
d1.warm()
