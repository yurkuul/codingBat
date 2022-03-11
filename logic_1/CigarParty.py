'''
When squirrels get together for a party, they like to have cigars. A squirrel
party is successful when the number of cigars is between 40 and 60, inclusive.
Unless it is the weekend, in which case there is no upper bound on the number
of cigars. Return True if the party with the given values is successful, or
False otherwise.
cigar_party(30, False) → False
cigar_party(50, False) → True
cigar_party(70, True) → True

@author LZ-FSDev
@see https://codingbat.com/prob/p195669
@since 3.10.2
@version 0.0.1
'''

def cigar_party(cigars, is_weekend):
    if is_weekend:
        return cigars >= 40
    return cigars >= 40 and cigars <=60

print("cigar_party(30, False) -> " + str(cigar_party(30, False)))
print("cigar_party(50, False) -> " + str(cigar_party(50, False)))
print("cigar_party(70, True) -> " + str(cigar_party(70, True)))
