'''
Given an int array length 2, return True if it contains a 2 or a 3.
has23([2, 5]) → True
has23([4, 3]) → True
has23([4, 5]) → False

author LZ-FSDev
see https://codingbat.com/prob/p177892
'''

def has23(nums):
    return 2 in nums or 3 in nums

array1 = [2, 5]
array2 = [4, 3]
array3 = [4, 5]

print("has23(" + str(array1) + ") -> " + str(has23(array1)))
print("has23(" + str(array2) + ") -> " + str(has23(array2)))
print("has23(" + str(array3) + ") -> " + str(has23(array3)))
