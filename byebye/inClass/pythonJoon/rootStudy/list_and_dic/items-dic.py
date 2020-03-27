dic_ex = {
'a':'1',
'b':'2',
'c':'3'
}

for k in dic_ex:
    print('{}는 {}'.format(k, dic_ex[k]))

dic_ex_item = dic_ex.items()

print(dic_ex_item)

for k, v in dic_ex_item:
    print('{}={}'.format(k,v))