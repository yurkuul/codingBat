'''
Return the number of times that the string "code" appears anywhere in the given
string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
count_code('aaacodebbb') → 1
count_code('codexxcode') → 2
count_code('cozexxcope') → 2
'''

def count_code(str):
    counter = 0
    for i in range (len(str)-3):
        section = str[i:i+2]
        if section == "co" and str[i+3:i+4] == "e":
            counter = counter + 1
    return counter

print("count_code('aaacodebbb') -> " + str(count_code('aaacodebbb')))
print("count_code('codexxcode') -> " + str(count_code('codexxcode')))
print("count_code('cozexxcope') -> " + str(count_code('cozexxcope')))
