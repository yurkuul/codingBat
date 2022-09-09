'''
Return the "centered" average of an array of ints, which we'll say is the mean
average of the values, except ignoring the largest and smallest values in the
array. If there are multiple copies of the smallest value, ignore just one
copy, and likewise for the largest value. Use int division to produce the final
average. You may assume that the array is length 3 or more.

centered_average([1, 2, 3, 4, 100]) → 3
centered_average([1, 1, 5, 5, 10, 8, 7]) → 5
centered_average([-10, -4, -2, -4, -2, 0]) → -3

author LZ-FSDev
see https://codingbat.com/prob/p126968
'''

def centered_average(nums):
    total = 0
    nums.sort()
    for i in range (1, len(nums)-1):
        total += nums[i]  
    return int(total/(len(nums)-2))

array1 = [1, 2, 3, 4, 100]
array2 = [1, 1, 5, 5, 10, 8, 7]
array3 = [-10, -4, -2, -4, -2, 0]
array4 = [0, 0, 0, 0, 1]
array5 = [7, 7, 7, 7]

print("centered_average(" + str(array1) + ") -> " \
    + str(centered_average(array1)))
print("centered_average(" + str(array2) + ") -> " \
    + str(centered_average(array2)))
print("centered_average(" + str(array3) + ") -> " \
    + str(centered_average(array3)))
print("centered_average(" + str(array4) + ") -> " \
    + str(centered_average(array4)))
print("centered_average(" + str(array5) + ") -> " \
    + str(centered_average(array5)))
