'''
Given an int n, return the absolute difference between n and 21, except return
double the absolute difference if n is over 21.
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
'''

def diff21(n):
  if n > 21:
    return (n-21)*2
  return 21-n

print("diff21(19) -> " + str(diff21(19)))
print("diff21(10) -> " + str(diff21(10)))
print("diff21(21) -> " + str(diff21(21)))
print("diff21(30) -> " + str(diff21(30)))
print("diff21(0) -> " + str(diff21(0)))
