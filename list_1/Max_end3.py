'''
Given an array of ints length 3, figure out which is larger, the first or last
element in the array, and set all the other elements to be that value. Return
the changed array.
max_end3([1, 2, 3]) → [3, 3, 3]
max_end3([11, 5, 9]) → [11, 11, 11]
max_end3([2, 11, 3]) → [3, 3, 3]

author LZ-FSDev
see https://codingbat.com/prob/p135290
version 0.0.2
'''

def max_end3(nums):
    bigger = max(nums[0], nums[len(nums)-1])
    nums[0:3] = [bigger, bigger, bigger]
    return nums

array1 = [1, 2, 3]
array2 = [11, 5, 9]
array3 = [2, 11, 3]

print("max_end3(" + str(array1) + ") -> " + str(max_end3(array1)))
print("max_end3(" + str(array2) + ") -> " + str(max_end3(array2)))
print("max_end3(" + str(array3) + ") -> " + str(max_end3(array3)))
