from tkinter import *
from tkinter import messagebox
from tkinter import filedialog
# tkinter : GUI 관련 모듈

# 이벤트 함수 : 핸들러 함수
def myFunc():
    messagebox.showinfo('ppororo', '내친구 뽀로로')

# def open_file():
#     Window.filename = filedialog.askopenfilename(
#     initialdir = "E:/Images",
#     title = "choose your file",
#     filetypes = (("jpeg files","*.jpg"),("all files","*.*"))) 
#     Image(Window.filename)

# window생성
Window = Tk() #윈도우 생성 반환
# 윈도우 이름 설정
Window.title('pre vision') #윈도의 이름
Window.geometry('400x500') #윈도의 사이즈:폭x높이
# Window.resizable(width=FALSE, height=FALSE) #윈도우의 사이즈 조정 여부 설정

# 텍스트 표현을 위한 label
# test : 화면에 표시할 텍스트
# font : 폰트의 종류와 사이즈
# fg : 폰트컬러 
# bg : 배경색
# width : text영역 : 너비
# height : text영역 : 높이
# anchor : text영역 : 위치
label_a = Label(
    Window, text='윈도 1', font=('궁서체', 15), 
    fg='red', bg='green', width=10, height=2, )

label_c = Label(
    Window, text='python~윈도 3', font=('궁서체', 20), 
    fg='red', bg='pink', width=45, height=2, anchor=S )

# 이미지 위젯
pt = PhotoImage(file='ppororo.png')
label_i = Label(Window, image=pt, anchor=E)



# 버튼 위젯
btn_close = Button(Window, text='exit', fg='red', bg='white', command=quit)


# 이미지 버튼처리, 이벤트 핸들러 함수 이용
btn_img = Button(Window, image=pt, bg='white', command=myFunc)

# 윈도우에 위젯 배치
# label_c.pack()
label_a.pack()
# label_i.pack()
btn_img.pack()
btn_close.pack()


# window print
Window.mainloop()
