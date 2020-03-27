li_a = []

for i in range(0,18,3): #0 3 6 9 12 15
    li_a.append(i*i)

print(li_a)

print()
li_b = [2*i for i in range(0,10,2)] #0 2 4 6 8
print(li_b)

print()
li_b = [i-6 for i in range(0,20,4) if i>5]  #0 4 // 8 12 16 
print(li_b)
