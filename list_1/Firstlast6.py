'''
Given an array of ints, return True if 6 appears as either the first or last
element in the array. The array will be length 1 or more.
first_last6([1, 2, 6]) → True
first_last6([6, 1, 2, 3]) → True
first_last6([13, 6, 1, 2, 3]) → False

author LZ-FSDev
see https://codingbat.com/prob/p181624
'''

def first_last6(nums):
    return nums[0] == 6 or nums[len(nums)-1] == 6

array1 = [1, 2, 6]
array2 = [6, 1, 2, 3]
array3 = [13, 6, 1, 2, 3]

print("first_last6( " + str(array1) + ") -> " + str(first_last6(array1)))
print("first_last6( " + str(array2) + ") -> " + str(first_last6(array2)))
print("first_last6( " + str(array3) + ") -> " + str(first_last6(array3)))
