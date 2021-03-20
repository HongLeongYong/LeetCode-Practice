# Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
# determine if the input string is valid.

class Solution:
    def isValid(self, s: str):
        while "()" in s or "{}" in s or '[]' in s:
            s = s.replace("()", "").replace('{}', "").replace('[]', "")
        return s == ''
    
    def isValid2(self, s: str) -> bool:
        if len(s) % 2 != 0: return False
        pairs = {'(': ')', '[': ']', '{': '}'}
        stack = []
        for ch in s:
           if ch in pairs:
                stack.append(ch)
            else: 
                if not stack:
                    return False
                else:
                    if ch != pairs[stack.pop()]:
                        return False
        return not stack
        

s = Solution()
print(s.isValid2("()"))
    
