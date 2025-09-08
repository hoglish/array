#Программа для создания массива строчных и заглавных букв

str = ["а",'т','А','в','В','Г','Л','д']

strUp=[]
strDown=[]

for item in range(len(str)):
    if str[item-1].islower():
        strDown.append(str[item-1])
    else:
        strUp.append(str[item-1])
print(f"Массив данных с заглавными буквами {strUp}")
print(f"Массив данных со строчными буквами {strDown}")