'''
Given an array of ints, return the number of 9's in the array.

array_count9([1, 2, 9]) → 1
array_count9([1, 9, 9]) → 2
array_count9([1, 9, 9, 3, 9]) → 3

author LZ-FSDev
see https://codingbat.com/prob/p166170
'''

def array_count9(nums):
    counter = 0
    for i in range (len(nums)):
        if nums[i] == 9:
            counter += 1
    return counter

array1 = [1, 2, 9]
array2 = [1, 9, 9]
array3 = [1, 9, 9, 3, 9]

print("array_count9(" + str(array1) + ") -> " + str(array_count9(array1)))
print("array_count9(" + str(array2) + ") -> " + str(array_count9(array2)))
print("array_count9(" + str(array3) + ") -> " + str(array_count9(array3)))
