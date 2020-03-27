with open('info.txt', 'r', encoding='utf-8') as file:
    for line in file:
        (name, wt, ht) = line.strip().split(",")

        if(not name) or (not wt) or (not ht):
            continue

        bmi = int(wt)/(int(ht)*int(ht))*10000
        res = ""
        if 18.5<bmi<25:
            res = "정상"
        else:
            res = "비정상"



        print('이름:{} 몸무게:{} 키:{} BMI:{} \n 결과:{}'.format(name,wt,ht,bmi,res))