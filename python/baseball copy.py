import datetime

# 인트인 숫자 6자리를 받고 str으로 바꿔서 3개를 추출    
wow = str(datetime.datetime.now().microsecond)[1:4]
# 리스트에 저장(str)
quest = list(wow)

print(quest)

# 새로운 str리스트
myNum = list('123')

s=0
b=0

for i in range(0, 3):
    print(i,'번')
    
    # print(type(quest[i]))
    if myNum[i]==quest[i]:
        s = s+1
        print('s', s)
        
    elif myNum[i] in quest:
        b = b+1
        print('b', b)
        

print('s : {}, b : {} // s+b : {}'.format(s,b,s+b))



# def serch(myNum): #s+b=3 일때 값을 찾을 함수    

#     def swich(myNum): #2,3번 바꾸기
#         t = myNum[1]
#         myNum[1] = myNum[2]
#         myNum[2] = t

#     def swich2(myNum): #1,3번 바꾸기
#         t = myNum[0]
#         myNum[0] = myNum[2]
#         myNum[2] = t


#     if myNum == quest:           
#         print(myNum)        
#     else:    
#         swich(myNum)
#         print(myNum)
#         if myNum == quest:            
#             print(myNum)
#         else:        
#             swich2(myNum)
#             print(myNum)

#             if myNum == quest:                
#                 print(myNum)
#             else:            
#                 swich(myNum)
#                 print(myNum)
#                 if myNum == quest:                    
#                     print(myNum)
#                 else:                
#                     swich2(myNum)
#                     print(myNum)

#                     if myNum == quest:                        
#                         print(myNum)
#                     else:                    
#                         swich(myNum)                                            
#                         print(myNum)
    
