'''
Given 2 ints, a and b, return their sum. However, sums in the range 10..19
inclusive, are forbidden, so in that case just return 20.
sorta_sum(3, 4) → 7
sorta_sum(9, 4) → 20
sorta_sum(10, 11) → 21

@author LZ-FSDev
@see https://codingbat.com/prob/p116620
@since 3.10.2
@version 0.0.1
'''

def sorta_sum(a, b):
    if (a+b) >= 10 and (a+b) <= 19:
        return 20
    return a+b

print("sorta_sum(3, 4) -> " + str(sorta_sum(3, 4)))
print("sorta_sum(9, 4) -> " + str(sorta_sum(9, 4)))
print("sorta_sum(10, 11) -> " + str(sorta_sum(10, 11)))
