'''
Given an array of ints, return True if the sequence of numbers 1, 2, 3 appears
in the array somewhere.

array123([1, 1, 2, 3, 1]) → True
array123([1, 1, 2, 4, 1]) → False
array123([1, 1, 2, 1, 2, 3]) → True

author LZ-FSDev
see https://codingbat.com/prob/p193604
'''

def array123(nums):
    for i in range(len(nums)-2):
        if nums[i] == 1 and nums[i+1] == 2 and nums[i+2] == 3:
            return True
    return False


array1 = [1, 1, 2, 3, 1]
array2 = [1, 1, 2, 4, 1]
array3 = [1, 1, 2, 1, 2, 3]

print("array123(" + str(array1) + ") -> " + str(array123(array1)))
print("array123(" + str(array2) + ") -> " + str(array123(array2)))
print("array123(" + str(array3) + ") -> " + str(array123(array3)))
