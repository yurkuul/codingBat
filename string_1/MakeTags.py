'''
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic
text. In this example, the "i" tag makes <i> and </i> which surround the word
"Yay". Given tag and word strings, create the HTML string with tags around the
word, e.g. "<i>Yay</i>".
make_tags('i', 'Yay') → '<i>Yay</i>'
make_tags('i', 'Hello') → '<i>Hello</i>'
make_tags('cite', 'Yay') → '<cite>Yay</cite>'

@author LZ-FSDev
@see https://codingbat.com/prob/p132290
@since 3.10.2
@version 0.0.2
'''

def make_tags(tag, word):
    return "<" + tag + ">" + word + "</" + tag + ">"

print("make_tags('i', 'Yay') -> " + str(make_tags('i', 'Yay')))
print("make_tags('i', 'Hello') -> " + str(make_tags('i', 'Hello')))
print("make_tags('cite', 'Yay') -> " + str(make_tags('cite', 'Yay')))
print("make_tags('<<', 'test') -> " + str(make_tags('<<', 'test')))
print("make_tags('~', '(._.)') -> " + str(make_tags('~', '(._.)')))
