'''
Given a string, return the count of the number of times that a substring length
2 appears in the string and also as the last 2 chars of the string, so
"hixxxhi" yields 1 (we won't count the end substring).

last2('hixxhi') → 1
last2('xaxxaxaxx') → 1
last2('axxxaaxx') → 2

author LZ-FSDev
see https://codingbat.com/prob/p145834
'''

def last2(str):
    counter = 0
    strEnd = str[len(str)-2:]
    for i in range(len(str)-2):
        if (str[i:i+2] == strEnd):
            counter +=1
    return counter

print("last2('hixxhi') -> " + str(last2('hixxhi')))
print("last2('xaxxaxaxx') -> " + str(last2('xaxxaxaxx')))
print("last2('axxxaaxx') -> " + str(last2('axxxaaxx')))
