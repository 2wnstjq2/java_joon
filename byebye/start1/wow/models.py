from django.db import models

class SangTab(models.Model):
    code = models.CharField(max_length=20)
    sang = models.CharField(max_length=30)
    su = models.IntegerField()
    dan = models.IntegerField()


class Count(models.Model):
    x_way = models.IntegerField()
    y_way = models.IntegerField()