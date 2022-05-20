'''
Given a non-empty string like "Code" return a string like "CCoCodCode".

string_splosion('Code') → 'CCoCodCode'
string_splosion('abc') → 'aababc'
string_splosion('ab') → 'aab'

author LZ-FSDev
see https://codingbat.com/prob/p118366
'''

def string_splosion(str):
    index = 0
    newString = ""
    while (index < len(str)):
        newString += str[0:index+1]
        index += 1
    return newString

print("string_splosion('Code') -> " + string_splosion('Code'))
print("string_splosion('abc') -> " + string_splosion('abc'))
print("string_splosion('ab') -> " + string_splosion('ab'))
