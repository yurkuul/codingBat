'''
Given 2 strings, a and b, return the number of the positions where they contain
the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the
"xx", "aa", and "az" substrings appear in the same place in both strings.

string_match('xxcaazz', 'xxbaaz') → 3
string_match('abc', 'abc') → 2
string_match('abc', 'axc') → 0

author LZ-FSDev
see https://codingbat.com/prob/p182414
'''

def string_match(a, b):
    counter = 0
    for i in range(min(len(a), len(b))-1):
        sectionA = a[i:i+2]
        sectionB = b[i:i+2]
        if (sectionA == sectionB):
            counter += 1
    return counter

print("string_match('xxcaazz', 'xxbaaz') -> " + str(string_match('xxcaazz', 'xxbaaz')))
print("string_match('abc', 'abc') -> " + str(string_match('abc', 'abc')))
print("string_match('abc', 'axc') -> " + str(string_match('abc', 'axc')))
