'''
Given 2 int arrays, a and b, each length 3, return a new array length 2
containing their middle elements.
middle_way([1, 2, 3], [4, 5, 6]) → [2, 5]
middle_way([7, 7, 7], [3, 8, 0]) → [7, 8]
middle_way([5, 2, 9], [1, 4, 5]) → [2, 4]

author LZ-FSDev
see https://codingbat.com/prob/p171011
'''

def middle_way(a, b):
    array = [a[int(len(a)/2)], b[int(len(b)/2)]]
    return array

array1 = [1, 2, 3]
array2 = [4, 5, 6]
array3 = [7, 7, 7]
array4 = [3, 8, 0]
array5 = [5, 2, 9]
array6 = [1, 4, 5]

print("middle_way(" + str(array1) + ", " + str(array2) + ") -> " \
         + str(middle_way(array1, array2)))
print("middle_way(" + str(array3) + ", " + str(array4) + ") -> " \
         + str(middle_way(array3, array4)))
print("middle_way(" + str(array5) + ", " + str(array6) + ") -> " \
         + str(middle_way(array5, array6)))
