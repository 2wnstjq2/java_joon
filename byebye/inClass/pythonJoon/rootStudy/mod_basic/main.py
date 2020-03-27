import test_mod as tm
# from test_mod import num_input

print(tm.__name__)

r= tm.num_input()

print('원둘레 : ', tm.get_circle(r))
print('원면적 : ', tm.get_ccarea(r))

# print(tm.__package__)
# print(tm.__name__)
# print(tm.__doc__)
# print(tm.__file__)

