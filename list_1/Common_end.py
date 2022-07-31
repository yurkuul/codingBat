'''
Given 2 arrays of ints, a and b, return True if they have the same first
element or they have the same last element. Both arrays will be length 1 or
more.


common_end([1, 2, 3], [7, 3]) → True
common_end([1, 2, 3], [7, 3, 2]) → False
common_end([1, 2, 3], [1, 3]) → True
'''

def common_end(a, b):
    return a[0] == b[0] or a[len(a)-1] == b[len(b)-1]

array1 = [1, 2, 3]
array2 = [7, 3]
array3 = [7, 3, 2]
array4 = [1, 3]
array5 = [9, 5, 2]

print("common_end(" + str(array1) + ", " + str(array2) + ") -> " \
    + str(common_end(array1, array2)))
print("common_end(" + str(array1) + ", " + str(array3) + ") -> " \
    + str(common_end(array1, array3)))
print("common_end(" + str(array1) + ", " + str(array4) + ") -> " \
    + str(common_end(array1, array4)))
print("common_end(" + str(array1) + ", " + str(array5) + ") -> " \
    + str(common_end(array1, array5)))
