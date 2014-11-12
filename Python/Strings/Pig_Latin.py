'''
Created on 12 Nov 2014

@author: sraone
'''
import re

class Pig_Latin(object):
    '''
    classdocs
    '''
   
    def convert(self,word):
        for letter in word:
            if letter in ['a','e','i','o','u']:
                break 
        
        index = word.index(letter)
        return word[index:] + word[:index] + 'ay'
        
    
if __name__ == '__main__':
    PL = Pig_Latin()
    print(PL.convert('happy'))
    
    
        
        
        