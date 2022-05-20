'''
Given a string, return a new string made of every other char starting with the
first, so "Hello" yields "Hlo".

string_bits('Hello') → 'Hlo'
string_bits('Hi') → 'H'
string_bits('Heeololeo') → 'Hello'

author LZ-FSDev
see https://codingbat.com/prob/p113152
'''

def string_bits(str):
    index = 0
    newString = ""
    while (index < len(str)):
        newString += str[index:index+1]
        index += 2
    return newString

print("string_bits('Hello') -> " + string_bits('Hello'))
print("string_bits('Hi') -> " + string_bits('Hi'))
print("string_bits('Heeololeo') -> " + string_bits('Heeololeo'))
