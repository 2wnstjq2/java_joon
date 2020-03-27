li_a=['a','b','c']

for idx in range(len(li_a)):
    print('{}번째 요소 = {}'.format(idx, li_a[idx]))


print('\n ---------------------\n')


# enum_li=enumerate(li_a)

# li_enum_list = list(enum_li)

# print(enum_li)
# print(li_enum_list)

for i, val in enumerate(li_a):
    # print('{}번째 요소 = {}'.format(a, b))
    print('{}번째 요소 = {}'.format(i, val))
