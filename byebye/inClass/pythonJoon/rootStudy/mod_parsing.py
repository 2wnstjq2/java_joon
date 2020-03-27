from bs4 import BeautifulSoup as bs
from urllib import request

# urlopen으로 기상청 자료 가져오기
target = request.urlopen('http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1165051000')

soup = bs(target, 'html.parser')

print(soup.find('title').string)

for datas in soup.find_all('data'):
    print(datas.hour.string, '시 예보 ', end='')
    print(datas.day.string, '' )
    print('현재 온도 : ', datas.temp.string, '도')

