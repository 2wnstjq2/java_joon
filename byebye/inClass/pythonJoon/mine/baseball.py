
# [fN, sN, lN] = (3, 8, 9)

quest = [3, 8, 9]

# selNum = list('0123456789')

# [x, y, z] = [9, 8, 3]

myNum = [9, 8, 3]

s=0
b=0

for i in range(len(myNum)):
    if myNum[i] not in quest:
        print('xxxxxxx')
    else:
        if myNum[i]==quest[i]:
            s = s+1
        else:
            b = b+1

print('s : {}, b : {} // s+b : {}'.format(s,b,s+b))

print(quest)
print(myNum)
print()


def serch(): #s+b=3 일때 값을 찾을 함수
    
    def swich(list): #2,3번 바꾸기
        t = myNum[1]
        myNum[1] = myNum[2]
        myNum[2] = t

    def swich2(list): #1,3번 바꾸기
        t = myNum[0]
        myNum[0] = myNum[2]
        myNum[2] = t

    if myNum == quest:    
        print('1:right!')
        print(myNum)        
    else:    
        swich(myNum)
        print(myNum)
        if myNum == quest:
            print('2:right!')
            print(myNum)
        else:        
            swich2(myNum)
            print(myNum)
            if myNum == quest:
                print('3:right!')
                print(myNum)
            else:            
                swich(myNum)
                print(myNum)
                if myNum == quest:
                    print('4:right!')
                    print(myNum)
                else:                
                    swich2(myNum)
                    print(myNum)
                    if myNum == quest:
                        print('5:right!')
                        print(myNum)
                    else:                    
                        swich(myNum)                    
                        print('6:right!')
                        print(myNum)
    
