class Person:
  def __init__(self,name):
    self.name=name
    
  def talk(self):
    print(f"Hi i am {self.name}")

per= Person("ranveer")
per.talk()
per2=Person("harry")
per2.talk()


