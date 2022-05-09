'''
Given an array of ints, return the sum of the first 2 elements in the array. If
the array length is less than 2, just sum up the elements that exist, returning
0 if the array is length 0.
sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2

author LZ-FSDev
see https://codingbat.com/prob/p192589
'''

def sum2(nums):
    if (len(nums) >= 2):
        return nums[0] + nums[1]
    elif (len(nums) == 1):
        return nums[0]
    return 0

array1 = [1, 2, 3]
array2 = [1, 1]
array3 = [1, 1, 1, 1]

print("sum2(" + str(array1) + ") -> " + str(sum2(array1)))
print("sum2(" + str(array2) + ") -> " + str(sum2(array2)))
print("sum2(" + str(array3) + ") -> " + str(sum2(array3)))
