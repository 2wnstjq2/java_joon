from bs4 import BeautifulSoup
import json
import matplotlib.pyplot as plt

html = '''
<ul>
    <li> 100 </li> 
    <li> 200 </li>
</ul> 
<ol>
    <li> 300 </li> 
    <li> 400 </li>
</ol>
'''
soup = BeautifulSoup(html, 'html5lib') 
result = soup.select('li')
for r in result: 
    plt.plot(r.text)
    
plt.show(r.text)