'''
Given a string, return a "rotated left 2" version where the first 2 chars are
moved to the end. The string length will be at least 2.
left2('Hello') → 'lloHe'
left2('java') → 'vaja'
left2('Hi') → 'Hi'

@author LZ-FSDev
@see https://codingbat.com/prob/p160545
@since 3.10.2
@version 0.0.2
'''

def left2(str):
    if len(str) <= 2:
        return str
    return str[2:] + str[0:2]

print("left2('Hello') -> " + str(left2('Hello')))
print("left2('java') -> " + str(left2('java')))
print("left2('Hi') -> " + str(left2('Hi')))
print("left2('  t _') -> " + str(left2('  t _')))
print("left2('_._') -> " + str(left2('_._')))
