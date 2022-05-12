'''
Return the number of even ints in the given array. Note: the % "mod" operator
computes the remainder, e.g. 5 % 2 is 1.
count_evens([2, 1, 2, 3, 4]) → 3
count_evens([2, 2, 0]) → 3
count_evens([1, 3, 5]) → 0

author LZ-FSDev
see https://codingbat.com/prob/p189616
'''

def count_evens(nums):
    count = 0
    for i in range(len(nums)):
        if (nums[i] % 2 == 0):
            count = count + 1
    return count

array1 = [2, 1, 2, 3, 4]
array2 = [2, 2, 0]
array3 = [1, 3, 5]

print("count_evens(" + str(array1) + ") -> " + str(count_evens(array1)))
print("count_evens(" + str(array2) + ") -> " + str(count_evens(array2)))
print("count_evens(" + str(array3) + ") -> " + str(count_evens(array3)))
