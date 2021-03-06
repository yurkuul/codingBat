'''
Return the sum of the numbers in the array, returning 0 for an empty array.
Except the number 13 is very unlucky, so it does not count and numbers that
come immediately after a 13 also do not count.
sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6

author LZ-FSDev
see https://codingbat.com/prob/p167025
'''

def sum13(nums):
    total = 0
    index = 0
    while (index < len(nums)):
        if (nums[index] != 13):
            total += nums[index]
        else:
            index += 1
        index += 1
    return total
    

array1 = [1, 2, 2, 1]
array2 = [1, 1]
array3 = [1, 2, 2, 1, 13]

print("sum13(" + str(array1) + ") -> " + str(sum13(array1)))
print("sum13(" + str(array2) + ") -> " + str(sum13(array2)))
print("sum13(" + str(array3) + ") -> " + str(sum13(array3)))
