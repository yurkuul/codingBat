'''
Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged.
not_string('candy') → 'not candy'
not_string('x') → 'not x'
not_string('not bad') → 'not bad'

author LZ-FSDev
see https://codingbat.com/prob/p189441
'''

def not_string(str):
    if (str[0:3] != "not"):
        str = "not " + str
    return str

print("not_string('candy') -> " + not_string('candy'))
print("not_string('x') -> " + not_string('x'))
print("not_string('not bad') -> " + not_string('not bad'))
