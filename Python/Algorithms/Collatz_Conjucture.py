'''Collatz Conjecture.

Start with a number n > 1. 
Find the number of steps it takes to reach one using the following process: 
    If n is even, divide it by 2. 
    If n is odd, multiply it by 3 and add 1.
    
This programs gives total steps including the final step that reached for 1
Created on 12 Nov 2014

@author: sraone
'''

class Collatz_Conjucture(object):
    
    def _is_even(self, num):
        return True if num % 2 == 0 else False
    
    def add_magic(self, num):
        if self._is_even(num):
#             Divide by 2
            return num / 2
            
        else:
#             Mul by 3 and add 1
            return (num * 3) + 1
        
    def Conjucture(self, num):
        steps = 1
        while(num != 1):
            num = self.add_magic(num)
            steps += 1
        else : return steps
            
        
        
if __name__ == '__main__':
    CC = Collatz_Conjucture()
    print(CC.Conjucture(27))
