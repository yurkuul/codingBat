'''
Given an array of ints, return True if the array contains a 2 next to a 2
somewhere.
has22([1, 2, 2]) → True
has22([1, 2, 1, 2]) → False
has22([2, 1, 2]) → False

author LZ-FSDev
see https://codingbat.com/prob/p119308
'''

def has22(nums):
    for i in range (len(nums)-1):
        if (nums[i] == 2 and nums[i+1] == 2):
            return True
    return False

array1 = [1, 2, 2]
array2 = [1, 2, 1, 2]
array3 = [2, 1, 2]
array4 = [2, 2, 2]
array5 = []

print("has22(" + str(array1) + ") -> " + str(has22(array1)))
print("has22(" + str(array2) + ") -> " + str(has22(array2)))
print("has22(" + str(array3) + ") -> " + str(has22(array3)))
print("has22(" + str(array4) + ") -> " + str(has22(array4)))
print("has22(" + str(array5) + ") -> " + str(has22(array5)))
