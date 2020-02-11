# 데이터 저장을 위한 클래스
# 기능 클래스 -> 기능 모듈
# 데이터를 저장하고 있는 배열(리스트) -> []
# 기능 메서드 : 입력(리스트), 삭제(리스트 삭제), 검색, 전체출력

# 친구의 정보 저장할 리스트
pBooks = []

def insertmember():
    
    name = input('이름을 입력해 주세요')
    pNum = input('전화번호를 입력해 주세요')
    bDay = input('생일을 입력해 주세요')
    
    member = {       
        'name' : name,
        'phonenumber' : pNum,
        'birthday' : bDay        
    }
    pBooks.append(member)
    


def showlist():
    for member in pBooks:
        print(member)
        

def deletemember():
    x = input('삭제할 대상의 이름을 적어주세요')
    for member in pBooks:
        if x==member['name']:
            del pBooks[pBooks.index(member)]
            break
        else:
            print('찾으시는 대상이 없습니다')

def editmember():
    x = input('수정할 대상의 이름을 적어주세요')
    for member in pBooks:
        if x==member['name']:
            del pBooks[pBooks.index(member)]
            insertmember()
            break
        else:
            print('찾으시는 대상이 없습니다')
    
