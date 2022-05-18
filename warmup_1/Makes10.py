'''
Given 2 ints, a and b, return True if one if them is 10 or if their sum is 10.
makes10(9, 10) → True
makes10(9, 9) → False
makes10(1, 9) → True

author LZ-FSDev
see https://codingbat.com/prob/p124984
'''

def makes10(a, b):
    return (a == 10 or b == 10) or (a+b == 10)

print("makes10(9, 10) -> " + str(makes10(9, 10)))
print("makes10(9, 9) -> " + str(makes10(9, 9)))
print("makes10(1, 9) -> " + str(makes10(1, 9)))
