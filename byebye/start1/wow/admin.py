from django.contrib import admin
from wow.models import SangTab

# Register your models here.

class SangTabAdmin(admin.ModelAdmin):
    list_display = ('id','sang','su','dan')
    
admin.site.register(SangTab, SangTabAdmin)
