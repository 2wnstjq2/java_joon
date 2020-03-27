from mod_basic.phonbook import phonebookMng as pbm
import sys

# 삭제, 검색

while True:
    print('메뉴를 입력해 주세요\n 1.데이터입력 \n 2.전체 출력 \n 3.수정 \n 4.삭제 \n 5.종료')
    choice = input('메뉴 번호>>')

    if choice == '1':
        pbm.insertmember()        
    elif choice == '2':
        pbm.showlist()
    elif choice == '3':
       pbm.editmember()
    elif choice == '4':
        pbm.deletemember()
    elif choice == '5':
        # break
        sys.exit()
    else :
        print('잘못된 입력입니다.')
 