'''
Given a string, return the string made of its first two chars, so the String
"Hello" yields "He". If the string is shorter than length 2, return whatever
there is, so "X" yields "X", and the empty string "" yields the empty string
"".
first_two('Hello') → 'He'
first_two('abcdefg') → 'ab'
first_two('ab') → 'ab'
'''

def first_two(str):
    if len(str) <= 2:
        return str
    return str[0:2]

print("first_two('Hello') -> " + str(first_two('Hello')))
print("first_two('abcdefg') -> " + str(first_two('abcdefg')))
print("first_two('ab') -> " + str(first_two('ab')))
print("first_two(' o') -> " + str(first_two(' o')))
print("first_two('') -> " + str(first_two('')))
print("first_two('x') -> " + str(first_two('x')))
