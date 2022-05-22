'''
Given an array of ints, return True if one of the first 4 elements in the array
is a 9. The array length may be less than 4.

array_front9([1, 2, 9, 3, 4]) → True
array_front9([1, 2, 3, 4, 9]) → False
array_front9([1, 2, 3, 4, 5]) → False

author LZ-FSDev
see https://codingbat.com/prob/p110166
'''

def array_front9(nums):
    index = 0
    while (index < min(4, len(nums))):
        if nums[index] == 9:
            return True
        index += 1
    return False

array1 = [1, 2, 9, 3, 4]
array2 = [1, 2, 3, 4, 9]
array3 = [1, 2, 3, 4, 5]

print("array_front9(" + str(array1) + ") -> " + str(array_front9(array1)))
print("array_front9(" + str(array2) + ") -> " + str(array_front9(array2)))
print("array_front9(" + str(array3) + ") -> " + str(array_front9(array3)))
