'''
Given two strings, return True if either of the strings appears at the very end
of the other string, ignoring upper/lower case differences (in other words, the
computation should not be "case sensitive"). Note: s.lower() returns the
lowercase version of a string.
end_other('Hiabc', 'abc') → True
end_other('AbC', 'HiaBc') → True
end_other('abc', 'abXabc') → True
'''

def end_other(a, b):
    return (a.lower().endswith(b.lower())) or  b.lower().endswith(a.lower())
    
print("end_other('ab', 'ab12') -> " + str(end_other('ab', 'ab12')))
print("end_other('Hiabc', 'abc') -> " + str(end_other('Hiabc', 'abc')))
print("end_other('AbC', 'HiaBc') -> " + str(end_other('AbC', 'HiaBc')))
print("end_other('abc', 'abXabc') -> " + str(end_other('abc', 'abXabc')))
print("end_other('AbC', 'HiaBc') -> " + str(end_other('AbC', 'HiaBc')))
print("end_other('Z', '12xz') -> " + str(end_other('Z', '12xz')))
print("end_other('ab', 'ab12') -> " + str(end_other('ab', 'ab12')))
