'''
You are driving a little too fast, and a police officer stops you. Write code
to compute the result, encoded as an int value: 0=no ticket, 1=small ticket,
2=big ticket. If speed is 60 or less, the result is 0. If speed is between 61
and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2.
Unless it is your birthday -- on that day, your speed can be 5 higher in all
cases.
caught_speeding(60, False) → 0
caught_speeding(65, False) → 1
caught_speeding(65, True) → 0

@author LZ-FSDev
@see https://codingbat.com/prob/p137202
@since 3.10.2
@version 0.0.1
'''

def caught_speeding(speed, is_birthday):
    multiplier = 0
    if is_birthday:
        multiplier = 5
    if speed >= 61 + multiplier and speed <= 80 + multiplier:
        return 1
    elif speed >= 81 + multiplier:
        return 2
    return 0

print("caught_speeding(60, False) -> " + str(caught_speeding(60, False)))
print("caught_speeding(65, False) -> " + str(caught_speeding(65, False)))
print("caught_speeding(65, True) -> " + str(caught_speeding(65, True)))
