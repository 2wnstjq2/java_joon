from django.shortcuts import render
from wow.models import SangTab

from django.http.response import HttpResponseRedirect

# Create your views here.
def Main(request):
    return render(request, 'main.html')

def ListFunc(request):
    datas = SangTab.objects.all()
    return render(request, 'list.html', {'juns':datas})
    ''' (데이터 받을 때 튜플로 받아야 됨)
    sql = "select * from my_jun_sangtab"
    cursor = connection.cursor()
    cursor.execute(sql)
    datas = cursor.fetchall()
    return render(request, 'list.htlm', {'juns':datas})
    '''

def InsertFunc(request):
    return render(request, 'insert.html')

def InsertFuncOk(request):
    if request.method == 'POST':
        SangTab(
            code = request.POST.get('code'),
            sang = request.POST.get('sang'),
            su = request.POST.get('su'),
            dan = request.POST.get('dan'),
        ).save()
    return HttpResponseRedirect('/jun/list') #추가 후 목록보기

def UpdateFunc(request):
    #print(request.GET.get('id'))
    data = SangTab.objects.get(id=request.GET.get('id'))
    #print(data)
    return render(request, 'update.html', {'sang_one': data})

def UpdateFuncOk(request):
    if request.method == 'POST':
        upRec = SangTab.objects.get(id=request.POST.get('id'))
        upRec.code = request.POST.get('code')
        upRec.sang = request.POST.get('sang')
        upRec.su = request.POST.get('su')
        upRec.dan = request.POST.get('dan')
        upRec.save()
    return HttpResponseRedirect('/jun/list') #추가 후 목록보기

def DeleteFunc(request):
    delRec = SangTab.objects.get(id=request.GET.get('id'))
    delRec.delete()
    return HttpResponseRedirect('/jun/list') #추가 후 목록보기
