'''
Given an array of ints length 3, return an array with the elements "rotated
left" so {1, 2, 3} yields {2, 3, 1}.

rotate_left3([1, 2, 3]) → [2, 3, 1]
rotate_left3([5, 11, 9]) → [11, 9, 5]
rotate_left3([7, 0, 0]) → [0, 0, 7]

author LZ-FSDev
see https://codingbat.com/prob/p148661
'''

def rotate_left3(nums):
    nums[0:len(nums)] = [nums[1], nums[2], nums[0]]
    return nums

array1 = [1, 2, 3]
array2 = [5, 11, 9]
array3 = [7, 0, 0]
array4 = [5, 2, 8]
array5 = [0, 0, 1]

print("rotate_left3(" + str(array1) + ") -> " + str(rotate_left3(array1)))
print("rotate_left3(" + str(array2) + ") -> " + str(rotate_left3(array2)))
print("rotate_left3(" + str(array3) + ") -> " + str(rotate_left3(array3)))
print("rotate_left3(" + str(array4) + ") -> " + str(rotate_left3(array4)))
print("rotate_left3(" + str(array5) + ") -> " + str(rotate_left3(array5)))
