'''
Given a string, we'll say that the front is the first 3 chars of the string. If
the string length is less than 3, the front is whatever is there. Return a new
string which is 3 copies of the front.

front3('Java') → 'JavJavJav'
front3('Chocolate') → 'ChoChoCho'
front3('abc') → 'abcabcabc'

author LZ-FSDev
see https://codingbat.com/prob/p147920
'''

def front3(str):
    if (len(str) >= 3):
        str = str[0:3]
    return str*3

print("front3('Java') -> " + front3('Java'))
print("front3('Chocolate') -> " + front3('Chocolate'))
print("front3('abc') -> " + front3('abc'))
