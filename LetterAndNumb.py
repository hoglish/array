# Программа для разбития массива данных на два массива с числами и буквами

str = ["а",'1','6','в','8','Г','9','д']

strNumb = []
strLetter = []

for item in range(len(str)):
    if str[item-1].isdigit():
        strNumb.append(str[item-1])
    else:
        strLetter.append(str[item-1])

del str

print(f"Массив данных с буквами {strLetter}")
print(f"Массив данных с числами {strNumb}")