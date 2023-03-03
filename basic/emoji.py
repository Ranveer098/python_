mess=input(">")
w=mess.split(' ')
emoji={
  "):":"😊",
  "(:":"😒",

}
out=""
for ch in w:
  out+=emoji.get(ch,mess)
print(out)