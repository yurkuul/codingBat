'''
Given a string of even length, return the first half. So the string "WooHoo"
yields "Woo".
first_half('WooHoo') → 'Woo'
first_half('HelloThere') → 'Hello'
first_half('abcdef') → 'abc'
'''

def first_half(str):
    return str[0:int(len(str)/2)]

print("first_half('WooHoo') -> " + str(first_half('WooHoo')))
print("first_half('HelloThere') -> " + str(first_half('HelloThere')))
print("first_half('abcdef') -> " + str(first_half('abcdef')))
print("first_half('') -> " + str(first_half('')))
print("first_half('  ') -> " + str(first_half('  ')))
