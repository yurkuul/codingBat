'''
Given an array of ints, return True if the array is length 1 or more, and the
first element and the last element are equal.
same_first_last([1, 2, 3]) → False
same_first_last([1, 2, 3, 1]) → True
same_first_last([1, 2, 1]) → True
'''

def same_first_last(nums):
  return len(nums) >= 1 and nums[0] == nums[len(nums)-1]

array1 = [1, 2, 3]
array2 = [1, 2, 3, 1]
array3 = [1, 2, 1]

print("same_first_last(" + str(array1) + ") -> " + str(same_first_last(array1)))
print("same_first_last(" + str(array2) + ") -> " + str(same_first_last(array2)))
print("same_first_last(" + str(array3) + ") -> " + str(same_first_last(array3)))
