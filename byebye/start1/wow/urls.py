from django.urls import path
from . import views

urlpatterns = [
    path('list', views.ListFunc),
    path('insert', views.InsertFunc),
    path('insertok', views.InsertFuncOk),
    path('update', views.UpdateFunc),
    path('updateok', views.UpdateFuncOk),
    path('delete', views.DeleteFunc),
    path('main', views.Main),

]
