'''
Given a string, return a new string made of 3 copies of the last 2 chars of the
original string. The string length will be at least 2.
extra_end('Hello') → 'lololo'
extra_end('ab') → 'ababab'
extra_end('Hi') → 'HiHiHi'
'''

def extra_end(str):
    end = str[len(str)-2:]
    return end + end + end

print("extra_end('Hello') -> " + str(extra_end('Hello')))
print("extra_end('ab') -> " + str(extra_end('ab')))
print("extra_end('Hi') -> " + str(extra_end('Hi')))
