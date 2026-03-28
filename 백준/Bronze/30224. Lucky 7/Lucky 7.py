a = input()
s = int(a)

isContainSeven = '7' in a
isModulaZero = (s % 7 == 0)

if not isContainSeven and not isModulaZero:
    print(0)
elif not isContainSeven and isModulaZero:
    print(1)
elif isContainSeven and not isModulaZero:
    print(2)
else:
    print(3)