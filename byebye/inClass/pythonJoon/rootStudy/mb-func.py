def repeat(n, *val):
    list_args = val
    print(list_args)


    for i in range(n):
        # 가변매개변수의 데이터를 출력
        for v in val:
            print(v)
        print()

repeat(3, 'hi', '메롱', 'wow')