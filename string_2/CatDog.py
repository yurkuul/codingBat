'''
Return True if the string "cat" and "dog" appear the same number of times in
the given string.
cat_dog('catdog') → True
cat_dog('catcat') → False
cat_dog('1cat1cadodog') → True

@author LZ-FSDev
@see https://codingbat.com/prob/p164876
@since 3.10.2
@version 0.0.1
'''

def cat_dog(str):
    dog = 0
    cat = 0
    for i in range(len(str)-2):
        if (str[i:i+3] == "dog"):
            dog = dog + 1
        elif (str[i:i+3] == "cat"):
            cat = cat + 1
    return cat == dog

print("cat_dog('catdog') -> " + str(cat_dog('catdog')))
print("cat_dog('catcat') -> " + str(cat_dog('catcat')))
print("cat_dog('1cat1cadodog') -> " + str(cat_dog('1cat1cadodog')))
