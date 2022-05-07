'''
Given an array of ints length 3, return the sum of all the elements.
sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7

author LZ-FSDev
see https://codingbat.com/prob/p191645
'''

def sum3(nums):
    total = 0
    for i in range(0, len(nums)):
        total += nums[i]
    return total

array1 = [1, 2, 3]
array2 = [5, 11, 2]
array3 = [7, 0, 0]

print("sum3(" + str(array1) + ") -> " + str(sum3(array1)))
print("sum3(" + str(array2) + ") -> " + str(sum3(array2)))
print("sum3(" + str(array3) + ") -> " + str(sum3(array3)))
