'''
Given a non-negative number "num", return True if num is within 2 of a multiple
of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.

near_ten(12) → True
near_ten(17) → False
near_ten(19) → True
'''

def near_ten(num):
    return num % 10 <= 2 or num % 10 >= 8

print("near_ten(12) -> " + str(near_ten(12)))
print("near_ten(17) -> " + str(near_ten(17)))
print("near_ten(19) -> " + str(near_ten(19)))
print("near_ten(210) -> " + str(near_ten(210)))
print("near_ten(91) -> " + str(near_ten(91)))
