'''
Given an array of ints, return a new array length 2 containing the first and
last elements from the original array. The original array will be length 1 or more.
make_ends([1, 2, 3]) → [1, 3]
make_ends([1, 2, 3, 4]) → [1, 4]
make_ends([7, 4, 6, 2]) → [7, 2]

author LZ-FSDev
see https://codingbat.com/prob/p124806
'''

def make_ends(nums):
    return [nums[0]] + [nums[len(nums)-1]]

array1 = [1, 2, 3]
array2 = [1, 2, 3, 4]
array3 = [7, 4, 6, 2]

print("make_ends(" + str(array1) + ") -> " + str(make_ends(array1)))
print("make_ends(" + str(array2) + ") -> " + str(make_ends(array2)))
print("make_ends(" + str(array3) + ") -> " + str(make_ends(array3)))
