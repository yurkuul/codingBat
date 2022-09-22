'''
Return the sum of the numbers in the array, except ignore sections of numbers
starting with a 6 and extending to the next 7 (every 6 will be followed by at
least one 7). Return 0 for no numbers.
sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4

author LZ-FSDev
see https://codingbat.com/prob/p108886
'''

def sum67(nums):
    index = 0
    total = 0
    inBetween = False
    while (index < len(nums)):
        if (nums[index] == 6):
            inBetween = True
        if (not inBetween):
            total += nums[index]
        if (nums[index] == 7):
            inBetween = False
        index += 1
    return total

array1 = [1, 2, 2]
array2 = [1, 2, 2, 6, 99, 99, 7]
array3 = [1, 1, 6, 7, 2]
array4 = [6, 1, 6, 2, 6, 7]
array5 = [10, 6, 7, 10, 22, 7]

print("sum67(" + str(array1) + ") -> " + str(sum67(array1)))
print("sum67(" + str(array2) + ") -> " + str(sum67(array2)))
print("sum67(" + str(array3) + ") -> " + str(sum67(array3)))
print("sum67(" + str(array4) + ") -> " + str(sum67(array4)))
print("sum67(" + str(array5) + ") -> " + str(sum67(array5)))
