'''
Given 2 strings, a and b, return a string of the form short+long+short, with
the shorter string on the outside and the longer string on the inside. The
strings will not be the same length, but they may be empty (length 0).
combo_string('Hello', 'hi') → 'hiHellohi'
combo_string('hi', 'Hello') → 'hiHellohi'
combo_string('aaa', 'b') → 'baaab'
'''

def combo_string(a, b):
    if (len(a) > len(b)):
        return b + a + b
    return a + b + a

print("combo_string('Hello', 'hi') -> " + str(combo_string('Hello', 'hi')))
print("combo_string('hi', 'Hello') -> " + str(combo_string('hi', 'Hello')))
print("combo_string('aaa', 'b') -> " + str(combo_string('aaa', 'b')))
print("combo_string('owo', '') -> " + str(combo_string('owo', '')))
print("combo_string('  ', 'space') -> " + str(combo_string('  ', 'space')))
