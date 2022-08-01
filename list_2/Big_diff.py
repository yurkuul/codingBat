'''
Given an array length 1 or more of ints, return the difference between the
largest and smallest values in the array. Note: the built-in min(v1, v2) and
max(v1, v2) functions return the smaller or larger of two values.
big_diff([10, 3, 5, 6]) → 7
big_diff([7, 2, 10, 9]) → 8
big_diff([2, 10, 7, 2]) → 8

author LZ-FSDev
see https://codingbat.com/prob/p184853
'''

def big_diff(nums):
    largest = nums[0]
    smallest = nums[0]
    for i in range(len(nums)):
        if (nums[i] > largest):
            largest = nums[i]
        if (nums[i] < smallest):
            smallest = nums[i]
    return largest - smallest

array1 = [10, 3, 5, 6]
array2 = [7, 2, 10, 9]
array3 = [2, 10, 7, 2]
array4 = [1, 6, 8, 3]

print("big_diff(" + str(array1) + ") -> " + str(big_diff(array1)))
print("big_diff(" + str(array2) + ") -> " + str(big_diff(array2)))
print("big_diff(" + str(array3) + ") -> " + str(big_diff(array3)))
print("big_diff(" + str(array4) + ") -> " + str(big_diff(array4)))
