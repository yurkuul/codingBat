'''
Return the number of times that the string "hi" appears anywhere in the given
string.
count_hi('abc hi ho') → 1
count_hi('ABChi hi') → 2
count_hi('hihi') → 2

@author LZ-FSDev
@see https://codingbat.com/prob/p167246
@since 3.10.2
@version 0.0.1
'''

def count_hi(str):
    count = 0
    for i in range(len(str)-1):
        if str[i:i+2] == "hi":
            count = count + 1
    return count

print("count_hi('abc hi ho') -> " + str(count_hi('abc hi ho')))
print("count_hi('ABChi hi') -> " + str(count_hi('ABChi hi')))
print("count_hi('hihi') -> " + str(count_hi('hihi')))
