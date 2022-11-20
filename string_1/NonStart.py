'''
Given 2 strings, return their concatenation, except omit the first char of
each. The strings will be at least length 1.
non_start('Hello', 'There') → 'ellohere'
non_start('java', 'code') → 'avaode'
non_start('shotl', 'java') → 'hotlava'
'''

def non_start(a, b):
    return a[1:] + b[1:]

print("non_start('Hello', 'There') -> " + str(non_start('Hello', 'There')))
print("non_start('java', 'code') -> " + str(non_start('java', 'code')))
print("non_start('shotl', 'java') -> " + str(non_start('shotl', 'java')))
print("non_start(' _', '_ _') -> " + str(non_start(' _', '_ _')))
print("non_start('wow', ' w') -> " + str(non_start('wow', ' w')))
