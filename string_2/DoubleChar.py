'''
Given a string, return a string where for every char in the original, there are
two chars.
double_char('The') → 'TThhee'
double_char('AAbb') → 'AAAAbbbb'
double_char('Hi-There') → 'HHii--TThheerree'

@author LZ-FSDev
@see https://codingbat.com/prob/p170842
@since 3.10.2
@version 0.0.1
'''

def double_char(str):
    doubleChar = ""
    for i in range(len(str)):
        doubleChar += str[i:i+1] + str[i:i+1]
    return doubleChar
    
print("double_char('The') -> " + str(double_char('The')))
print("double_char('AAbb') -> " + str(double_char('AAbb')))
print("double_char('Hi-There') -> " + str(double_char('Hi-There')))
print("double_char('') -> " + str(double_char('')))
print("double_char('983274') -> " + str(double_char('983274')))
