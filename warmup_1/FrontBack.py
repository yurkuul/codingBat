'''
Given a string, return a new string where the first and last chars have been
exchanged.
front_back('code') → 'eodc'
front_back('a') → 'a'
front_back('ab') → 'ba'

@author LZ-FSDev
@see https://codingbat.com/prob/p153599
@since 3.10.2
@version 0.0.1
'''

def front_back(str):
    if len(str) == 1:
        return str
    return str[len(str)-1:] + str[1:len(str)-1] + str[0:1]

print("front_back('code') -> " + str(front_back('code')))
print("front_back('a') -> " + str(front_back('a')))
print("front_back('ab') -> " + str(front_back('ab')))
